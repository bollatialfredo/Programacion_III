public class Main {
	public static void main(String[] args) {
		Burbujeo burbujeo = new Burbujeo();
		MergeSort mergeSort = new MergeSort();
		
		System.out.println();
		System.out.println("Ordenamos un arreglo de 10 espacios.");//////////////////////////////////////
		System.out.println();
		
		int [] arrBurbujeo = new int [10];
		int [] arrMergeSort = new int [10];				
		for (int i = 0; i < arrBurbujeo.length; i++) {
			int aux = (int) Math.floor(Math.random() * 101);
			arrBurbujeo[i] = aux;
			arrMergeSort[i] = aux;
		}		
		long comienzoM = System.nanoTime();
		mergeSort.ordenar(arrMergeSort);
		long finalM = System.nanoTime();
		System.out.println("Merge Sort tomó "+(finalM - comienzoM) + " nanosegundos en completar el ordenamiento.");
		long comienzoB = System.nanoTime();
		burbujeo.ordenar(arrBurbujeo);
		long finalB = System.nanoTime();
		System.out.println("Burbujeo tomó "+(finalB - comienzoB) + " nanosegundos en completar el ordenamiento.");
		if(finalB - comienzoB >= finalM - comienzoM){
			long aux =  (finalB - comienzoB) - (finalM - comienzoM); 
			System.out.println("Ordenamiento por BURBUJEO tomó "+ aux +" nanosegundos más que MERGE SORT en completar el ordenamiento de un arreglo de 10 espacios.");
		}else{
			long aux =  (finalM - comienzoM) - (finalB - comienzoB); 
			System.out.println("Ordenamiento por MERGE SORT tomó "+ aux +" nanosegundos más que BURBUJEO en completar el ordenamiento de un arreglo de 10 espacios.");
		}
		
		System.out.println();
		System.out.println("Ordenamos un arreglo de 100 espacios.");/////////////////////////////////
		System.out.println();
		
		arrBurbujeo = new int [100];
		arrMergeSort = new int [100];
				
		for (int i = 0; i < arrBurbujeo.length; i++) {
			int aux = (int) Math.floor(Math.random() * 101);
			arrBurbujeo[i] = aux;
			arrMergeSort[i] = aux;
		}
				
		comienzoM = System.nanoTime();
		mergeSort.ordenar(arrMergeSort);
		finalM = System.nanoTime();
		System.out.println("Merge Sort tomó "+(finalM - comienzoM) + " nanosegundos en completar el ordenamiento.");
		
		comienzoB = System.nanoTime();
		burbujeo.ordenar(arrBurbujeo);
		finalB = System.nanoTime();
		System.out.println("Burbujeo tomó "+(finalB - comienzoB) + " nanosegundos en completar el ordenamiento.");
		
		if(finalB - comienzoB >= finalM - comienzoM){
			long aux =  (finalB - comienzoB) - (finalM - comienzoM); 
			System.out.println("Ordenamiento por BURBUJEO tomó "+ aux +" nanosegundos más que MERGE SORT en completar el ordenamiento de un arreglo de 100 espacios.");
		}else{
			long aux =  (finalM - comienzoM) - (finalB - comienzoB); 
			System.out.println("Ordenamiento por MERGE SORT tomó "+ aux +" nanosegundos más que BURBUJEO en completar el ordenamiento de un arreglo de 100 espacios.");
		}
		
		System.out.println();		
		System.out.println("Ordenamos un arreglo de 1000 espacios.");///////////////////////////////////////
		System.out.println();
		arrBurbujeo = new int [1000];
		arrMergeSort = new int [1000];		
		for (int i = 0; i < arrBurbujeo.length; i++) {
			int aux = (int) Math.floor(Math.random() * 101);
			arrBurbujeo[i] = aux;
			arrMergeSort[i] = aux;
		}
		comienzoM = System.nanoTime();
		mergeSort.ordenar(arrMergeSort);
		finalM = System.nanoTime();
		System.out.println("Merge Sort tomó "+(finalM - comienzoM) + " nanosegundos en completar el ordenamiento.");
		comienzoB = System.nanoTime();
		burbujeo.ordenar(arrBurbujeo);
		finalB = System.nanoTime();
		System.out.println("Burbujeo tomó "+(finalB - comienzoB) + " nanosegundos en completar el ordenamiento.");
		if(finalB - comienzoB >= finalM - comienzoM){
			long aux =  (finalB - comienzoB) - (finalM - comienzoM); 
			System.out.println("Ordenamiento por BURBUJEO tomó "+ aux +" nanosegundos más que MERGE SORT en completar el ordenamiento de un arreglo de 1000 espacios.");
		}else{
			long aux =  (finalM - comienzoM) - (finalB - comienzoB); 
			System.out.println("Ordenamiento por MERGE SORT tomó "+ aux +" nanosegundos más que BURBUJEO en completar el ordenamiento de un arreglo de 1000 espacios.");
		}
		
		
		
		
		
		/**
		 * 
		 * A medida que queremos ordenar arreglos de mayores dimenciones el método de ordenamiento Merge Sort es más eficiente.
		 * En el caso de un arreglo de una dimeción pequeña el metodo de ordenamiento de Burbujeo es mas eficiente.
		 * 
		 * Con estos resultados podemos observar que si bien el costo O de ambos algoritmos de ordenar los arreglos es
		 * lineal, el costo del método de ordenamiento por burbujeo es mayor a mayores dimeciones del arreglo. 
		 * 
		 */
		
		
		
		
		
		
		
	}
}
