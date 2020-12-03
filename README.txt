************************NOTE******************************************
1. Following components should be installed and corresponding bin filepath should be added in Path variable in Environment Variables.
	a. Java jdk
	b. Maven

************************How to Build and Execute  the Project**********************************

Steps:

1. Download the project and extract the project.
2. Open cmd
3. Change the current directory to project folder using  'cd "Path"' command. ["Path" = Location of the project folder] 
4. Type "mvn clean" and hit enter.
5. Type "mvn test" and hit enter to execute test script.
6. To read the reports navigate to "/target/surefire-reports/emailable-report.html" in project folder.
7. Right-click "emailable-report.html" and select open-with->web browser



********************Project Structure*******************************
The Project uses Page Object Model approach.

				**High level overview of Project Structure**
a. base package- It contains generic methods used to perform action on a web element.
b. cases package - It has the test case for the exercise
c. maps package- It contains mapping of all the web elements according to each webpage.
d. pages package - It contains methods to access web elements from the maps.
e. test.xml - Contains parameters like browser,url required to executing the project.
f. pom.xml - It contains all the dependencies required to build the project.








