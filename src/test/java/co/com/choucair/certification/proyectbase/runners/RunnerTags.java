package co.com.choucair.certification.proyectbase.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/academyChoucair.feature",
                            tags = "@stories",
                            glue = {"co.com.choucair.certification.proyectbase.stepdefinitions",
            "co.com.choucair.certification.proyectbase.model"},
                            snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTags  {
}
