package Clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Distribuidora abastible = new Distribuidora();
		Cliente cliente = new Cliente("Hector Astorga", "19131492-1", "1 oriente 714", "viña del mar", 975796042);
		
		abastible.get_lista_clientes().agregar(cliente);
		
		for (abastible.get_lista_clientes().inicio(); !abastible.get_lista_clientes().finalLista(); abastible.get_lista_clientes().next())
		{
			Cliente customer = (Cliente) abastible.get_lista_clientes().elementoActual();
			System.out.println(customer.get_nombre());
		}
		
		

	}

}
