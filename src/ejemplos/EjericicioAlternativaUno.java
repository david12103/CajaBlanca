package ejemplos;

import java.util.Scanner;

public class EjericicioAlternativaUno {
	// Muestra el mayor numero introducido por teclado, entre tres
	public static void main(String[] args) {
		int valorUno, valorDos, valorTres;
		Scanner leer = new Scanner(System.in);

		System.out.println("Leer numero valorUno: ");
		valorUno = leer.nextInt();
		System.out.println("Leer numero valorDos: ");
		valorDos = leer.nextInt();
		System.out.println("Leer numero valorTres: ");
		valorTres = leer.nextInt();

		if (valorUno >= valorDos)
			if (valorUno >= valorTres)
				System.out.println("el mayor es el uno");
			else
				System.out.println("El mayor es el tres");
		else if (valorDos >= valorTres)
			System.out.println("el mayor es el dos");
		else
			System.out.println("el mayor es el tres");

	}
}
