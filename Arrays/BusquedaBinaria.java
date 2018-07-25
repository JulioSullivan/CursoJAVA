import java.util.Arrays;
public class BusquedaBinaria{
	public static void main(String[] args) {
		//int arreglo[]={4,3,2,4,5};
		String paises[] = {"Mexico","España","Italia"};
		Arrays.sort(paises); //Es necesario hacer un sort del arreglo ya qyue como es una busqueda binaria, el funcionamiento de éste es en un arreglo ordenado para dividir a la mitad
		int indice = Arrays.binarySearch(paises,"Mexico"); //Para los métodos estáticos, no se necesita instanciar un objeto de la clase para mandar a llamar el método
		imprimirArreglo(paises);
		System.out.println("Mexico esta en la posicion "+indice);

		String mismo[] = new String[10];
		imprimirArreglo(mismo);
		Arrays.fill(mismo, "a");
		imprimirArreglo(mismo);
	}

	public static void imprimirArreglo(String arreglo[]){
		for (String temp:arreglo) {
			System.out.print(temp + " ");
		}

		System.out.println();
	}
}