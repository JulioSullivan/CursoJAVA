public class Maestro extends Empleado{
	private String materia;
	public Maestro(String nombre, int edad, int salario, String materia){
		super(nombre, edad, salario);
		this.materia = materia;
	}

	@Override
	public void trabajar(){
		System.out.println(getNombre()+" dice: Estoy dando clase.");
	}

	public String toString(){
		return "\nMaestro\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nSalario: "+getSalario()+"\nMateria: "+this.materia+"\nNumero de empleado: "+getnEmpleado();
	}
}