# Automation Testing Task 
The Task is separated into 4 testcases in two test suits.
HomepageTest : which includes
    -ValidateSearchbar:adding nad removing keywords
    -ValidateSearchbutton:searching on keywords
SearchPageTest : which includes
    -Numberofresults : Asserting that the number of results exist on the UI
    -ValidatenumberofresultsANDdiffrenrsuggestions : validate number of results on page 2 is equal to that page 3
     & validate different search suggestions at the end of the page.

## Installation
(The Project was made on IntelliJ IDE)
1.Import the project as a maven project.
2. In the project files go to src/main/java right click on the java folder and choose 
mark directory as Sources Root.
3.In the project files go to src/test/java right click on the java folder and choose 
mark directory as Test Sources Root.
4. The Dependencies are added to the pom.xml file 
you need to make sure to open pom.xml file 
and Click the Maven icon in the top-right 
to ensure that IntelliJ IDEA add the dependences and load the changes.

## Running
you just need to run the testing.xml file
