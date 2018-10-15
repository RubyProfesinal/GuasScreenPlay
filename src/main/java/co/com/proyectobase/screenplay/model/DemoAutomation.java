package co.com.proyectobase.screenplay.model;

public class DemoAutomation {
	
	private final String nombre; 

	public DemoAutomation(DemoBuilder builder) {
			this.nombre = builder.getNombre();
	}
	
	public String getNombre() {
		return nombre;
	}

}
