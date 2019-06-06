###Cucumber Behaviour Driven Development with Page Object Model Framework using Selenium with Java, JUnit, Maven

## Installation and System Requirement Guide

1.Windows 7 or higher Operating System
2. Chrome Browser must be installed into your system
3. Install JAVA SDK8
2. Install latest version of Eclipse and Selenium 
3. Install Maven 3.6.1 into Eclipse
4. Install Cucumber plugin into Eclipse
5. Install Natural plugin for cucumber into Eclipse
6. Install Git in your windows
8. Open C:\ and right click inside the folder and select GIT BASH Here
9. This will open a command prompt window.
10. Write clone https://github.com/mitalKarkar/JustEatBDD_Framework and press ENTER.
11. This will save the project folder JustEatBDD_Framework into C:\.
12. Edit file path where applicable in TestRunner.java and TestBase.java .



## Test Directions

1. Import JustEatBDD_Framework into your Eclipse
2. Inside JustEatBDD_Framework project, click on src/test/java
3. open "com.qa.justEatUK.Runner" package
4. Right Click on "TestRunner.java" and Run As JUnit Test. 
This will run all three scenarios. This will also quit your browser. 
5. To see the generated test reports, refresh the project and right click on test-output folder. 
6. Copy the path of index.html file and paste it into your webbrowser to see the generated test report. 

## Project Explaination

This project is developed using BDD Framework integrated with Page Object Model Framework. 
I have used maven to download dependencies. All the depencies are written into pom.xml file. 
First of all I wrote all the scenarios into just-eat.feature file.
Then, I have done one to one mapping between feature file and step defination file for every scenarios. 
Then, I have created a TestRunner class to bind feature file and step defination file and to generate html, Json and Junit outputs. 
I have created config.properties file to store data.
I have seprated page files (HomePage.java and RestaurantListPage.java) to create Page Factory for all Web Elements.
TestBase.java class contains initialization of browser, maximize browser window, delete browser cookies, implicit wait timeout and page load timeout.
TestUtil.java file is created for variable initialization purpose.

