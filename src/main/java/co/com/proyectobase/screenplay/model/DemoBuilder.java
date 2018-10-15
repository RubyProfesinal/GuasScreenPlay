package co.com.proyectobase.screenplay.model;

public class DemoBuilder implements Builder<DemoAutomation> {
	
	private final String nombre; 
	//adicionar los demas campos
	
	public DemoBuilder (String nombre) {
		this.nombre = nombre;
		//Adicionar los demas campos
	}
	
	public static DemoBuilder nombre(String nombre) {
		return new DemoBuilder(nombre);
	}
	
	@Override
	public DemoAutomation build() {
		return new DemoAutomation(this);
	}
	
	public String getNombre() {
		return nombre;
	}

}
