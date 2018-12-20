package Clases;

public class Cliente extends Persona{

	private String ref_direccion;
	public Cliente(String rut,String nombre, String direccion,String comuna, int telefono) {
		super(nombre, rut, direccion, telefono, comuna);
		this.ref_direccion = "opcional";
	}
	
	public void set_referencia(String referencia) {
		this.ref_direccion = referencia;
	}
	public String get_referencia() {
		return ref_direccion;
	}

}
