package Clases;

public class Trabajador extends Persona {
	private String sector, patente_camioneta;

	public Trabajador(String rut, String nombre,String direccion, String comuna, int telefono, String sector, String patente) {
		
		super(nombre, rut, direccion, telefono,comuna);
		this.sector = sector;
		this.patente_camioneta = patente;
		
	}
	
	public String get_sector()
	{
		return sector;
	}
	public void set_sector (String sector)
	{
		this.sector = sector;
		
	}
	public String get_patente ()
	{
		return patente_camioneta;
	}
	
	public void set_patente (String patente)
	{
		this.patente_camioneta = patente;
	}
	


}
