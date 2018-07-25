public class Matriz{
	private double matriz[][];
	private int renglones;
	private int columnas;

	Matriz(double matriz[][]){
		this.matriz = matriz;
		this.renglones = matriz.length;
		this.columnas = matriz[0].length;
	}

	Matriz(int renglones, int columnas){ // SOBRECARGA
		matriz = new double[renglones][columnas];
		this.renglones = renglones;
		this.columnas = columnas;
	}

	Matriz(int renglones, int columnas, double relleno){
		this(renglones,columnas);
		for (int i = 0;i<renglones;i++) {
			for (int j=0;j<columnas;j++) {
				this.matriz[i][j] = relleno;
			}
		}
	}

	//Este método es usado porque cuando instancias una matriz, solo creas la referencia y el método equals compara objetos, no valores. Entonces al momento de escribir nada más matriz[i][j] de un objeto recibido, estamos entrando a la localidad de memoria de la matriz, no a su valor. Por eso se crea una método para recuperar el valor de la matriz.
	public double obtenerDato(int i, int j){
		return matriz[i][j];
	}

	public void multiplicar(double escalar){
		for (int i = 0;i<renglones;i++) {
			for (int j=0;j<columnas;j++) {
				matriz[i][j] *= escalar; 
			}
		}
	}

	public boolean multiplicar(Matriz matriz2){
		if (this.columnas!=matriz2.renglones) {
			return false;
		}
		Matriz resultado = new Matriz(this.renglones, matriz2.columnas);
		for (int i = 0;i<renglones;i++) {
			for (int j=0;j<columnas;j++) {
				for (int k=0;k<this.columnas;k++) {
					resultado.matriz[i][j]+=matriz[i][k]*matriz2.obtenerDato(k,j);
				}
			}
		}
		this.matriz = resultado.matriz;
		return true;
	}

	public static Matriz identidad(int n){
		Matriz identidad = new Matriz(new double[n][n]);
		for (int i = 0;i<identidad.renglones;i++) {
			for (int j=0;j<identidad.columnas;j++) {
				if (i==j){
					identidad.matriz[i][j] = 1;
				}
			}
		}
		return identidad;
	}

	@Override //Lo que se quiere es comprar los valores dentro de la matriz, no su referencia que es lo que se crea al instancia el objeto.
	public boolean equals(Object o){
		Matriz matriz2 = (Matriz)o;
		if (this.columnas!=matriz2.columnas||this.renglones!=matriz2.renglones) {
			return false;		
		}
		for (int i = 0;i<renglones;i++) {
			for (int j=0;j<columnas;j++) {
				if (this.matriz[i][j]!=matriz2.obtenerDato(i,j)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public String toString(){ //Es el que se manda a llamar cuando pones el System.out.println
		String cadena = "";
		for (int i = 0;i<renglones;i++) {
			for (int j=0;j<columnas;j++) {
				cadena+=matriz[i][j]+" ";
			}
			cadena+="\n";
		}
		return cadena;
	}
}

