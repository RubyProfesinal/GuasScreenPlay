/*package co.com.proyectobase.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.tasks.AbrirMyExtra;
import co.com.proyectobase.screenplay.tasks.Loguearse;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MyExtraStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;
	private Actor  rafa= Actor.named("Rafa");
	
	@Before public void setup() {
		rafa.can(BrowseTheWeb.with(suNavegador));
	}
	
	
	@Given("^Ique Rafa desea realizar consultan en AS400, Rafa abre MyExtra$")
	public void iqueRafaDeseaRealizarConsultanEnASRafaAbreMyExtra(int arg1) throws Exception {
	   rafa.attemptsTo(AbrirMyExtra.myExtra());
	}


	@When("^el ingresa sus credenciales$")
	public void elIngresaSusCredenciales() throws Exception {
		rafa.attemptsTo(Loguearse.enMyExtra());
	   
	}

	@When("^navega en un menu$")
	public void navegaEnUnMenu() throws Exception {
	    
	}

	@Then("^verifica que inicio sesion correctamente$")
	public void verificaQueInicioSesionCorrectamente() throws Exception {
	    
	}


}*/
