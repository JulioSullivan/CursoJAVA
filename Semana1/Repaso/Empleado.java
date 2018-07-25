public abstract class Empleado implements Asesor{
	private String nombre;
	private int edad;
	private int salario;
	private int nEmpleado;
	private static int contador; //Lo dejamos estatico para que solo pertenezca a la clase y no a cada objeto en particular

	public Empleado(String nombre, int edad, int salario){
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		contador++;
		this.nEmpleado = contador;
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}

	public int getnEmpleado(){
		return nEmpleado;
	}

	public int getSalario(){
		return salario;
	}


	public void aumentarSalario(int aumento){
		this.salario += aumento;
	}

	public abstract void trabajar();

	//Implementar los métodos de la interfaz
	@Override
	public void darAsesoria(int horas){
		System.out.println(nombre+" dice:\n Voy a dar: "+horas+" horas de asesoria");
		aumentarSalario(pago*horas);
	}

	@Override
	public void darSeguimiento(){
		System.out.println("El numero va mejorando.");
	}


}