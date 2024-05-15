// Expand for notes .....
//Cucumber

//Install Cucumber Eclipse plug in
//Latest eclipse have maven plug in installed by default
//Cucumber supports quick start template
//Need Maven skeleton/template : maven-archetype-quickstart

//keywords in cucumber : scenario, feature, feature file, scenario outline, step definition
//
//Gerkins language/syntax/keywords for test for standarisation
//its used for cucumber BDD framework
//
//feature : requirement
//
//given : preconditions
//when : describe the user action
//and : if there are multiple user actions
//then : expected result
//and : if there are multiple expected result
//but : -ve test results
//
//all tests have to be written in a feature file. The extension of the file is '.feature'
//code will be written in StepDefinition.java file 
//for using gherkin, we need to use a plugin which will help in formatting - Natural
//in help -> eclipse market place -> Search for cucumber and then install - Natural
//use maven for cucumber project skeleton : cucumber-java dependency
//we use cucumber-junit for unit testing [not junit !!] : cucumber-junit dependency, remove scope tag
//
//project will have 
//feature file : .feature file with all the scenarios in given,when,then gherkin format
//step definition : code for each step in feature file
//test runner : we give reference of feature file and corresponding step definition


// create 'features' package in test/java only as cucumber will otherwise give error
// create 'stepDefinations' package in test/java only as cucumber will otherwise give error

// to create functions in step definition we can use a extension in chrome - 'tidy gherkin'
// we can paste test in the app and select 'java steps' for corresponding methods

// if tidy gherkin extension is not available then we can simply run the test runner as junit and any missing step definitions will be displayed in the console

// if there is an additional space then thought the steps are same test will fail and prompt to write new method

package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations"
		)

public class TestRunner {

	// features : path of the package, we can further name of individual feature file
	// glue : path of the stepDefinitions package, we can further add the name of the stepDefiniiton file
	
}
