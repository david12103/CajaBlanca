package ejemplos;


import java.util.Scanner;

public class AlternativaDobleUno {
	// EJEMPLO 1: Algoritmo que lee dos n�meros distintos x e y , y determina
	// cual es el mayor dejando el resultado en una tercera variable de nombre
	// z.
	public static void main(String[] args) {
		int valorUno, valorDos, almacen;
		Scanner leer = new Scanner(System.in);

		System.out.println("Leer numero: ");
		valorUno = leer.nextInt();
		System.out.println("Leer numero: ");
		valorDos = leer.nextInt();

		if (valorUno > valorDos) {
			almacen = valorUno;
		} else
			almacen = valorDos;
		
		if(valorUno!=valorDos)
			System.out.println("El mayor numero es "+ almacen);
		else
			System.out.println("Los numeros son iguales");
	}
}
