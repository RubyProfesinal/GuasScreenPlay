package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.DemoAutomationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class IngresarDemoAutomation implements Task {
	
	private DemoAutomationPage  demoAutomationPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(demoAutomationPage));
		//actor.attemptsTo(Click.on(DemoAutomationPage.BTN_SKIP_SIGN_IN));
		
	}

	public static IngresarDemoAutomation PaginaDemoAutomation() {
		
		return Tasks.instrumented(IngresarDemoAutomation.class);
		
	}

}
