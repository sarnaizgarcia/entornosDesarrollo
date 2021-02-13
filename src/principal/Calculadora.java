package principal;

public class Calculadora {

	public static void main(String[] args) {
		
		/**
		 * Creamos un objeto <b> cociente </b> para utilizar los métodos de la clase.
		 * @author sarnaizgarcia.
		 * @version 2.2
		 * @since 13/02/2021
		 */
		
		Cociente c = new Cociente();

		double divReales = c.cocienteReales(10.5F, 3.5F);
		int divEnteros = c.cocienteEnteros(10, 5);
		double inv = c.inverso(10F);
		double raizCuadrada = c.raiz(16);

		System.out.println(divReales);
		System.out.println(divEnteros);
		System.out.println(inv);
		System.out.println(raizCuadrada);
		
		/**
		 * Creamos un objeto <b> resta </b> para utilizar los métodos de la clase.
		 * @author MerySagra
		 * @version 2.2
		 * @since 13/02/2021
		 */
		
		Resta r = new Resta();
		
		System.out.println(r.restaReales(50.6, 20.1));
		System.out.println(r.restaEnteros(70, 5));
		System.out.println(r.restaTresReales(70, 5, 12));
		System.out.println(r.acumulado(16));
		
		/**
		 * Creamos un objeto <b> Producto </b> para utilizar los métodos de la clase.
		 * @author guardiola
		 * @version 2.2
		 * @since 13/02/2021
		 */
		
		Producto p = new Producto();

		int multiplicacion2reales = p.multiplicar1 (5,7);
		float multiplicacion2enteros = p.multiplicar2 (3,5);
		int multiplicacion3reales = p.multiplicar3(4,7,5);
		double bases =p.multiplicar4 (9,6);

		System.out.println(multiplicacion2reales);
		System.out.println (multiplicacion2enteros);
		System.out.println(multiplicacion3reales);
		System.out.println(bases);
	}

}
