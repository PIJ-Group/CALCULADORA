package com.edix.calculadora;

/**
 * <h2>Clase Calculadora, representa una calculadora y varios de sus métodos
 * para realizar operaciones aritméticas.</h2>
 * 
 * A través de la clase calculadora, se puede llamar a los métodos de las clases
 * suma, resta, producto y cociente.<br>
 * 
 * Los parámetros y resultados tienen que cumplir unas reglas, en caso contrario
 * obtendremos los siguientes códigos de error:
 * <ul>
 * <li>-100 Error al introducir un parámetro negativo.
 * <li>-101 Error al introducir el valor cero como parámetro.
 * <li>-102 Error al sobrepasar el valor máximo permitido del parámetro.
 * <li>-103 Error al sobrepasar el valor maximo permitido del resultado.
 * </ul>
 * 
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Cociente
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 *
 */

public class Calculadora {
	/**
	 * Este es el método principal donde se va a ejecutar la calculadora.
	 * 
	 * 
	 * @param args Argumentos de la línea de comandos.
	 */

	public static void main(String[] args) {
		
    // Pruebas correspondientes a la clase Suma.
   	Suma sum=new Suma();
    
		System.out.println(sum.sumaDosEnteros(5, -1));
		System.out.println(sum.sumaDosReales(41561.1451,5646.54654));
		System.out.println(sum.sumaTresReales(9, 5, -2));
		sum.acumulador(44242);
		System.out.println(sum.acumulado);
		
		// Pruebas correspondientes a la clase Resta.		
		Resta resta = new Resta();
				
		System.out.println("Resta de dos enteros : " + resta.restaDosEnteros(80,32));
		System.out.println("Resta de dos reales : " + resta.restaDosReales(100.50,47.8));
		System.out.println("Resta de dos reales : " + resta.restaTresReales(100.50,47.8, 35.90));
		
		resta.acumulador(1000);
		System.out.println(resta.getAcumulado());
		resta.acumulador(200);
		System.out.println(resta.getAcumulado());
		
    // Pruebas correspondientes a la clase Producto.
		Producto pro = new Producto();
		
		
		System.out.println(pro.productoDosEnteros(-8, 200000));
		System.out.println(pro.productoDosReales(2137483648,1 ));
		System.out.println(pro.productoTresReales(2147483645, 5, 2));
		System.out.println(pro.potencia(58, 2));
		
		// Pruebas correspondientes a la clase Cociente.	
    Cociente cociente = new Cociente();
    
		System.out.println("Cociente de dos enteros : " + cociente.cocienteDosEnteros(1500, 92));
		System.out.println("Cociente de dos enteros : " + cociente.cocienteDosReales(185.93, 25.50));
		System.out.println("Inverso : " + cociente.inverso(25));
		System.out.println("Raíz cuadrada : " + cociente.raiz(50));
		

	}

}
