package co.com.proyectobase.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://demo.automationtesting.in/")
public class DemoAutomationPage extends PageObject {
	
	public static final Target BTN_SKIP_SIGN_IN = Target.the("Botón de ingreso para quienes no estan registrados").located(By.id("btn2"));
	public static final Target BTN_REGISTER = Target.the("El botón para abrir formulario de registro").located(By.cssSelector("a[href='/Register']"));
	//public static final Target BTN_REGISTER = Target.the("El botón para abrir formulario de registro").located(By.cssSelector("a[href='/WebTable']"));
	public static final Target LABEL_NOMBRE = Target.the("Campo de texto para ingresar nombre").located(By.className("form-control ng-pristine ng-invalid ng-invalid-required.ng-touched"));
	public static final Target LABEL_APELLIDO = Target.the("Campo de texto para ingresar el apellido").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input"));
	public static final Target LABEL_DIRECCION = Target.the("Campo de texto para ingresar la dirección").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea"));

}
