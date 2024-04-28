# Playwright parallel test execution template

## Description

this project is a template for playwright parallel execution tests

## Technologies Used

- Java SDK version 18
- Lombok
- Playwright
- Junit

## Installation and Setup

1. Clone this repository to your local machine.
2. Open the project in your chosen Java IDE.
3. Wait for the dependencies in the `pom.xml` file to be automatically installed.
## Configuration
Before running the tests, two files need to be configured:
* `dev.properties`: This file contains configurations specific for tests (including user passwords, database password, etc). User template file to see what needs to be configured

## Running Tests
### UI
To execute tests, follow these steps:
1. Navigate to the `test` directory inside your project.
2. You can run the tests in two ways:
    * To run all tests, right-click on the `test` directory and select `Run 'All Tests'`.
    * To run a specific test, navigate to it, right-click on the test file and click on `Run '<test_name>'`.

### Command Line
To run the tests from the command line, navigate to the project root in your terminal or command prompt and type the following maven command:
* `mvn clean compile test`

### sh script
You also may launch `runTest.sh` file from project root repository, it will execute all  tests automatically

