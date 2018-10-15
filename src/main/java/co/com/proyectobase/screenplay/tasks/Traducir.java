package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.GoogleHomePage;
import net.bytebuddy.asm.Advice.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Traducir implements Task {

	public Traducir(String palabra) {
		super();
		this.palabra = palabra;
	}

	private String palabra;

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_APLICACIONES));
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_GOOGLE_TRANSLATE));
		
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_IDIOMA_ORIGEN));
		actor.attemptsTo(Click.on(GoogleHomePage.IDIOMA_INGLES));
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_IDIOMA_DESTINO));
		actor.attemptsTo(Click.on(GoogleHomePage.IDIOMA_ESPANOL));	
		actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(palabra).into(GoogleHomePage.AREA_TRADUCCION));
		
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_TRADUCIR));
		
	}

	public static Traducir DeinglesAEspanolLa(String palabra) {
		return Tasks.instrumented(Traducir.class, palabra);

	}
}
