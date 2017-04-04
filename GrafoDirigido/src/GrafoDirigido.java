import java.util.ArrayList;
import java.util.List;

public class GrafoDirigido {
	List<Vertice> vertices;
	int contador;
	
	public GrafoDirigido () {
		contador = 0;
		vertices = new ArrayList<Vertice>();
	}
	
	public void agregarVertice () {		
			vertices.add(new Vertice(contador));
			contador++;
	}
	
	public void agregarArco (int idOrigen, int idDestino) {
		if (contieneVertice(idOrigen) && contieneVertice(idDestino)) {
				vertices.get(idOrigen).addArco(vertices.get(idDestino));
		}
	}
	
	public boolean contieneVertice (int idVertice) {
			for (Vertice vertice : vertices) {
				if (vertice.getId() == idVertice) {
					return true;
				}
			}
		return false;
	}
	
	
}