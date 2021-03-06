import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author roberto
 * @version 1.1
 * @since 05/03/2021
 * 
 */
public class SumaTest {

	// Empiezo con los test de los metodos

	@Test
	public void testSumaRealDoubleDouble() {
		
		// 1 Arrange = Preparar
		
		double a = 10;
		double b = 5;
		double c;
		
		// 2 - Act - Ejecutar

		c = Suma.sumaReal(a, b);

		// 3 - Assert = comprobar
	
		System.out.println(c);

		/**
		 * 
		 * 
		 * @apiNote ahora vamos a probar el metodo con numeros negativos.
		 * 
		 * 
		 */

		a = -5;
		b = 10;
		c = 0;

		c = Suma.sumaReal(a, b);
		System.out.println(c);

		/**
		 * 
		 * 
		 * @apiNote ahora vamos a probar el methodo asignando 0.
		 * 
		 * @apiNote seguiremos el diagrama a=b.
		 */
		a = 0;
		b = 0;
		c = 0;

		c = Suma.sumaReal(a, b);
		System.out.println(c);

	}

	@Test
	public void testSumaEntera() {
		
		// 1 Arrange = Preparar
		
		int a = 10;
		int b = 5;
		int c;
		
		// 2 - Act - Ejecutar
		
		c = Suma.sumaEntera(a, b);

		// 3 - Assert = comprobar
	
		
		System.out.println(c);
		/**
		 * 
		 * 
		 * @apiNote probando el methodo con numeros negativos.
		 * 
		 * 
		 */

		a = 5;
		b = -10;
		c = 0;

		c = Suma.sumaEntera(a, b);
		System.out.println(c);

		/**
		 * 
		 * 
		 * @apiNote ahora vamos a probar el methodo asignando 0.
		 * 
		 * @apiNote seguiremos el diagrama a=b.
		 */
		a = 0;
		b = 0;
		c = 0;

		c = Suma.sumaEntera(a, b);
		System.out.println(c);

		/**
		 * 
		 * 
		 * probando con integer max value
		 * 
		 * probando con integer min value
		 */

		c = +999999999;

		System.out.println(c + Integer.MAX_VALUE);

		c = -999999999;
		System.out.println(c + Integer.MIN_VALUE);

	}

	@Test
	public void testSumaRealDoubleDoubleDouble() {

		// 1 Arrange = Preparar
	
		double a = 10;
		double b = 5;
		double c = 20;
		double d;

		// 2 - Act - Ejecutar
		
		d = Suma.sumaReal(a, b, c);

		// 3 - Assert = comprobar
		
		System.out.println(d);
		
		/**
		 * 
		 * 
		 * @apiNote probando el methodo con numeros negativos.
		 * 
		 * 
		 */

		a = 5;
		b = -10;
		c = 0;

		d = Suma.sumaReal(a, b, c);
		System.out.println(c);

		/**
		 * 
		 * 
		 * @apiNote ahora vamos a probar el methodo asignando 0.
		 * 
		 * @apiNote seguiremos el diagrama a=b.
		 */
		a = 0;
		b = 0;
		c = 0;

		d = Suma.sumaReal(a, b, c);
		System.out.println(c);

	}

	@Test
	public void testSumaAcumulada() {

		/**
		 * 
		 * 
		 * @apiNote ahora prueba la sumaAcumulado metiendo un numero y pidiendo que lo
		 *          devuelva.
		 * 
		 * 
		 */

		// 1 Arrange = Preparar
		
		int a = 5;
		
		// 2 - Act - Ejecutar
		
		Suma.sumaAcumulada(a);
		
		// 3 - Assert = comprobar
		
		System.out.println("sumaAcumulada es : " + Suma.sumaAcumulada(a));

	}

}
