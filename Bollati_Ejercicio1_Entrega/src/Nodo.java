
public class Nodo {
	private Nodo siguiente;
	private int valor;
	
	public Nodo(int v){
		valor = v;
	}
	
	public int getValor(){
		return valor;
	}
	
	public void setSiguiente(Nodo n){
		siguiente = n;
	}
	public Nodo getSiguiente(){
		return siguiente;
	}
}
