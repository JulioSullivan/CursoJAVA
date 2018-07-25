import java.util.Scanner;

public class MetodosExcepcion{
	public void lanzarExcepcion() throws MiExcepcion{ //El throws es para indicar que este metodo puede lanzar una excepcion
		Scanner sc = new Scanner(System.in);
		System.out.println("Presiona 1 para lanzar la excepcion.");
		int i = sc.nextInt();
		if (i == 1) {
			throw new MiExcepcion();
		}
	}
}