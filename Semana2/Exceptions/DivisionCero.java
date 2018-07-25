import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionCero{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //El scanner es un flujo
		int resultado = 0;
		boolean continuar = true;

		do{
			try{
				System.out.println("Ingresa el numerador: ");
				int numerador = sc.nextInt();
				System.out.println("Ingresa el denominador: ");
				int denominador = sc.nextInt();
				resultado = numerador/denominador;
				System.out.println("El resultado es: "+resultado);

			} catch(InputMismatchException ime){
				System.out.println("Ingresaste un dato erroneo.");
				ime.printStackTrace();
				sc.nextLine();
			} catch(ArithmeticException ae){
				System.out.println("Acabas de realizar la division entre cero.");
				ae.printStackTrace();
			} /*finally{ //Como cerramos el flujo del scanner en el while, al correlo por segunda vez, ya no tenemos scanner lol
				sc.close(); //Para cerrar el flujo del scaner
			}*/
		} while(continuar);
	}
}