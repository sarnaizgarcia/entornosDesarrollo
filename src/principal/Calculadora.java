package principal;

public class Calculadora {

	public static void main(String[] args) {
		Cociente c = new Cociente();

		double divReales = c.cocienteReales(10.5F, 3.5F);
		int divEnteros = c.cocienteEnteros(10, 5);
		double inv = c.inverso(10F);
		double raizCuadrada = c.raiz(16);

		System.out.println(divReales);
		System.out.println(divEnteros);
		System.out.println(inv);
		System.out.println(raizCuadrada);
	}

}
