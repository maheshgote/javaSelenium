  
package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\mg22250\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Desktop\\Common\\Workspace\\javaSelenium\\Cucumtest\\src\\main\\java\\Feature\\login.feature", //the path of the feature files
			glue={"stepDefination"}, //the path of the step definition files
			//http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2427135format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			plugin= {"pretty"}
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
	 
	}


//	@RunWith(Cucumber.class)
//	@CucumberOptions(
//			features = "C:\\Users\\mg22250\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Desktop\\Common\\Workspace\\javaSelenium\\Cucumtest\\src\\main\\java\\Feature\\login.feature", //the path of the feature files
//			glue={"stepDefinitions"}, //the path of the step definition files
//			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
//			monochrome = true, //display the console output in a proper readable format
//			strict = true, //it will check if any step is not defined in step definition file
////			dryRhttp://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2427135un = false //to check the mapping is proper between feature file and step def file
//			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
//			)
//
//	public class TestRunner {
//	 
//	}