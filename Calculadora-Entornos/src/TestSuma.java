/**
 * En esta clase pruebo el funcionamiento de la clase Suma y sus m�todos
 * Esto son ejemplos de prueba
 * @author Luc�a P�rez
 * @version 1.0
 * @since 31/01/2021
 * 
 */
public class TestSuma {

	public static void main(String[] args) {
				
		System.out.println("Suma real 2 n�meros, 2.1 y 2.2 --> " + Suma.sumaReal(2.1, 2.2));
		System.out.println("Suma entera 2 n�meros, 21 y 22 --> " + Suma.sumaEntera(Integer.MAX_VALUE, 1));
		System.out.println("Suma real 3 n�meros, 2.1, 6.7 y 3.2 --> " + Suma.sumaReal(2.1, 6.7, 3.2));
		System.out.println("Acumulado +2: " + Suma.sumaAcumulada(2));
		System.out.println("Acumulado +5: " + Suma.sumaAcumulada(5));
		System.out.println(Suma.sumaEntera(-2, -1));
		
	}

}
