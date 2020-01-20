
    
    
    ![Transportation Micro-service Architecture](images/1.png)
         
         fig: Transportation Micro-service Architecture
         
    ![Load Balancer with the Micro-services](https://github.com/Chaklader/TransportationSimulator/blob/master/images/2.png)
             
             fig: Load Balancer with the Micro-services
             
    ![Load Balancer with the Micro-services](https://github.com/Chaklader/TransportationSimulator/blob/master/images/2.png)
             
             fig: Load Balancer with the Micro-services         
    
    
    
    Run the Spring Boot project:
    
        $ mvn spring-boot:run
        $ mvn org.springframework.boot:spring-boot-maven-plugin:run
    
    
    Start the ActiveMQ in the terminal: 
    
        $ brew services start activemq
    
    
    Stop the ActiveMQ in the terminal: 
        
        $ brew services stop activemq
        
        
    The login in the ActiveMQ server will be: 
    
        Username: admin
        Password: admin
        
        
    Run a Spring boot project from the command line: 
    
        $ mvn spring-boot:run

    Reach the ActiveMQ dashboard in the local server:
    
        <http://localhost:8161/>
        
        <http://localhost:8080//website/vehicles/list.html>