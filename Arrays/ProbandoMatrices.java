public class ProbandoMatrices{
	public static void main(String[] args) {
		Matriz m1 =  new Matriz(2,2,5);
		Matriz m2 = new Matriz(2,2,2);
		System.out.println(m1);
		System.out.println(m2);

		Matriz identidad =  Matriz.identidad(4);
		System.out.println(identidad);

		m1.multiplicar(identidad);
		System.out.println(m1);

		m1.multiplicar(2);
		System.out.println(m1);


	}
}