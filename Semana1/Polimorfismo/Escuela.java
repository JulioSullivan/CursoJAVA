public class Escuela{
	public static void main(String[] args) {
		Profesor profePonche = new Profesor("Alfonso", 50, "masculino", 30000);
		Alumno juanito = new Alumno("Juan", 11, "masculino", 5);
		Alumno julia = new Alumno("Julia", 11, "femenino", 9.3);
		Secretaria emily = new Secretaria("Emily", 25, "femenino", 15000);
		Alumno grupo[] = {juanito, julia};
		Profesor academicos[] = {profePonche};


		profePonche.irEscuela();
		juanito.irEscuela();
		julia.irEscuela();
		emily.irEscuela();

		profePonche.clase();
		juanito.clase();
		julia.clase();
		emily.clase();

		profePonche.tarea();
		juanito.tarea();
		julia.tarea();
		emily.tarea();

		for (Alumno alumno : grupo) {
			if (alumno.exento()) {
				System.out.println(alumno.nombre+" exento el examen.");
			} else {
				System.out.println(alumno.nombre + " debe de presentar final.");
			}
		}

		profePonche.cobrar();
		System.out.println(" ");

		double calificaciones[] = emily.calificaciones(grupo);
		System.out.println("El reporte de "+emily.nombre+" dio como resultado:\nCalificaciones: ");
		imprimirArreglo(emily.calificaciones(grupo));


	}

	public static void imprimirArreglo(double arreglo[]){
		for (double temp:arreglo) {
			System.out.print(temp + " ");
		}

		System.out.println();
	}
}