package com.transport.simulator;

import java.io.IOException;
import java.util.Scanner;

import com.transport.simulator.models.JourneySimulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Written for the Microservices course, this is a toy application which simulates the progress
 * of vehicles on a delivery route. The program reads from one or more text files containing
 * a list of lat/long positions (these can be created from .gpx files or similar).
 * <p>
 * Messages are then sent on to a queue (currently hardcoded as positionQueue - to be fixed on
 * the course!)
 * <p>
 * Intended for use on the training videos, questions to contact@virtualpairprogrammers.com
 */

/**
 * @author Chaklader on 2020-01-07
 */
@SpringBootApplication
public class PositionsimulatorApplication {



    public static void main(String[] args) throws IOException, InterruptedException {

        ConfigurableApplicationContext ctx = SpringApplication.run(PositionsimulatorApplication.class);

        try {
            final JourneySimulator simulator = ctx.getBean(JourneySimulator.class);

            Thread mainThread = new Thread(simulator);
            mainThread.start();

            System.out.println("Press return to terminate the simulation.");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            sc.close();

            // try with resources will automatically close the container.
            simulator.finish();
        }

        //
        catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }
}

