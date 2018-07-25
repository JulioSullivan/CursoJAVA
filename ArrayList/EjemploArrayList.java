import java.util.ArrayList;
public class EjemploArrayList{
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();

		System.out.println("¿La nombres esta vacia?");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("Tamaño: "+nombres.size()); 
		imprimirArregloDinamico(nombres);

		//Añadir elementos
		System.out.println("Añadiendo elementos");
		nombres.add("Pedro");
		nombres.add("Jorge");
		nombres.add("Jose");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("Tamaño: "+nombres.size()); 
		imprimirArregloDinamico(nombres);

		//Añadir elemento en un indice definido
		System.out.println("Añadiendo elemento en el indice 2.");
		nombres.add(2,"Sofia");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("Tamaño: "+nombres.size()); 
		imprimirArregloDinamico(nombres);

		//Eliminando por objeto
		System.out.println("Borrando por objeto a Sofia");
		nombres.remove("Sofia");
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("Tamaño: "+nombres.size()); 
		imprimirArregloDinamico(nombres);

		//Eliminando por índice
		System.out.println("Borrando por indice a Jorge.");
		nombres.remove(1);
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("Tamaño: "+nombres.size()); 
		imprimirArregloDinamico(nombres);

		//Borrar todos los elementos de la lista
		System.out.println("Borrando a todos los elementos");
		nombres.clear();
		System.out.println("¿Vacia? "+nombres.isEmpty());
		System.out.println("Tamaño: "+nombres.size()); 
		imprimirArregloDinamico(nombres);
	}

	public static void imprimirArregloDinamico(ArrayList<String> arreglo){
		System.out.println("Arreglo dinamico: ");
		for (String temp: arreglo) {
			System.out.println(temp+" ");
		}
		System.out.println("\n");
	}
}