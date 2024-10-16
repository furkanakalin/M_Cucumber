package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles"},//buraya feature files'ın path'i
        glue = {"StepDefinitions"} //buraya Stepdefinition'ın klasör adı yazılır

)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
