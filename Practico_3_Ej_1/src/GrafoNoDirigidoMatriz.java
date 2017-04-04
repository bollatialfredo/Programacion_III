
public class GrafoNoDirigidoMatriz {
	boolean mat [][] = new boolean [5][5];
	
	
	public void agregarVertice(){
		boolean matAux [][] = new boolean [mat.length*2][mat.length*2];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				matAux[i][j] = mat[i][j];
			}
		}
		mat = matAux;
	}
	
	public void agregarArco(int verticeA, int verticeB){
		if(verticeB < mat.length && verticeA < mat.length){
			mat[verticeA][verticeB] = true;
			mat[verticeB][verticeA] = true;
		}else{
			agregarVertice();
			agregarArco(verticeA, verticeB);
		}
	}
	
	public boolean consultarArco(int a, int b){
		return mat[a][b] && mat[b][a];
	}
	
	public static void main(String[] args) {
		GrafoNoDirigidoMatriz grafo = new GrafoNoDirigidoMatriz();
		grafo.agregarArco(5, 7);
		System.out.println(grafo.consultarArco(5, 7));
		System.out.println(grafo.consultarArco(5, 5));
		System.out.println(grafo.consultarArco(7, 5));
	}
	
}
