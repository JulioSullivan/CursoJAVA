public class Arreglos{
	public static void main(String[] args) {
		//Para convertir a cadena lo que entra por la consola
		int indice = Integer.parseInt(args[0]);
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Dciembre"};
		System.out.println("El mes correspondiente al numero "+indice+" es "+meses[indice - 1]);
	}
}|