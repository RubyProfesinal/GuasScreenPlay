package co.com.proyectobase.screenplay.userinterface;


import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com/")
public class GoogleHomePage extends PageObject {
	
public static final Target BOTON_APLICACIONES = Target.the("El botón que muestra las aplicaciones").located(By.id("gbwa"));
public static final Target BOTON_GOOGLE_TRANSLATE = Target.the("El botón que muestra el cuadro de traducción").located(By.id("gb51"));

public static final Target BOTON_IDIOMA_ORIGEN = Target.the("El botón para seleccionar idioma original").located(By.id("gt-sl-gms"));
public static final Target IDIOMA_INGLES = Target.the("Seleccionar idioma ingles").located(By.xpath("//*[@id='gt-sl-gms-menu']/table/tbody//tr/td//div[contains(text(),'eng')]"));
public static final Target BOTON_IDIOMA_DESTINO = Target.the("El botón para seleccionar idioma destino").located(By.id("gt-tl-gms"));
public static final Target IDIOMA_ESPANOL = Target.the("Seleccionar idioma español").located(By.xpath("//*[@id='gt-tl-gms-menu']/table/tbody//tr/td//div[contains(text(),'spa')]"));
public static final Target AREA_TRADUCCION = Target.the("Ubicarse en el área de traducción").located(By.id("source"));
public static final Target BOTON_TRADUCIR = Target.the("Seleccionar idioma español").located(By.id("gt-submit"));
public static final Target AREA_TRADUCIDA = Target.the("Área con palabra traducida").located(By.id("gt-res-dir-ctr"));



}