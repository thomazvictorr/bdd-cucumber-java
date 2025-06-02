import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE, // padrão de escrita Java
		dryRun = false, // valida mapeamento
		strict = false // tratamento dos passos
		)
public class Runner {

}
