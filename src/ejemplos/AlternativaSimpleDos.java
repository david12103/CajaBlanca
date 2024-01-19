package ejemplos;


import java.util.Scanner;

public class AlternativaSimpleDos {

	// EJEMPLO 2: Algoritmo que lee un n�mero y muestra si el n�mero mayor
	// que 5.
	public static void main(String[] args){
		float numero;
		Scanner leer=new Scanner(System.in);
		 
		 System.out.println("Leer numero: ");
		 numero = leer.nextInt();
		 
		 if (numero>5)
		 			 System.out.println("Cinco");
		 
	}

}
