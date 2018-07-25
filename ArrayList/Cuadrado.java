public class Cuadrado extends FiguraGeometrica{
	double lado;
	public Cuadrado(double lado){
		this.lado = lado;
	}

	@Override
	public double calcularArea(){
		double area = lado*lado;
	}
}