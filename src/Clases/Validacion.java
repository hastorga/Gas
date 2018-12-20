package Clases;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Validacion {
	
	
	
	
	/** METODO QUE VERIFICA QUE UNA CADENA NO CONTENGA NUMEROS **/
	public boolean no_numerico (String cadena)
	{
		/** PRIMERO QUE NADA, LA CADENA NO DEBE ESTAR VAC�A **/
		    if (cadena != null && !cadena.isEmpty())
				for (char caracteres : cadena.toCharArray())
					if (Character.isDigit(caracteres))
						return false;

		    return true; /** SI NO HAY DIGITOS, ES VERDADERO **/
		 
	}
	
	public boolean esEnteroPositivo (int numero)
	{
		if (numero>0)
			return true;
		
	  return false;
	}
	
	
	/**SI EL CONTENIDO DE UN TEXTFIELD ES ENTERO (VALIDADO PREVIAMENTENTE),
	 * SE ANALIZA SI ESTE ES POSITIVO MAYOR A 0, DE SER AS� RETORNA TRUE  **/
	public boolean esEnteroPositivo (JTextField cajaTexto)
	{
		try 
		{
			int numero = Integer.parseInt(cajaTexto.getText().trim());
			if (numero>0)
				return true;
		}
		catch (Exception e)
		{
			
		}
		
		return false;	
		
	}
	
	
	/**INDICA SI EL CONTENIDO DE UN TEXTFIELD ES DE TIPO �INT� **/
	public boolean esEntero (JTextField cajaTexto)
	{
		try
		{
			Integer.parseInt(cajaTexto.getText().trim());
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	/**INDICA SI EL CONTENIDO DE UN TEXTFIELD ES DE TIPO �DOUBLE� **/
	public boolean esDouble (JTextField cajaTexto)
	{
		try
		{
			Double.parseDouble(cajaTexto.getText().trim());
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	
	/**VERIFICA SI UN TEXTFIELD TIENE CONTENIDO**/
	public boolean tieneContenido (JTextField cajaTexto)
	{
		if(cajaTexto.getText().trim().length()==0)
			return false;
		else
			return true;
		
	}
	
	/**VERIFICA SI UN PASSWORDFIELD TIENE CONTENIDO**/
	public boolean passConContenido (JPasswordField password)
	{
		
		char[] arrayC = password.getPassword(); 
		
		String pass = String.valueOf(arrayC); 
		
		if(pass.trim().length()==0)
			return false;
		else
			return true;
		
	}
	
	public boolean esDoublePositivo (JTextField cajaTexto)
	{
		
		try 
		{
			double numero = Double.parseDouble(cajaTexto.getText().trim());
			if (numero>0)
				return true;
		}
		catch (Exception e)
		{
			
		}
		
		return false;
		
		
	}
	
	public boolean es_cliente(Lista lista_clientes, String rut_ingresado)
	{
		for(lista_clientes.inicio(); !lista_clientes.finalLista(); lista_clientes.next())
		{
			Cliente customer = (Cliente) lista_clientes.elementoActual();
			if(customer.get_rut().trim().equals(rut_ingresado.trim()))
			{
				return true;
			}
		}
		return false;
	}
	public boolean existe_rut(Lista lista_clientes, Lista lista_trabajadores, String rut)
	{
		for(lista_clientes.inicio(); !lista_clientes.finalLista(); lista_clientes.next())
		{
			Cliente customer = (Cliente) lista_clientes.elementoActual();
			if(customer.get_rut().trim().equals(rut.trim()))
			{
				return true;
			}
		}
		
		for(lista_trabajadores.inicio(); !lista_trabajadores.finalLista(); lista_trabajadores.next() )
		{
			Trabajador worker = (Trabajador) lista_trabajadores.elementoActual();
			if(worker.get_rut().trim().equals(rut.trim()))
			{
				return true;
			}
			
		}
		
		return false;
	}
	
	
	


	

}
