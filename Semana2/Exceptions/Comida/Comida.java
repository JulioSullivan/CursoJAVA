import java.util.Scanner;
public class Comida{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comida;
		do{
			System.out.println("Escribe el numbre de alguna comida o presiona s para salir.");
			comida = sc.nextLine();
			if (comida.equals("s")) {
				break;
			}
			try{
				revisaComida(comida);
			}catch (BuenaComidaException bce){
				System.out.println(bce.getMessage());
				bce.getMessage();
			}
		} while (!comida.equals("s"));
		System.out.println("Adios");
	}


	public static void revisaComida(String comida) throws BuenaComidaException{
		if (comida.equalsIgnoreCase("brocoli") || comida.equalsIgnoreCase("espinacas")) {
			throw new BuenaComidaException();
		} else {
			System.out.println("Yumi yumi\n");
		}
	}
}