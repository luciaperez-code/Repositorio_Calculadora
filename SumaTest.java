import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void testSumaRealDoubleDouble() {

		double a = 10;
		double b = 5;
		double c;

		c = Suma.sumaReal(a, b);
		System.out.println(c);

		/**
		 * 
		 * 
		 * @apiNote ahora vamos a probar el methodo con numeros negativos.
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

		int a = 10;
		int b = 5;
		int c;

		c = Suma.sumaEntera(a, b);
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

		
	}

	@Test
	public void testSumaRealDoubleDoubleDouble() {

		double a = 10;
		double b = 5;
		double c = 20;
		double d;

		d = Suma.sumaReal(a, b, c);
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
	public void testGetAcumulado() {

		/**
		 * @apiNote aqui no hay que hacer nada
		 */

		fail("Not yet implemented");
	}

	@Test
	public void testSumaAcumulada() {

		/**
		 * 
		 * 
		 * @apiNote ahora prueba la sumaAcumulado metiendoun numero y pidiendo que lo
		 *          devuelva.
		 * 
		 * 
		 */
		int a = 5;

		Suma.sumaAcumulada(a);

		System.out.println("sumaAcumulada es : " + Suma.sumaAcumulada(a));

		
	}

}
