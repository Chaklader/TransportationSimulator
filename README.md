    
    
    
    
    SUMMARY 
        
        This repo is for visualizing the vehicles inside a transportation network based on the 
        micro-service network architechture. All the micro-service use Java, Spring boot, maven 
        built tool for the development. This for providing an example of how the micro-services
        can work colectively inside a clode eco-system. I don't belong the code but I refactored
        and re-write some part of it. 
        
    
    
            
            +--------------------------+                     +-------------------+
            |  Microservices Registry  |                     | Vehicle Simulator |
            +-----+----------------+--++                     +---------+---------+
                  ^                ^  ^                                |
                  |                |  |                                |
                  |                |  |                                |
                  |                |  |                                v
                  |                |  |                      +-------------------+
              Look up            Registers                   |     ActiveMQ      |
                  |                |  |                      +-------------------+
                  |                |  |                                ^
                  |                |  +----------------------+         |
                  |                |                         |         |
                  |                |                         |         |
             +----+----------------+----+                    ++--------+---------+
             | Transport Visualizer (FE)+-------------------> | Vehicle Tracking |
             +--------------------------+    REST call        +------------------+
        
                                    figure: Microservice architecture
                                    
                                    

    Start the ActiveMQ in the terminal: 
        
            $ brew services start activemq
            
    The login in the ActiveMQ server will be: 
        
            Username: admin
            Password: admin

    Reach the ActiveMQ dashboard in the local server:
        
            <http://localhost:8161/>            
        
    Run the microservices in the following orders
    
        1. Global config 
        2. Microservices registry
        3. Vehicle tracking 
        4. Trasportation visualizer 
        5. Transport simulator 
                                                    
      
    To run the micro-service, enter inside the respective repo and use the command
    from the terminal: 
    
        $ mvn spring-boot:run
        
        # This command will work too
        #$ mvn org.springframework.boot:spring-boot-maven-plugin:run
    
    
    
    The vehicles can be seen in the FE map:
    
        <http://localhost:8080/website/vehicles/vehicle/village_truck>        
  
