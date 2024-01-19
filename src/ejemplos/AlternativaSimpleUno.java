package ejemplos;


import java.util.Scanner;

public class AlternativaSimpleUno {
	// Ejemplo uno alternativa simple
	/*
	 * Algoritmo que lee dos valores num�ricos y los almacena en dos variables
	 * de nombre x y z, mostrando en aquellos casos en los que X > Z
	 */
	public static void main(String[] args) {
		// datos
		float valorUno, valorDos;
		Scanner leer = new Scanner(System.in);
		// algoritmo

		System.out.println("mete el valor de x");
		valorUno = leer.nextInt();
		System.out.println("mete el valor de z");
		valorDos = leer.nextInt();
		// Si la ue de la estructura es de una sola linea
		// no es obligatorio el uso de llaves
		if (valorUno > valorDos) {
			System.out.println("X es mayor que Z");
			System.out.println("comentario inutil");
		}

	}
}
