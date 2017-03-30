
public class Simulador {
	public static void main(String[] args) {
		Pila pila = new Pila();
		System.out.println("Pila vacia: " + pila.estaVacia());
		
		pila.apilar(12);
		pila.apilar(5);
		pila.apilar(45);
		pila.apilar(34);
		pila.apilar(67);
		
		System.out.println("Tope de pila: " + pila.verTope());
		
		System.out.println("Desapilamos: " + pila.desapilar());
		
		System.out.println("Tope de pila: " + pila.verTope());
		
		System.out.println("Pila vacia: " + pila.estaVacia());
	}
}
