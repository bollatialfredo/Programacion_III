
public class Pila {
	private Lista lista = new Lista();
	
	public Pila(){
		
	}
	public int verTope(){
		if(!lista.vacio()){
			return lista.elementoEnPos(0);
		}
		return -1;
	}
	public void apilar(int v){
		lista.agregar(v);
	}
	
//	public void imprimir(){
//		int [] arr = lista.valores();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(lista.elementoEnPos(i)+ " ");
//		}
//		System.out.println();
//	}
	
	public int desapilar(){
		if(!lista.vacio()){
			int val = lista.elementoEnPos(0);
			lista.eliminar(0);
			return val;
		}
		return -1;
	}
	public boolean estaVacia(){
		return lista.vacio();
	}
}
