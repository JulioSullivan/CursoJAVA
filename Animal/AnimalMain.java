public class AnimalMain{
	public static void main(String[] args) {
		Rinoceronte R = new Rinoceronte(4, "negro", "Como vegetales", "triste");
		Leon L = new Leon(4, "blanco", "Como top sirlone", 127);

		System.out.println(" "+R.comer());
		System.out.println(" "+L.comer());

		R.datos();
		System.out.println("");
		L.datos();
	}
}