
public class Simulador {
	public static void main(String[] args) {
		Pila pila = new Pila();
		
		System.out.println("Pila vacia: " + pila.estaVacia());
		
		System.out.println("//////////////////////////////////////////////////////////////");
		
		System.out.println("Agregamos 12 a la pila.");
		pila.apilar(12);
		
		System.out.println("Agregamos 5 a la pila.");
		pila.apilar(5);
		
		System.out.println("Agregamos 45 a la pila.");
		pila.apilar(45);
		
		System.out.println("Agregamos 34 a la pila.");
		pila.apilar(34);
		
		System.out.println("Agregamos 67 a la pila.");
		pila.apilar(67);
		
		System.out.println("//////////////////////////////////////////////////////////////");
		
		System.out.println("Tope de pila: " + pila.verTope());
		
		System.out.println("Desapilamos: " + pila.desapilar());

		System.out.println("Tope de pila: " + pila.verTope());

		System.out.println("//////////////////////////////////////////////////////////////");
		
		System.out.println("Agregamos 103 a la pila.");
		
		pila.apilar(103);

		System.out.println("//////////////////////////////////////////////////////////////");
		
		System.out.println("Tope de pila: " + pila.verTope());
		
		System.out.println("Desapilamos: " + pila.desapilar());

		System.out.println("Tope de pila: " + pila.verTope());

		System.out.println("//////////////////////////////////////////////////////////////");
		
		System.out.println("Desapilamos: " + pila.desapilar());

		System.out.println("Tope de pila: " + pila.verTope());

		System.out.println("//////////////////////////////////////////////////////////////");
				
		System.out.println("Pila vacia: " + pila.estaVacia());
	}
}
