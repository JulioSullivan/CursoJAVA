import java.util.Arrays;
public class IngresaArreglo{
	public static void main(String[] args) {
		int arregloIng[] = new int[10];
		for (int i = 0; i < 10 ; i++ ) {
			arregloIng[i] = Integer.parseInt(args[i]);
		}
		System.out.println("El arreglo ingresado es: ");
		imprimirArreglo(arregloIng);
		System.out.println("El arreglo invertido es: ");
		imprimeArregloInverso(arregloIng);
	}

//Por tiempos de ejecución, es mejor usar el for normal que el foreach
	public static void imprimeArregloInverso(int arreglo[]){
		for (int i=9; i>=0 ; i--) {
			System.out.print(arreglo[i]+" ");
		}

	}

	public static void imprimirArreglo(int arreglo[]){
		for (int temp:arreglo) {
			System.out.print(temp + " ");
		}

		System.out.println();
	}
}