#  API Challange

To run the tests from terminal use the commands below;

mvn site -DgenerateReports=false (In case static files(css, js, images) are not downloaded automatically.)

mvn surefire-report:report


Here is the link for API Test Repository:
https://github.com/gokcetuncay81/apichallange
And the reasons why did I need these dependencies in my project:

1- “slf4j-nop” For logging errors.

2- “rest-assured” For testing and validating REST services

3- “hamcrest-junit” For using matchers.

4- “jayway json-path” For parsing the Json.

5- “junit” As the testing framework.

6- “jackson-databind” For data-binding functionality and tree-model for Java.

There is the HelperMethods class, defining all of the handy java methods to be used from TestSuite. Most tricky method of this class is getComponentList since I need to get each componenet seperately to check analytics_name. Jayway implicitly converts a Json's part to LinkedHashMap so I used Jackson to covert it back to Json.

There is the RestUtil class which is responsible for all the actions about the Http calls.

ApiTests package keeps all the tests inside. All tests are written in different pages.
There is a BaseTestSuite class which is managing all before and after test actions, and also inherited by all other test classes.

And finally E2ETests class is managing all the other test classes in one suite.

Reporting is handled by surefire-report plugin by managing it inside pom.xml.




