public class Carro{
	public String marca;
	public String color;
	public static int contador = 0;

	public void Carro(String marca, String color){
		this.marca = marca;
		this.color = color;
		contador++;
	}

	public void manejar(){
		System.out.println("El carro esta siendo manejardo.");
	}

	public static void cuentaCarros(){
		if (contador == 1) {
			System.out.println("Actualmente se ha instanciado un carro.");
		} else {
			System.out.println("Actualmente se han instanciado "+contador+" carros.");	
		}
	}

	public String asignarMatricula(){
		
	}
}