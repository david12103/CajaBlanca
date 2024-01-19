package ejemplos;


import java.util.Scanner;

public class AlternativaMultipleUno {
	public static void main(String[] args) {
		/*
		 * Algoritmo que lee una letra y nos dice si es una a,e, i, o, u o si no
		 * es vocal
		 */
		char letra;
		Scanner leer = new Scanner(System.in);

		// hay un problema: no se pueden leer letras del teclado
		// Solo podemos utilizar un recurso algo enrevesado
		// paso 1: Utilizo una cadena de caracteres
		String cadena = new String();
		// paso 2 leer la cadena del teclado (esto si existe)
		cadena = leer.nextLine();
		// paso 3 Cogemos la primera letra de la cadena
		letra = cadena.charAt(0);

		// Vamos a usar la estructura de alternativa multiple
		// palabra clave switch y entre parentesis el valor que me vale para
		// seleccionar una opcion. Debe ser una expresion.
		switch (letra) {
		// por cada opcion que mer interese creo un caso especifico con la
		// palabra
		// clave case
		case 'a':
			System.out.println("Es mi primera vez");
			System.out.println("creo que es una a: deja que te lo mire");
			System.out.println("si: es una a");
			// cada opcion termina con la palabra clave break (que es opcional)
			break;
		case 'e':
			System.out.println("Es una e");
			break;
		case 'i':
			System.out.println("Es una i");
			break;
		case 'o':
			System.out.println("Es una o");
			break;
		case 'u':
			System.out.println("Es una u");
			break;
		// Opcionalmente se puede poner un caso por defecto, es decir, si no se
		// cumple ningun caso de los anteriores haz esto
		default:
			System.out.println("no es una vocal");
			break;
		}
	}
}
