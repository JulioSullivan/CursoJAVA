public class Bomba implements Apagable, Encendible{
	@Override
	public void encender(){
		System.out.println("Llenando tinaco...");
	}

	@Override
	public void apagar(){
		System.out.println("Bomba apagada.");
	}
}