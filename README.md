# JBehave-RESTAPI demo code
Demo project using JBehave,JUnit,Jersey,Gradle for testing **webservices using JBehave**

This project was written using https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false URI

**Prerequisites**
1. Java 8 
2. Gradle latest
3. InteliJ IDEA / Eclipse IDE

**Package Structure**

|    |          |Package/Class name       | Description                                     |
|----|----------|--------------------------|-------------------------------------------------|
|main| Java     | com.example.api          | Contains classes related to response            |
|main|          | GetRequest Class         | Contains actual methods which calls webservice  |
|main|          | WebServiceDemo_steps.xml | Sprint file which initiate application context  |
|test| Java     | com.exmaple.steps        | Story definition                                |  
|test|          | WebServiceDemoStories    | Execution class                                 | 
|main| Resource | com.example.stories      | JBehave story file which describes the test case|



If you need to **import project** files to your IDE please run commands

gradle idea (for IDEA IDE) or
gradle eclipse (for Eclipse IDE)


**Build Project**

gradle clean build or use your IDE

**Test Execution**

1. Using JUnit
Right click on WebServiceDemoStories and run as JUnit test.

2. Using Gradle
Execute command "gradle test"

If you need further clarifications or enhancement requests on this project please contact me via email.

Cheers

Chamila Ambahera
chamila.ambahera@gmail.com
