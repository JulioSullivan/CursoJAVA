public class vTerrestre extends Vehiculo{
	public int ruedas = 0;
	public String traccion = "";
	public String modelo = "";

	public vTerrestre(){

	}

	public vTerrestre(float velocidadMax, String color, String tipo, int ruedas, String traccion, String modelo){
		super(velocidadMax, color, tipo);
		this.ruedas = ruedas;
		this.traccion = traccion;
		this.modelo =modelo;
	}

	public void datos(){
		super.datos();
		System.out.println("Ruedas: "+ruedas);
		System.out.println("Traccion: "+traccion);
		System.out.println("Modelo: "+modelo);
	}
}