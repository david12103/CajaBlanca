package ejemplos;


import java.util.Scanner;

public class AlternativaSimpleTres {
	// Ejemplo tres alternativa simple
	/*
	 * Algoritmo que pida un n�mero y si este es m�ltiplo de 5 lo indique en un
	 * mensaje.
	 */
	public static void main(String[] args) {
		float numero;
		Scanner leer = new Scanner(System.in);

		System.out.println("Leer numero: ");
		numero = leer.nextInt();

		if (numero % 5==0)
			System.out.println("multiplo Cinco");

	}
}
