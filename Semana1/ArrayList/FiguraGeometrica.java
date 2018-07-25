public abstract class FiguraGeometrica{
	public int numeroLados;
	public String nombre;

	public String nombreFigura(){
		return nombre;
	}

	public abstract double calcularArea();
}