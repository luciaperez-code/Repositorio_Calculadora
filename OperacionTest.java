import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Esta clase implementará una serie de test de los metodos matematicos
 * 
 * @author David lara
 * @version 3.8
 * @since 18/02/2021
 */
// Empiezo con los test de los metodos

public class OperacionTest {

	

	@Test
	public void testEsPrimo() {
		
		/**
		 * @apiNote este test va a medir si un numero es primo
		 */
		
		// 1 Arrange = Preparar
		
		int b = 4;
		
		// 2-3 - Act - Ejecutar y  comoprobar
		
		Operacion.EsPrimo(b);

		
		/**
		 * @apiNote ahora con un numero que es primo
		 */
		
		// 1 Arrange = Preparar
		
		int c = 5;
		
		// 2-3 - Act - Ejecutar y  comoprobar
		
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
		
		// 1 Arrange = Preparar
		
		double n1 = 2;

		double n2 = 5;
		
		// 2-3 - Act - Ejecutar y  comoprobar
		
		Operacion.Porcentaje(n1, n2);

		/**
		 * @apiNote ahora con un numero negativo
		 */
		
		// 1 Arrange = Preparar
		
		double n3 = 2;

		double n4 = -5;
		
		// 2-3 - Act - Ejecutar y  comoprobar
		
		Operacion.Porcentaje(n3, n4);

	}

	
	@Test
	public void testFactorial() {
		
		/**
		 * @apiNote este test va a sacar el factorial de un numero.
		 * 
		 * 
		 */
		
		// 1 Arrange = Preparar
		
		int b = 4;
		
		// 2-3 - Act - Ejecutar y  comoprobar
	
		Operacion.Factorial(b);

		/**
		 * @apiNote ahora con un numero negativo
		 */
		
		// 1 Arrange = Preparar
		
		int a = -6;
		
		// 2-3 - Act - Ejecutar y  comoprobar
		
		Operacion.Factorial(a);
	}

}
