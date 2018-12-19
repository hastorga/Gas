package Clases;

import java.util.ArrayList;

public class Lista{

  private ArrayList <Object> objetos = new ArrayList<Object> ();
  private int actual = -1; //INDICE

  
  
  
  /**INSERTA ELEMENTO AL FINAL DE LA LISTA**/
  public boolean agregar(Object o) {
	  
      for (int i=0;i<objetos.size();i++)
      	if (objetos.get(i)==o)
      		return false;
      
      if(actual<0)actual++;
      objetos.add(o);
 
      return true;
  }

 /**ELIMINA ELEMENTO **/
  
  
  public boolean eliminar(Object o) {
      int i;
      if (objetos.size()>0)
	      for(i=0;i<objetos.size();i++)
			if (objetos.get(i)== o)
    	  	{
	            objetos.remove(i);
	    	  	actual--;
	            return true;
    	  	}
      
      return false;
  }
  

 /**INDICA SI 'ACTUAL' SE ENCUENTRA EN EL FINAL DE LA LISTA**/
  public boolean finalLista() {
    return actual == objetos.size();
  }
  
  /** 'ACTUAL' AVANZA UNA POSICION**/
  public void next()
  {
	  
	  if(actual < objetos.size())
		  actual++;
	  
  }
  
  /** POSICIONA 'ACTUAL' AL INICIO DE LA LISTA**/
  public void inicio() {
    if(objetos.size() > 0)
       actual = 0;
    
  }
  
  /** ELIMINA TODOS LOS ELEMENTOS DE LA LISTA **/
  public void vaciar() {
    
	  objetos.clear();
  }


 /** RETORNA ELEMENTO ALMACENADO EN  LA POSICION 'ACTUAL' **/
  public Object elementoActual() {
     if(actual>-1 )
       return objetos.get(actual);

     else return null;
  }
  
  
  public int largo() {
	  
	  return objetos.size();

     
  }
  

 
 /** RETORNA UN ARREGLO DE LOS OBJETOS DE LA LISTA **/
  public Object [] toArray(){
	Object[] arreglo = new Object [objetos.size()];
	for (int i=0; i<objetos.size();i++)
		arreglo[i] = objetos.get(i);
	return arreglo;
  }
  
  
  /** SE ESTABLECEN LAS ESTRATEGIAS PARA EL MOSTRADO POR PANTALLA **/
  

}
