/**
 * Esta clase implementar� todos los m�todos relacionados con la suma de la calculadora
 * 
 * @author Luc�a P�rez
 * @version 2.0
 * @since 31/01/2021
 */

public class Suma {
		
	/**
	 * M�todo que suma dos n�meros reales
	 * @param param1 Sumando 1 real
	 * @param param2 Sumando 2 real
	 * @return Suma real con 2 par�metros
	 */
	public static double sumaReal (double param1, double param2) {
		double param3 = param1 + param2;
		return param3;
	}
	

	/**
	 * M�todo que suma dos n�meros enteros
	 * @param param1 Sumando 1 entero
	 * @param param2 Sumando 2 entero
	 * @return Suma entera con 2 par�metros
	 */
	
	public static int sumaEntera (int param1, int param2) {
		int param3 = param1 + param2;
		return param3;
	}
	
	/**
	 * M�todo que suma 3 n�meros reales
	 * @param param1 Sumando 1 real
	 * @param param2 Sumando 2 real
	 * @param param3 Sumando 2 real
	 * @return Suma real con 3 par�metros
	 */
	public static double sumaReal (double param1, double param2, double param3) {
		double param4 = param1 + param2 + param3;
		return param4;
	}

	/**
	 * Variable que acumula inicializada en 0
	 */
	private static int acumulado = 0;
	
	/**
	 * Hago un get por si alguien quiere ver el valor acumulado
	 * @return Acumulado
	 */
	public static int getAcumulado() {
		return acumulado;
	}

	/**
	 * M�todo que acumula la suma
	 * @param param1 Sumando que voy a acumular
	 * @return Suma acumulada
	 */
	public static int sumaAcumulada (int param1) {
		return acumulado += param1;
	}
	
	//Prueba de cambios 2.0
}
