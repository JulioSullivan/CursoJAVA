public class Secretaria extends Escolares{
	int sueldo;


	public Secretaria(String nombre, int edad, String genero, int sueldo){
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.sueldo = sueldo;
	}

	@Override
	public void irEscuela(){
		System.out.println(nombre+ " esta llegando a tiempo con el cafe");
	}

	@Override
	public void tarea(){
		System.out.println(nombre+" esta realizando la tarea qyue deja el profesor para comprobar con los alumnos");
	}

	@Override
	public void clase(){
		System.out.println(nombre+" esta ralizando el reporte durante la clase del profesor.");
	}

	public double[] calificaciones(Alumno grupo[]){
		double[] calificaciones = new double[grupo.length];

		for (int i = 0;i<grupo.length ; i++ ) {
			calificaciones[i] = grupo[i].promedio;
		}
		return calificaciones;
	}

	public double[] sueldos(Profesor academicos[]){
		double[] sueldos = new double[academicos.length];

		for (int i = 0;i<academicos.length ; i++ ) {
			sueldos[i] = academicos[i].sueldo;
		}
		return sueldos;
	}
}

//josejesussoto@gmail.com