package co.com.proyectobase.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.proyectobase.screenplay.userinterface.DemoAutomationPage.LABEL_NOMBRE;

import co.com.proyectobase.screenplay.model.DemoAutomation;
import co.com.proyectobase.screenplay.model.DemoBuilder;
import co.com.proyectobase.screenplay.userinterface.DemoAutomationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciarDemoAutomation implements Task {

	public final DemoAutomation demoAutomation;

	public DiligenciarDemoAutomation(DemoAutomation demoAutomation) {
		this.demoAutomation = demoAutomation;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DemoAutomationPage.BTN_SKIP_SIGN_IN), Click.on(DemoAutomationPage.BTN_REGISTER),
				Enter.theValue(demoAutomation.getNombre()).into(LABEL_NOMBRE)
		// SelectFromOptions.byVisibleText(demoAutomation.getCity()).from(DemoAutomationPage.CITY)
		);

	}

	public static DiligenciarDemoAutomation laSiguienteInfo(DemoBuilder demoBuilder) {
		return instrumented(DiligenciarDemoAutomation.class, demoBuilder);
	}

}
