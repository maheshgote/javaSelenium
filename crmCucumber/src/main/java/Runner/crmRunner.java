package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mg22250\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Desktop\\Common\\Workspace\\javaSelenium\\crmCucumber\\src\\main\\java\\Feature\\login.feature",//path of feature files
		glue={"StepDefination"},//path of step definition file
		monochrome = true,//display the console output in a proper readable format
		strict = true,////it will check if any step is not defined in step definition file
		dryRun = false//to check the mapping is proper between feature file and step def file
		//tags = {"@tag1"}
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		
		)

public class crmRunner {
	
	

}
