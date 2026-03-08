package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags = "@Smoke",
        monochrome = true,
        plugin = {"pretty"}
)
public class Runner {
}
