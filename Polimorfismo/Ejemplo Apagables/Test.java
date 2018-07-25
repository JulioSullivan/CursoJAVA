public class Test{
	public static void main(String[] args) {
		//Instancias derreferenciadas o anónimas, no le ponemos nombre porque no nos interesa ya que se está haciendo UPCASTING, que trata las subclases dentro de foco y bomba como superclases.
		ControlRemoto control1 = new ControlRemoto(new Bomba(), new Bomba(), new Foco(), new Foco(), new Auto(), new Auto());
		control1.oprimirBoton1();
		control1.oprimirBoton2();
		control1.oprimirBoton3();
		control1.oprimirBoton4();
		control1.oprimirBoton5();
		control1.oprimirBoton6();
	}	
}