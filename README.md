
    
    ![1](https://github.com/Chaklader/TransportSimulationGlobalConfig/issues/2#issue-552240611)
         
         fig: Transportation Micro-service Architecture
         
    ![2](https://user-images.githubusercontent.com/1360249/72723102-1588fe00-3baa-11ea-8afa-72c0eeebad41.jpg)
             
             fig: Load Balancer with the Micro-services
             
    ![3](https://user-images.githubusercontent.com/1360249/72723123-246fb080-3baa-11ea-9632-0afb6e085e32.jpg)
             
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