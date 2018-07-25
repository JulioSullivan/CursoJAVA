public class ControlRemoto{
	public Encendible e1, e2, e3;
	public Apagable a1, a2, a3;

	//Este constructor recibe objetos de Encendible y Apagable, pero puede recibir de un clase que use implements o un UPCASTING
	public ControlRemoto(Encendible e1, Apagable a1, Encendible e2, Apagable a2, Encendible e3, Apagable a3){
		this.e1 = e1;
		this.a1 = a1;
		this.e2 = e2;
		this.a2 = a2;
		this.e3 = e3;
		this.a3 = a3;

	}

	public void oprimirBoton1(){
		e1.encender();
	}

	public void oprimirBoton2(){
		a1.apagar();
	}

	public void oprimirBoton3(){
		e2.encender();
	}

	public void oprimirBoton4(){
		a2.apagar();
	}

	public void oprimirBoton5(){
		e3.encender();
	}

	public void oprimirBoton6(){
		a3.apagar();
	}
}