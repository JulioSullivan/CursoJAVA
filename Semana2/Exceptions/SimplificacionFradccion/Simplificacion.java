import java.util.Scanner;
import java.util.InputMismatchException;

public class Simplificacion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, d = 0;
		boolean continuar = true;

		while(continuar){
			try{
				System.out.println("Bienvenido a Simplificar MX");
				System.out.println("¿Quieres usar nuestro programa para simplificar?");
				System.out.println("1. Si\n2. No\n-->");
				int op = Integer.parseInt(sc.nextLine());

				if (op==1) {
					try{
						System.out.println("Ingresa el numerador: ");
						n = sc.nextInt();
						System.out.println("Ingresa el denominador: ");
						d = sc.nextInt();
						sc.nextLine(); //Limpia el buffer
						int frac = n/d;
						int aux = Math.max(n,d);

						while(aux!=0){
							if (aux==1 && ((n*n)==d)) {
								d=d/n;
								n=n/n;
								System.out.println("Simplificacion: "+n+" / "+d);
								aux =0;
							} else if ((n%aux)==0 && ((d%aux)==0)) {
								d=d/aux;
								n=n/aux;
								System.out.println("Simplifivacion: "+n+" / "+d);
								aux = 0;			
							} else {
								aux--;
							}

						}

					} catch(ArithmeticException ae){
						System.out.println("Valor incorrecto, ingresa de nuevo lo valores.");
						ae.printStackTrace();
					} catch(InputMismatchException ime){
						System.out.println("Ingresaste un dato erroneo.");
						ime.printStackTrace();
						sc.nextLine();
					}
				}else if (op==2){
					System.out.println("Fue un gusto atenderte. Adios");
					continuar = false;
				}
			} catch(NumberFormatException nfe){
				System.out.println("No estas ingresando un entero.");
			} catch(InputMismatchException ime){
				System.out.println("Ingresaste un dato erroneo.");
				ime.printStackTrace();
				sc.nextLine();
			}
		}
	}
}