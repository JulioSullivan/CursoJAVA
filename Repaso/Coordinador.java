public class Coordinador extends Empleado{
	private String area;

	public Coordinador(String nombre, int edad, int salario, String area){
		//La llamada del constructor de la clase padre, siempre va en la primera linea, sino va a marcar error.
		super(nombre, edad, salario);
		this.area = area;
	}

	@Override
	public void trabajar(){
		System.out.println(getNombre()+" dice: Estoy coordinando.");
	}


	//Todas las clases tienen la clase toString para impresión, pero  la vamos a sobre esribir para que nos regrese todos los datos que nosotros queremos.
	@Override
	public String toString(){
		return "Coordinador\n Nombre: "+getNombre()+"\n Edad: "+getEdad()+"\n Area de Coordinacion: "+this.area+"\n Numero de Empleado: "+getnEmpleado();
	}
}