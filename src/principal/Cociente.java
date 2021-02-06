package principal;

import java.util.*;

/**
 * @author sarnaizgarcia
 * Esta clase implementa los metodos relacionados con la division de la clase Calculadora
 */

public class Cociente {

	/**
	 * Este metodo divide dos numeros enteros
	 * 
	 * @param f1 dividendo real
	 * @param f2 divisor real
	 * 
	 * @return division de f1/f2
	 */

	public float cocienteReales(float f1, float f2) {
		return (f1/f2);
	}

	/**
	 * Este metodo divide dos numeros reales
	 * 
	 * @param n1 dividendo entero
	 * @param n2 divisor entero
	 * 
	 * @return division de n1/n2
	 */

	public int cocienteEnteros(int n1, int n2) {
		return (n1/n2);
	}

	/**
	 * Este metodo calcula el inverso de un numero
	 * 
	 * @param x
	 * 
	 * @return inverso de x
	 */

	public float inverso(float x) {
		return (1/x);
	}

	/**
	 * Este metodo calcula la raiz cuadrada de un numero
	 * 
	 * @param y
	 * 
	 * @return raiz cuadrada de y
	 */

	public double raiz(int y) {
		return Math.sqrt(y);
	}

}