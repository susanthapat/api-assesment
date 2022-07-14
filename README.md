# *==API-Assesment==*
This repository is a repository for assurity API assessment. 

# *Pre-Request to run the automation script :*
**1.** Download and setup JAVA 1.11 [here](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html).

**2.** Download and setup Maven [here](https://maven.apache.org/download.cgi).


**3.** Download and install Eclipse IDE [here](https://www.eclipse.org/downloads/packages/release/2022-06/r/eclipse-ide-java-developers).

**4.** Add "TestNG" plugin for Eclipse IDE [here](https://marketplace.eclipse.org/content/testng-eclipse).

**5.** Clone automation script from the repository. 

( git clone -b main git@github.com:susanthapat/api-assessment.git ) 

or 

(git clone -b main https://github.com/susanthapat/api-assessment.git).

**6.** Import automation script as Maven project in eclipse.


# *Executing automation script :*


**Method 1 :**

**a.** Go to "TestCategoryAPI.java" class.

**b.** select method name of "validateCategoryDetails()" test method.

**c.** Right click on it.

**d.** select "Run as -> TestNg Test" as an option from the pop-up menu.




**Method 2:**


**a.** Go inside the "api-assessment" folder after cloning the repository

**b.** Open the terminal in Linux and mac or command prompt in windows.

**c.** run "mvn clean test" to run the script






# *Test output :*

**Emailable Report :**

**a.** Check "api-assessment/target/surefire-reports/emailable-report.html" for the emailable report.

**b.** click on  "emailable-report.html" for allure report files.

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://github.com/susanthapat/api-assessment/blob/dev/images/Emailable Report.png">
  <source media="(prefers-color-scheme: light)" srcset="https://github.com/susanthapat/api-assessment/blob/dev/images/Emailable Report.png">
    <img alt="Shows an illustrated sun in light color mode and a moon with stars in dark color mode." src="https://github.com/susanthapat/api-assessment/blob/dev/images/Emailable Report.png">
</picture>


**Allure Report :**

**a.**
**.** Go to the base folder.

**c.** Open a command prompt or terminal

**d.** Run "allure serve target/allure-results/" command

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://github.com/susanthapat/api-assessment/blob/dev/images/Allure Report.png">
  <source media="(prefers-color-scheme: light)" srcset="https://github.com/susanthapat/api-assessment/blob/dev/images/Allure Report.png">
    <img alt="Shows an illustrated sun in light color mode and a moon with stars in dark color mode." src="https://github.com/susanthapat/api-assessment/blob/dev/images/Allure Report.png">
</picture>



**Logs:**

The execution log generates and saves information about executions.

a. this is available at "api-assessment/logs"

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://github.com/susanthapat/api-assessment/blob/dev/images/Execution Log.png">
  <source media="(prefers-color-scheme: light)" srcset="https://github.com/susanthapat/api-assessment/blob/dev/images/Execution Log.png">
    <img alt="Shows an illustrated sun in light color mode and a moon with stars in dark color mode." src="https://github.com/susanthapat/api-assessment/blob/dev/images/Execution Log.png">
</picture>
