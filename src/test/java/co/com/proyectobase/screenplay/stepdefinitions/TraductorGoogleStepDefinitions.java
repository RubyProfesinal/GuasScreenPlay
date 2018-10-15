package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TraductorGoogleStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor usuario = Actor.named("usuario");
	
	@Before
	public void  configuracionInicial()
	{
		usuario.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^El usuario quiere usar el traductor de google$")
	public void elUsuarioQuiereUsarElTraductorDeGoogle() {
		usuario.wasAbleTo(Abrir.AlaPaginaDeGoogle());
	
	}


	@When("^traduce la palabra (.*) de Ingles a Espanol$")
	public void traduceLaPalabraTableDeInglesAEspañol(String palabra){
		usuario.attemptsTo(Traducir.DeinglesAEspanolLa(palabra));
	    
	}

	@Then("^El deberia ver la palabra (.*) en la pantalla$")
	public void elDeberiaVerLaPalabraMesaEnLaPantalla(String palabraEsperada) {
		usuario.should(seeThat(LaRespuesta.es( ),equalTo(palabraEsperada)));
	    
	}

}
