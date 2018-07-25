public class Animal {
	
	public int patas = 0;
	public String color = "";
	public String comida = "";

	public Animal(){

	}

	public Animal(int patas, String color, String comida){
		this.patas = patas;
		this.color = color;
		this.comida = comida;
	}

	public String comer(){
		return "Estoy comiendo";
	}

	public void datos(){
		System.out.println("Tengo "+patas+" patas");
		System.out.println("Soy de color "+color);
		System.out.println("Como "+comida);
;	}
}