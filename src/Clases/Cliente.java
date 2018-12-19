package Clases;

public class Cliente extends Persona{

	private String ref_direccion;
	public Cliente(String nombre, String rut, String direccion, String ref_direccion, int telefono) {
		super(nombre, rut, direccion, telefono);
		this.ref_direccion = ref_direccion;
	}
	
	public void set_referencia(String referencia) {
		this.ref_direccion = referencia;
	}
	public String get_referencia() {
		return ref_direccion;
	}

}
