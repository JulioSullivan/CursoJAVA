public class Leon extends Animal{
	int abatidos = 0;

	public Leon(int patas, String color, String comida, int abatidos){
		super(patas, color, comida);
		this.abatidos= abatidos;
	}

	public void datos(){
		super.datos();
		System.out.println("He matado a "+abatidos+" victimas");
	}
}