package ejemplos;

import java.util.Scanner;

public class AlternativaSisinosi {
	// Admitimos tres numeros por teclado que exigimos al tontaina ese del
	// usuario, quien se ha creido que es, que sean diferentes
	// El programa nos dice si el mayor numero introducido ha sido el primero o
	// no
	//

	public static void main(String[] args) {
		int valorUno, valorDos, valorTres;
		Scanner leer = new Scanner(System.in);

		System.out.println("Leer numero valorUno: ");
		valorUno = leer.nextInt();
		System.out.println("Leer numero valorDos: ");
		valorDos = leer.nextInt();
		System.out.println("Leer numero valorTres: ");
		valorTres = leer.nextInt();

		if (valorUno != valorDos && valorDos != valorTres && valorUno != valorTres) {
			// utilizando sisinosi
			if (valorUno <= valorDos)
				System.out.println("el primero no es el mayor");
			else if (valorUno > valorTres) {
				System.out.println("el primero es el mayor");
			} else
				System.out.println("el primero no es el mayor");
		} else
			System.out.println("No te dije que diferentes?");
	}
}
