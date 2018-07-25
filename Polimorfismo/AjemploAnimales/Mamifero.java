public class Mamifero implements Animal {
	public String nombre;

	@Override
	public void comer(){
		System.out.println(nombre + " esta comiendo.");
	}

	@Override
	public void hablar(){
		System.out.println(nombre + " dice: ");
	}
}