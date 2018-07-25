public class AnimalTest{
	public static void main(String[] args) {
		Gato gato1 = new Gato("Misifuz", "Persa");
		Mamifero elMamifero = gato1; //Upcasting una subclase como una superclase

		Gato gato2 = (Gato) elMamifero; //Downcasting una superclase como una subclase
	}
}