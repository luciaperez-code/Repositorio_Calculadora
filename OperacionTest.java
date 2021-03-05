import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Esta clase implementará una serie de metodos matematicos
 * 
 * @author David lara
 * @version 3.8
 * @since 18/02/2021
 */

public class OperacionTest {

	

	@Test
	public void testEsPrimo() {
		/**
		 * @apiNote este test va a medir si un numero es primo
		 */
		int b = 4;

		Operacion.EsPrimo(b);

		/**
		 * @apiNote ahora con un numero que es primo
		 */
		int c = 5;

		Operacion.EsPrimo(c);

	}

	
	@Test
	public void testIesimo() {
		/**
		 * @apiNote este test va a medir el numero I-esimo
		 * 
		 * 
		 */
		
		
		
		fail("Not yet implemented");
	}

	
	@Test
	public void testPorcentaje() {
		/**
		 * @apiNote este test saca un porcentaje
		 * 
		 * 
		 */
		
		double n1 = 2;

		double n2 = 5;
		Operacion.Porcentaje(n1, n2);

		/**
		 * @apiNote ahora con un numero negativo
		 */

		double n3 = 2;

		double n4 = -5;
		Operacion.Porcentaje(n3, n4);

	}

	
	@Test
	public void testFactorial() {
		/**
		 * @apiNote este test va a sacar el factorial de un numero.
		 * 
		 * 
		 */
		int b = 4;

		Operacion.Factorial(b);

		/**
		 * @apiNote ahora con un numero negativo
		 */

		int a = -6;

		Operacion.Factorial(a);
	}

}
