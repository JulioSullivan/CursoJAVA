public class Alumno extends Escolares {
	double promedio;

	public Alumno(String nombre, int edad, String genero, double promedio){
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.promedio = promedio;
	}

	@Override
	public void irEscuela(){
		System.out.println(nombre+ " esta llegando tarde.");
	}

	@Override
	public void tarea(){
		System.out.println(nombre+" esta batallando con la tarea.");
	}

	@Override
	public void clase(){
		if (genero == "masculino") {
			System.out.println(nombre+" estapajareando en clase");
		} else if(genero == "femenino") {
			System.out.println(nombre + " esta poniendo atencion a la clase.");
		}
	}

	public boolean exento(){
		if (promedio >= 6.0 ) {
			return true;
		} else {
			return false;
		}
	}
}	