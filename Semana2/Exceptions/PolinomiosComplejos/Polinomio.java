public class Polinomio{
	double a, b, c;

	public Polinomio(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void calculaRaices() throws ComplejaException{
		if ( ((b*b)-(4*a*c)) > 0) {
			System.out.println("--Raices: ");
			System.out.println("x1 = " + ( (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a)) );
			System.out.println("x2 = " + ( (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a)) );

		} else if( ((b*b)-(4*a*c)) < 0 ){
			throw new ComplejaException();
		}
	}
}