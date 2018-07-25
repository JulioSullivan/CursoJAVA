import java.util.Scanner;
public class Calculadora{

	public static float num1, num2, resultado;
	public static int op;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese el numero 1: ");
		num1 = input.nextInt();

		System.out.println("Ingrese el numero 2: ");
		num2 = input.nextInt();

		System.out.println("Ingrese la operacion que desea hacer:\n1.- Suma\n2.- Resta\n3.- Multiplicacion\n4.- Division");
		op = input.nextInt();
		operacion(op);
	}

	public static void operacion(int op){
		switch (op) {
			case 1:
				resultado = num1 + num2;
				System.out.println(num1+"+"+num2+"="+resultado);
				break;
			case 2:
				resultado = num1 - num2;
				System.out.println(num1+"-"+num2+"="+resultado);
				break;
			case 3:
				resultado = num1 * num2;
				System.out.println(num1+"*"+num2+"="+resultado);
				break;
			case 4:
				resultado = num1 / num2;
				System.out.println(num1+"/"+num2+"="+resultado);
				break;
			default:
				System.out.println("Ingresó una opcion invalida.");
				break;

		}
	}
}