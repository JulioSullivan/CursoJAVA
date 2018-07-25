public class Vehiculo{
	private float velocidadMax = 0;
	private String color;
	private String tipo;
	private boolean estado = false;

	public Vehiculo(){

	}

	public Vehiculo(float velocidadMax, String color, String tipo){
		this.velocidadMax = velocidadMax;
		this.color = color;
		this.tipo = tipo;
	}

	public void encender(){
		estado = true;
	}

	public String encendido(){
		if (estado) {
			return "Está encendido";
		}
		else
			return "Está apagado";
	}

	public void datos(){
		System.out.println("Vel. Max: "+velocidadMax);
		System.out.println("Color: "+color);
		System.out.println("Tipo de Vehiculo: "+tipo);
		System.out.println("Estado del carro: "+encendido());

	}
}