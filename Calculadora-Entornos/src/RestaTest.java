import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {
	
	private Resta cut;
	
	@BeforeEach
	public void setUp () {
		// 1 Arrange = Preparar
		cut = new Resta();
	}
	
	@AfterEach
	public void tearDown() {
	}
	

	//Empiezo con los test de los metodos
	@Test
	void testRestar1() {
		// 1 Arrange = Preparar
		double a = 9.1;
		double b = 2.1;
		double esperadoResta1 = 7.0;
		
		// 2 - Act - Ejecutar
		double obtenidoResta1 = cut.restar1(a, b);
		
		// 3 - Assert = comprobar
		assertEquals(esperadoResta1, obtenidoResta1);
			
	}

	@Test
	void testResta2() {
		// 1 Arrange = Preparar
		int a = 9;
		int b = 2;
		int esperadoResta2 = 7;
			
		// 2 - Act - Ejecutar
		int obtenidoResta2 = cut.resta2(a, b);
			
		// 3 - Assert = comprobar
		assertEquals(esperadoResta2, obtenidoResta2);
					
	}

	@Test
	void testResta3() {
		// 1 Arrange = Preparar
		int a = 9;
		int b = 4;
		int c = 3;
		int esperadoResta3 = 2;
				
		// 2 - Act - Ejecutar
		int obtenidoResta3 = cut.resta3(a, b, c);
			
		// 3 - Assert = comprobar
		assertEquals(esperadoResta3, obtenidoResta3);
					
	}
	
	
	@Test
	void testValorAcumulado() {
		// 1 Arrange = Preparar
		int acumulado1 = 9;
		int esperadovalorAcumulado = 9;
				
		// 2 - Act - Ejecutar
		int obtenidovalorAcumulado = cut.valorAcumulado(acumulado1);
				
		// 3 - Assert = comprobar
		assertEquals(esperadovalorAcumulado, obtenidovalorAcumulado);
					
	}

	
	//Una vez hechos los test de los métodos, compruebo casos especiales
	
	/*
	 * La resta no tiene problemas con pasar 0 por parámetro
	 * Casos especiales: valores que pasen del límite de double o integer e infinito.
	 */
	
	@Test
	void testRestaMinValueInt() {
		
		// 1 Arrange = Preparar
		//Voy a restar los números más pequeños que acepta integer.
		int a = Integer.MIN_VALUE;
		int b = -2;
		int esperadoValoresAltos = -2147483646; 
		
		// Esperado: 1. Al principio salía: The literal -2147483650 of type double is out of range
		//			2. Siguiente opción: que se quedara estancado en el número máximo: int esperadoValoresAltos = -2147483648;
		//			3. Finalmente: cuando llega al final "rebota" y empieza a subir el número, resultado -2147483646
		
		// 2 - Act - Ejecutar
		int obtenidoValoresAltos = cut.resta2(a, b);
				
		// 3 - Assert = comprobar
		assertEquals(esperadoValoresAltos, obtenidoValoresAltos);
	}
	
	
	@Test
	void testRestaMinValueDouble() {
		
		// 1 Arrange = Preparar
		//Voy a restar los números más pequeños que acepta double. Double.MIN_VALUE = 4.9E-324
		double a = Double.MIN_VALUE;
		double b = Double.MIN_VALUE;
		double esperadoValoresAltos = 0.0; // The literal 4.9E-330 of type double is out of range
		
		// 2 - Act - Ejecutar
		double obtenidoValoresAltos = cut.restar1(a, b);
				
		// 3 - Assert = comprobar
		assertEquals(esperadoValoresAltos, obtenidoValoresAltos);
	}
	
	
	@Test
	void testRestaInfinito() {
		// 1 Arrange = Preparar
		double nInfiniteDouble = Double.NEGATIVE_INFINITY;
		double b = 1;
		double esperadoRestaInfinito = Double.NEGATIVE_INFINITY; //Esta era más predecible ya que el infinito es abstracto.
		
		// 2 - Act - Ejecutar
		double obtenidoRestaInfinito = cut.restar1(nInfiniteDouble, b);
				
		// 3 - Assert = comprobar
		assertEquals(esperadoRestaInfinito, obtenidoRestaInfinito);
					
	}
	
}
