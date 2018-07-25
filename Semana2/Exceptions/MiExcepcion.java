public class MiExcepcion extends Exception{
	@Override
	public String toString(){
		return "Mi propia excepcion!";
	}

	public void hola(){
		System.out.println("Hola mundo desde la excepcion :D");
	}
}