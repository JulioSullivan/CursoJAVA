public class vAereo extends Vehiculo{
	public int ruedas = 0;
	public int turbinas;
	public String clase;

	public vAereo(){

	}

	public vAereo(float velocidadMax, String color, String tipo, int ruedas, int turbinas, String clase){
		super(velocidadMax, color, tipo);
		this.ruedas = ruedas;
		this.turbinas = turbinas;
		this.clase = clase;
	}

	public void datos(){
		super.datos();
		System.out.println("Ruedas: "+ruedas);
		System.out.println("Turbinas: "+turbinas);
		System.out.println("Clase: "+clase);
	}

	public static void main(String[] args) {
		vAereo a = new vAereo(100,"negro","Aereo",4,2,"militar");
		a.datos();
	}
}