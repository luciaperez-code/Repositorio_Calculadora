/**
 * 
 * Esta clase implementar� todos los m�todos que est�n relacionados con la resta de una calculadora.
 * de la calculadora.
 * ESTA CLASE ACEPTA NUMEROS NEGATIVOS
 *
 * 
 * @author David lara gonzalez
 * @version 2.1
 * @since 05/02/2021
 */
public class Resta {



	// estoy probando cambios y viendo como se sincroniza con GitHub
		
	/**
	 * 
	 * M�todo que devuelve la resta de dos numeros reales
	 * 
	 * @param a variable que utilizo.
	 * 
	 * @param b variable que utilizo.
	 * 
	 * 
	 * @return c variable que devuelve el resultado de la resta.
	 * 
	 * 
	 * 
	 */

	public static double restar1(double a, double b) {
		double c;
		c = a - b;
		return c;

	}

	/**
	 * 
	 * M�todo que devuelve la resta de numeros reales
	 * 
	 * @param a variable que utilizo.
	 * 
	 * @param b variable que utilizo.
	 * 
	 * @return c variable que utilizo donde acumulo el resultado de la resta.
	 * 
	 * 
	 * 
	 */
	public static int resta2(int a, int b) {
		int c;
		c = a - b;
		return c;
	}

	/**
	 * 
	 * M�todo que devuelve la resta de tres numeros reales.
	 * 
	 * @param a variable que utilizo.
	 * 
	 * @param b variable que utilizo.
	 * 
	 * @param c variable que utilizo.
	 * 
	 * 
	 * @return d devuelve el resultado de la resta.
	 * 
	 */
	public static int resta3(int a, int b, int c) {
		int d;
		d = a - b - c;
		return d;
	}

	/**
	 * 
	 * M�todo que devuelve la resta de dos numeros reales acumulados.
	 * 
	 * @param a variable que utilizo.
	 * 
	 * @return t donde guardo el valor acumulado.
	 * 
	 */

	public static int valorAcumulado(int a) {

		int acumulado;

		acumulado = a;
		return acumulado;
	}

}