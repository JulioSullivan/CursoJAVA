public Triangulo extends FiguraGeometrica{
	double lado;
	public Triangulo(double lado){
		this.lado = lado;
	}

	@Override
	public double calcularArea(){
		double area = lado*lado/2;
	}
}