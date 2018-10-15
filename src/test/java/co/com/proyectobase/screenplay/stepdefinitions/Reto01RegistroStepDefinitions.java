package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static co.com.proyectobase.screenplay.tasks.DiligenciarDemoAutomation.laSiguienteInfo;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.ElTextoDemoAutomation;
import co.com.proyectobase.screenplay.tasks.DiligenciarDemoAutomation;
import co.com.proyectobase.screenplay.tasks.IngresarDemoAutomation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.vavr.collection.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class Reto01RegistroStepDefinitions {
	

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void  configuracionInicial()
	{
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Given("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception {
	  carlos.wasAbleTo(IngresarDemoAutomation.PaginaDemoAutomation()); 
	}


	@When("^el realiza el registro en la pagina$")
	public void elRealizaElRegistroEnLaPagina(List<String> dtDatos) throws Exception {
	//	carlos.attemptsTo(DiligenciarDemoAutomation.laSiguienteInfo(nombre(dtDatos.get(0)).build()));
		
				
	}

	
	@Then("^El verifica que se carga la pantalla con texto(.*)$")
	public void elVerificaQueSeCargaLaPantallaConTexto(String texto) throws Exception {
		carlos.should(seeThat(ElTextoDemoAutomation.es( ),equalTo(texto)));
	}

}
