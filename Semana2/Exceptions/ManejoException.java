public class ManejoException{
	public static void main(String[] args) {
		MetodosExcepcion me = new MetodosExcepcion();
		try{
			me.lanzarExcepcion();
		}catch(MiExcepcion mie){
			System.out.println(mie);
			mie.hola();

		}
	}
}