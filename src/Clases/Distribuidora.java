package Clases;

public class Distribuidora {
	
	private String nombre, comuna, calle; 
	private int telefono, numero_calle;
	private Lista lista_clientes;
	private Lista lista_trabajadores;
	
	public Distribuidora() {
		this.nombre = "Distribuidora Abastible";
		this.calle = "Jose Manuel Balmaceda";
		this.comuna = "Llay Llay";
		this.numero_calle = 473;
		this.telefono = 611498;
		lista_clientes = new Lista();
		lista_trabajadores = new Lista();
	}
	
	public String get_nombre() {
		return nombre;
	}
	
	public String get_calle() {
		return calle;
	}

	public String get_comuna() {
		return comuna;
	}
	
	public int get_num_calle() {
		return numero_calle;
	}
	
	public int get_telefono() {
		return telefono;
	}
	public Lista get_lista_clientes() {
		return lista_clientes;
	}
	public Lista get_lista_trabajadores() {
		return lista_trabajadores;
	}
	
	/**RETORNA UN CLIENTE SEGUN RUT**/
	public Cliente get_cliente(String rutSolicitado)
	{
		if (lista_clientes.largo() != 0)
		{
			for (lista_clientes.inicio(); !lista_clientes.finalLista(); lista_clientes.next())
				if (lista_clientes.elementoActual() instanceof Cliente)
				{
					Cliente cliente = (Cliente)lista_clientes.elementoActual();
					
					if( rutSolicitado.equals(cliente.get_rut()) )
					{
						return cliente;
					}
				}
		}
		return null;
	}
	
	/**RETORNA UN TRABAJADOR SEGUN RUT**/
	public Trabajador get_trabajador(String rutSolicitado)
	{
		if (lista_trabajadores.largo() != 0)
		{
			for (lista_trabajadores.inicio(); !lista_trabajadores.finalLista(); lista_trabajadores.next())
				if (lista_trabajadores.elementoActual() instanceof Trabajador)
				{
					Trabajador trabajador = (Trabajador)lista_trabajadores.elementoActual();
					
					if( rutSolicitado.equals(trabajador.get_rut()) )
					{
						return trabajador;
					}
				}
		}
		return null;
	}


}
