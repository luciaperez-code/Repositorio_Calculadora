/**
 * Esta clase contiene los parametros de entrada y salida y los metodos para el calculo de operaciones matematicas
 * @author Roberto Diaz
 * @version 1.0
 * @since 27/01/2021
 */

public class Operacion {
			
	
	/**
	 * campos de la clase Operacion atributos de instancia
	 * n1,n2 numeros enteros de entrada para realizar calaculos
	 * resultado numero entero de salida
	 * n1real numero real de entrada para el metodo del porcentaje
	 */
	
	int n1,n2,resultado;
	double n1real;
	
	
		
	
	/**
	 * constructor vacio
	 */
	
	public Operacion() {
		super();
	}
	
	/**
	 * constructor con todos los parametros de entrada
	 * @param n1 El parametro n1 define el numero entero de entrada en los metodos esPrimo, I-esimo y factorial
	 * @param n2 El parametro n2 define el segundo numero entero de entrada(porcentaje) en el metodo porcentaje
	 * @param resultado El parametro resultado define el numero entero de salida realizado el calculo
	 * @param n1real El parametro n1real define el numero de real de entrada en el metodo porcentaje
	 *  
	 */
	
		
	public Operacion(int n1, int n2, int resultado, double n1real) {
		super();
		this.n1 = n2;
		this.n2 = n2;
		this.resultado = resultado;
		this.n1real = n1real;
	}
		
		
	
	/**
	 * getter 
	 * @return n1: numero entero de entrada para los metodos esPrimo, I-esimo, factorial
	 */
	public int getN1() {
		return n1;
	}

	/**
	 * setter
	 * @param n1: numero entero para calcular los metodos esPrimo, I-esimo, factorial
	 */
	
	public void setN1(int n1) {
		this.n1 = n1;
	}
	
	/**
	 * 
	 * @return n2: numero entero de entrada para introducir el porcentaje en el metodo porcentaje
	 */
	
	public int getN2() {
		return n2;
	}

	/**
	 * setter
	 * @param n2: numero entero para calcular el porcentaje en el metodo porcentaje
	 */
	
	public void setN2(int n2) {
		this.n2 = n2;
	}

	/**
	 * getter 
	 * @return n1real: numero real de entrada para el metodo porcentaje
	 */
	
	public double getn1real() {
		return n1real;
	}

	/**
	 * setter
	 * @param n1real: numero real para realizar el calculo en el metodo porcentaje
	 */
	
	public void n1real(double n1real) {
		this.n1real = n1real;
	}
	
	/**
	 * getter 
	 * @return resultado:  numero entero para recojer el resultado una vez ejecutados los metodos
	 */

	public int getResultado() {
		return resultado;
	}
	
	/**
	 * setter
	 * @param resultado: numero entero para mostrar los reultados de los calculos
	 */

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	/**
	 * metodo que sobreescribe los Strings
	 */
	@Override
	public String toString() {
		return "Operacion [n1=" + n1 + ", n2=" + n2 + ", resultado=" + resultado + ", n1real=" + n1real + "]";
	}
	
	/**
	 * metodo que indica si un numero entero es primo
	 * @param n1: numero entero de entrada
	 */

	public void EsPrimo(int n1) {
			
			int contador,i;
	        contador = 0;
	 
	        for(i = 1; i <= n1; i++){
	            if((n1 % i) == 0)
	                  contador++;
	        }
	 
	        if(contador <= 2)
	            System.out.println("El numero es primo");
	        else
	            System.out.println("El numero no es primo");
	          
	    }
	
	public void Iesimo() {
		
	}
	
	/**
	 * metodo para calcular porcentajes
	 * @param n1real: numero real de entrada
	 * @param n2: numero entero(porcentaje) para realizar el calculo
	 */
	
	public void Porcentaje(double n1real, int n2) {
		
		this.resultado = (int) ((n2 * n1real)/100);
        
        System.out.println("el resultado es : "+ this.resultado);
	}
	
	/**
	 * metodo para calcular el factorial de un numero
	 * @param n1: numero entero de entrada
	 */
	
	public void Factorial(int n1) {
		int i =1;
		int fact =1;
			for(i=1;i<=n1;i++) {
				fact=fact*i;
			}
			this.resultado=fact;
			
		System.out.println("el factorial de "+n1+" es : "+this.resultado);
	}
}