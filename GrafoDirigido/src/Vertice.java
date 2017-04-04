import java.util.*;
public class Vertice {
	int id;
	List<Arco> arcos;
	
	public Vertice (int _id){
		id = _id;
		arcos = new ArrayList<Arco>();
	}
	
	public void addArco (Vertice destino) {
		Arco nuevoArco = new Arco(destino);
		arcos.add(nuevoArco);
	}
	
	public int getId () {
		return id;
	}
}
