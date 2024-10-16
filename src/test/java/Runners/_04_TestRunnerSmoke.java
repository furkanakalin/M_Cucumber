package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},//buraya feature files'ın path'i
        glue = {"StepDefinitions"} //buraya Stepdefinition'ın klasör adı yazılır

)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {

}