package Clases;

public abstract class Persona {
	
	private String nombre, rut, direccion;
	private int telefono;
	
	/*********************** CONSTRUCTOR *****************************/
	public Persona (String rut, String nombre, String direccion, int telefono)
	{
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
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
	public void set_nombre (String nombre)
	{
		this.nombre = nombre;
		
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
