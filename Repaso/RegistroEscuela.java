import java.util.Scanner;
import java.util.ArrayList;

public class RegistroEscuela{
	static Scanner sc = new Scanner(System.in);
	static String nombreAux;
	static int edadAux;
	static int salarioAux;
	static String infoExtra;

	public static void main(String[] args) {
		ArrayList<Empleado> registro = new ArrayList<Empleado>();
		int opcion;
		int nEmp;
		int horas;
		boolean bandera = true;

		System.out.println("\n Registro de personal: ");

		do{
			System.out.println("Registrar: \n1) Coordinador \n2) Maestro");
			opcion = sc.nextInt();
			sc.nextLine(); //Para limpiar la memoria del scanner y no se quede con lo que ingresamos anteriomente

			if (opcion == 1) {
				pedirDatos();
				System.out.println("\nArea");
				infoExtra = sc.nextLine();

				registro.add(new Coordinador(nombreAux, edadAux, salarioAux, infoExtra));
				//TODO objeto en Java es polimorfico
			} else if (opcion == 2){
				pedirDatos();
				System.out.println("\nMateria: ");
				infoExtra = sc.nextLine();

				registro.add(new Maestro(nombreAux, edadAux, salarioAux, infoExtra));
			}
			System.out.println("\n¿Quieres registrar mas usuarios? \n1) Si \n2) No");
			opcion = sc.nextInt();
			sc.nextLine();

			if (opcion == 2) {
				bandera = false;
			}

		} while(bandera);
	
		System.out.println("Empleado ya registrados: ");
		for (Empleado emp : registro) {
			System.out.println(emp.toString());
		}

		System.out.println("Empleados que estan trabajando: ");
		for (Empleado emp : registro) {
			emp.trabajar();
		}

		System.out.println("Ingrese el numero de Empleado que quiere que de la asesoria: ");
		nEmp = sc.nextInt();
		sc.nextLine();
		System.out.println("Cuantas horas se asesoria se impartiran: ");
		horas = sc.nextInt();
		sc.nextLine();

		registro.get((nEmp-1)).darAsesoria(horas);

		System.out.println("Desempeño del alumno en las asesorias: ");
		registro.get((nEmp-1)).darSeguimiento();

		System.out.println(registro.get((nEmp-1)).toString());
	}

	public static void pedirDatos(){
		System.out.println("\nNombre: ");
		nombreAux = sc.nextLine();
		System.out.println("\nEdad: ");
		edadAux = sc.nextInt();
		sc.nextLine();
		System.out.println("\nSalario: ");
		salarioAux = sc.nextInt();
		sc.nextLine();
	}
}