public class Burbujeo {

	public void ordenar(int [] intArray) {
		int aux;
		for (int i = 0; i < intArray.length-1; i++) {
			for (int j = 0; j < intArray.length-1; j++) {				
				if(intArray[j+1]<intArray[j]){
					aux=intArray[j+1];
					intArray[j+1]=intArray[j];
					intArray[j]=aux;
				}
			} 
		}
	}
}
