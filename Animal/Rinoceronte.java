public class Rinoceronte extends Animal{
	String mood = "";

	public Rinoceronte(int patas, String color, String comida, String mood){
		super(patas, color, comida);
		this.mood = mood;
	}

	public void datos(){
		super.datos();
		System.out.println("Estoy en estado "+mood);
	}
}