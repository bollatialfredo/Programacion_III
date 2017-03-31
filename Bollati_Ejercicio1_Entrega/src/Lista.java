
public class Lista {
	private Nodo raiz;
	private int indice = 0;
	
	public Lista(){
		
	}
	
	public void agregar(int v){
		if(raiz == null){
			raiz = new Nodo(v);
		}else{
			Nodo tmp =  new Nodo(v);
			tmp.setSiguiente(raiz);
			raiz = tmp;
		}
		indice++;
	}
	
	public boolean vacio () {
		return raiz == null;
	}
	
	public int tamanio(){
		return indice;
	}
	
	public int elementoEnPos(int pos){
		Nodo nodoActual = raiz;
		while(nodoActual != null){
			if (pos == 0) {
				return nodoActual.getValor();
			}
			pos --;
			nodoActual = nodoActual.getSiguiente();
		}
		return -1;
	}
	
//	public int[] valores(){
//		int[] valores = new int[indice];
//		Nodo nodoActual = raiz;
//		int pos = 0;
//		while(nodoActual != null){
//			valores[pos] = nodoActual.getValor();
//			nodoActual = nodoActual.getSiguiente();
//			pos++;
//		}
//		return valores;
//	}
	
	public void eliminar(int pos){
		Nodo nodoActual = raiz;
		if(pos == 0){
			raiz = nodoActual.getSiguiente();
		}
		while(nodoActual != null && pos > 0){
			if (pos == 1) {
				Nodo temp = nodoActual.getSiguiente(); //cuando encontramos el nodo anterior al que queremos eliminar 
				nodoActual.setSiguiente(temp.getSiguiente());// seteamos su nodo siguiente con el siguiente de el que 
				return;										// queremos eliminar.
			}
			pos --;
			nodoActual = nodoActual.getSiguiente();
		}
		indice--;
	}
}
