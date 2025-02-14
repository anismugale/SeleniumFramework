# QA Automation

This repository contains QA automation for Web. It uses Selenium, via a local Chrome Driver or 
a Remote Driver that connects to a Selenium Grid.

## Running Java and Maven on host

To run the test on host you'll need to install Java (11+) and Maven. For this reason it's not recommended
unless you know what you're doing. Once you've installed Java, Maven and possibly the Chrome Driver, run test as above.

## Running using your host Chrome installation

To run tests against your host Chrome Browser you'll need to download the latest 
[Chrome Driver](https://chromedriver.chromium.org/downloads) for your platform. If you're running on Linux or 
Mac, ensure the Driver is executable.  

Specify the Chrome Dri`ver when running the test.

```shell script
mvn test -DconfigPath=./env/config.properties -Dwebdriver.chrome.driver=./driver/chromedriver.exe 
```
- To Run on a specific environment. Add a property file under `env` folder. Command to run specific env: `-DconfigPath=./env/{environment_name}.properties`
- Can group test cases using tag `@Tag(tag-name)`. Command to run a specific group of test cases: `-DGroups=GroupName`

## Reports

- Checkout the test results after execution of tests from the following reports.<br />
- Following are the reports with their location in the project directory.<br />
		- TestSuite.txt  (/target/surefire-reports/TestSuite.txt)<br />
		- Extent.html	 (/target/surefire-reports/Extent.html)<br />
		- index.html	 (/target/surefire-reports/index.html)<br />
