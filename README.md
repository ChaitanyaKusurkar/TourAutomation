# TourAutomation

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






*********************Some More information on the test created***************************

1. How can this test be extended?
The test currently has a hardcoded value for set date.Due to timecrunch and issues with DOM rendering I hardcoded to book appointment
for December 10th,2020. So the date of the appointment can be randomized along with the time slot. currently I have made the test to select random time slot in the list.
Further The test can be extended to select bedroom options, select unit and type of tour.

2.How else could this feature be tested?
This feature caan be tested for different type of tour, Scheduling and rescheduling the tour, cancelling the tour,Cancelling/Rescheduling tour, checking the different integrations afer tour is successfully booked. Testing different options like Self-guided Tour, View Photos, Prices/Availability can also be considered. 

3.What assumptions did you make when writing this test?
One of the assumption I made in I need to book an inperson tour. Other Assumption I made was about the date of the tour.I assumed it to be December 10th.

4. How could this test be integrated into a CI/CD pipeline?
This test can be interated with CI/CD pipelines using Jenkins/ Octopus Deploy/ AZURE DevOps/ AWS. The testNG framework used in the building in project will allow easy integration for CI/CD.

5. Some of the Challenges I faced.
While writing the test I faced several not so difficult but tricky challenges.
	a. The Calender UI has 2 hidden div elements which makes it little tricky to get the exact date of current month. Also the size of the div containing the current month was much larger than the size of current month. I m not sure if that size is kept for showing 2 months at a time.
	b. The size of div holding the Schedule  a Tour button is almost double the size of button. I felt that was not required and it only made the automation test throw errors for element not found at certain position. 
	c. Also I felt lot of elements could use id attribute which will make them easily identifiable.
	