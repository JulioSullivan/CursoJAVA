//Aquí es donde las clases de Encendible y Apagable son tratadas como superclase, en vez de como subclases (lo que son)
public class Foco implements Encendible, Apagable{
	@Override
	public void encender(){
		System.out.println("Encendiendo las luces");
	}

	@Override
	public void apagar(){
		System.out.println("Luces fuera.");
	}
}