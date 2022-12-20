package cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/cucumber/test1.feature"},
        glue = {"cucumber"}

)
public class Runner extends AbstractTestNGCucumberTests {

}
