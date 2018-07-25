import java.util.Arrays;
public class Arreglos2{
	public static void main(String[] args) {
		int arreglo1[] = {1,2,3,4,5};
		int arreglo2[] = (int[])arreglo1.clone(); //Es necesario hacer esto para crear la copia del arreglo y no nada más la referencia. Sino lo cambios que se hagan en 
		//int arreglo2[] = arreglo1;
		System.out.print("Arreglo 1: ");
		imprimirArreglo(arreglo1);
		System.out.print("Arreglo 2: ");
		imprimirArreglo(arreglo2);
		arreglo1[2] = 10;
		System.out.print("Arreglo 1: ");
		imprimirArreglo(arreglo1);
		System.out.print("Arreglo 2: ");
		imprimirArreglo(arreglo2);

	}

	public static void imprimirArreglo(int arreglo[]){
		for (int temp:arreglo) {
			System.out.print(temp + " ");
		}

		System.out.println();
	}
}