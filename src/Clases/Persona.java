package Clases;

public abstract class Persona {
	
	private String nombre, rut, direccion, comuna;
	private int telefono;
	
	/*********************** CONSTRUCTOR *****************************/
	public Persona (String rut, String nombre, String direccion, int telefono, String comuna)
	{
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.comuna = comuna;
	}
	
	/********************* SETTERS AND GETTERS ***********************/
	public void set_rut (String rut)
	{
		
		this.rut = rut;
	}
	
	public String get_rut ()
	{
		return rut;
	}
	
	public String get_comuna ()
	{
		return comuna;
	}
	public void set_nombre (String nombre)
	{
		this.nombre = nombre;
		
	}
	public void set_comuna (String comuna)
	{
		this.comuna = comuna;
		
	}
	public String get_nombre ()
	{
		return nombre;
	}
	
	public String get_direccion ()
	{
		return direccion;
	}
	
	public void set_direccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	public int get_telefono ()
	{
		return telefono;
	}
	public void set_telefono(int telefono)
	{
		this.telefono = telefono; 
	}
	
	


	

}
