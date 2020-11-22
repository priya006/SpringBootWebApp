# SpringBootWebApp
Spring  Boot Application

## Environment
1. IntelliJ IDEA Community Edition
2. Maven 3.2+
3. springframework

Create a Spring boot project using Maven as build tool in IntelliJ Community Edition
------------------------------------------------------------------------------------

1. Access  https://start.spring.io, and fill the fields like below
![Spring_boot](https://github.com/priya006/SpringBootWebApp/blob/master/Spring%20Initializer.png)
2. Now, add Spring manually. Select Create New Project in IntelliJ
3. Locate on the left side tab and select `Maven`
4. On the right side, select the `JDK` version and click next
5. In the next screen specify the `GroupId, ArtifactId and the Version`. As per the Step 2. Finally, pom.xml generated.

How to Run the Web Application
----------------------------
1. Run the class `Application` and go to browser and navigate to http://localhost:8080/
![SpringBoot](https://github.com/priya006/SpringBootWebApp/blob/master/SpringbootWebApp.png)
2. Run the curl command `curl localhost:8080` to see the response from the WebService

How to Run the Unit Test
------------------------
1. Run the class HelloControllerTest. The Class starts the application and testing is performed

Curl commands to fire when the application is running
------------------------------------------------------
**Pre-requisites:**

  - Add the dependency `spring-boot-starter-actuator` to pom.xml file
  - Add application.properties file in the path `src/main/resources`

1. Start the application and run the curl command `curl localhost:8080/actuator/health`
2. Shut down the web application execute the command `curl -X POST localhost:8080/actuator/shutdown`
 
How to enable other Endpoints
-----------------------------
1. I tried to enable `/actuator/beans` endpoint. Added a line `management.endpoints.web.exposure.include=beans` in `application.properties` file
2. Ran the webservice application.
3. Hit the api with the curl command `curl localhost:8080/actuator/beans`
![Beans](https://github.com/priya006/SpringBootWebApp/blob/master/SpringBoot_Beans.png)

---------------------------------------------------------------------------------------------------
## Reference
[Exposing Endpoints](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html#production-ready-endpoints-exposing-endpoints)