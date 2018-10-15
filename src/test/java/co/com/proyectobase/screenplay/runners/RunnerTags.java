package co.com.proyectobase.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		//features="src/test/resources/features/myExtra.feature",
		//tags=" @CasoExitoso",
	    //features="src/test/resources/features/reto01Registro.feature",
		//tags=" @Registro",
	    features="src/test/resources/features/traductorGoogle.feature",
	    tags=" @Dinamico",
		//tags= "@Guia3",
		glue="co.com.proyectobase.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
