import java.util.Scanner;
import java.util.InputMismatchException;

public class mainExcepcionesPoli{
	public static void main(String[] args) {
		double a,b,c;
		//
		boolean go = true;
		Scanner sc = new Scanner(System.in);

		while(go){
			//
			try{
				System.out.println("Calculo de raices del Polinomio");
				System.out.println("De la forma ax2 + bx +c");
				System.out.println("¿Entrada?\n1. Si\n2. No");
				if (sc.nextInt()==1) {
					System.out.println("Valores de Coeficientes: ");
					sc.nextLine();
					System.out.println("a--> ");
					//Recordar limpiar al buffer
					a=sc.nextDouble();
					sc.nextLine();

					System.out.println("b-->");
					b=sc.nextDouble();
					sc.nextLine();

					System.out.println("c-->");
					c=sc.nextDouble();
					sc.nextLine();

					System.out.println(a+" + "+b+" + "+c);

					Polinomio p = new Polinomio(a, b, c);
					System.out.println("Las raices del polinomio son: ");
					try{
						p.calculaRaices();
					} catch (ComplejaException ce) {
						System.out.println(ce.getMessage());
						sc.nextLine();

					} catch (NumberFormatException nfe) {
						System.out.println("No es un entreo.");
						sc.nextLine();

					}
				}
				if (sc.nextInt()==2) {
					System.out.println("Hasta luego.");
					go = false;
				}
			} catch (InputMismatchException ime){
				System.out.println("Ingresa un numero valido, ya que el que ingresaste no lo es.");
			}
		}
	}
}