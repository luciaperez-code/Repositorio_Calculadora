package Apartado5;

import java.util.Scanner;

/**
 * esta clase implemeta todos los metodos esPrimo, I-esimo, porcentaje y factorial
 * @author Roberto Diaz
 * @version 1.0
 */

public class Calculadora {

	
	public static void main(String[] args) {
		
		/**
		 * inicio de las variables para acumular los valores de entrada
		 * 
		 */
		int n1=0,n2=0;
		double n1real=0;
		Scanner leerOperacion = new Scanner(System.in); 
		Scanner numero = new Scanner(System.in);
		
		/**
		 * constructores para iniciar los metodos
		 */
		
		Operacion operacionPrimo = new Operacion();
		Operacion operacionIesimo = new Operacion();
		Operacion operacionPorcentaje = new Operacion();
		Operacion operacionFactorial = new Operacion();
		
		/**
		 * eleccion de la operacion a realizar
		 */
		
		System.out.println("elija una operacion :\n"+"esprimo - Para saber si un numero es Primo\n"+"iesimo - Para eso...\n"
				+"porcentaje - calcular el procentaje\n"+"factorial - calcular el factorial de un numero\n");
		/**
		 * varaiable de clase que recoje la operacon seleccionada
		 */
		
		String operacion = leerOperacion.nextLine();
		
		/**
		 * comparamos la operacion y recojemos el valor n1 para el calculo invocamos al metodo esPrimo
		 */
		
		if (operacion.equals("esprimo")) {
			System.out.println("introduzca numero");
			n1= numero.nextInt();
			operacionPrimo.EsPrimo(n1);
		}
		
		/**
		 * comparamos la operacion y recojemos el valor n1 para el calculo e invocamos al metodo iesimo 
		 */
		
		if (operacion.equals("iesimo")) {
			System.out.println("introduzca numero");
			n1= numero.nextInt();
			operacionIesimo.Iesimo();
		}
		
		/**
		 * comparamos la operacion y recojemos los valores n1real y n2 para el calculo e invocamos al metodo porcentaje 
		 */
		
		if (operacion.equals("porcentaje")) {
			System.out.println("introduzca  el primer numero ");
			n1real= numero.nextDouble();
			System.out.println("introduzca  el porcentaje ");
			n2= numero.nextInt();
			operacionPorcentaje.Porcentaje(n1real,n2);
		}
		
		/**
		 * comparamos la operacion y recojemos el valor n1 para el calculo e invocamos al metodo factorial
		 */
		
		if (operacion.equals("factorial")) {
			System.out.println("introduzca numero");
			n1 = numero.nextInt();
			if ((n1<0)||(n1==0))
				System.out.println("Introduzca un numero mayor de 0");
			else
			operacionFactorial.Factorial(n1);
		}
		/**
		 * cerramos las variables tipo scanner
		 */
		leerOperacion.close();
		numero.close();
	}

}
