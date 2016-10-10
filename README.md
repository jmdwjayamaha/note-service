# Note Service Demo Application

Pre-requisites:

 - Maven 3.x
 - Java 1.8 or above
 - MongoDB 3.x
 
Steps to build:

 - mvn clean install Or mvn package

Steps to Run:
 
 - Run the service on development time
 	mvn spring-boot:run

 - Run the created jar file
 	java -jar target/note-service-1.0-SNAPSHOT.jar
 
 - Check the health after starting:
     GET http://localhost:8080/health
 
 - Open the API Documentation - Swagger
     http://localhost:8080/swagger-ui.html

References:
 - Setup Maven
 
 
 - Install Java
 
 
 - MongoDB Installation 
