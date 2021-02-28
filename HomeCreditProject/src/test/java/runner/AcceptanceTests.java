package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features="src/test/resources/features", 
glue = "steps",
plugin = {"pretty"}, //pretty, progress, rerun, usage
snippets = SnippetType.CAMELCASE,
tags = {"@RegisterLogin, @CreateNewAccount"}
//dryRun = false
)
public class AcceptanceTests {

}
