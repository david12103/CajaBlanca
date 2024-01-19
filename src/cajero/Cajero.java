package cajero;
import java.util.Scanner;

public class Cajero {
	static int saldoBanco = 500;
	static String tarjetaBanco = "16";
	static int saldoMaquina = 1000;

	// El modulo raiz
	public static void main(String[] args) {
		String numeroTarjeta = leerNumeroTarjeta();
		String pinSecretoTarjeta = leerPinSecretoTarjeta();
		String pinUsuario;
		boolean comprobarPin;
		int errores = 0;
		int maximosIntentos = 3;
		do {
			pinUsuario = leerPinUsuario();
			comprobarPin = comprobarPin(pinSecretoTarjeta, pinUsuario);
			if (!comprobarPin) {
				informarErrorPinInvalido();
				errores++;
			} else {
				solicitarOperacion(numeroTarjeta);
			}
		} while (errores < maximosIntentos && !comprobarPin);

	}

	private static void solicitarOperacion(String numeroTarjeta) {
		if (pedirTipoOperacion()) {
			verSaldo(numeroTarjeta);
		} else {
			sacarDinero(numeroTarjeta);
		}

	}

	private static void verSaldo(String numeroTarjeta) {
		//saldoBanco es otra variable global
		System.out.println("El saldo de la tarjeta "+numeroTarjeta+" es "+saldoBanco);
	}

	private static boolean pedirTipoOperacion() {
		char charAt;
		char saldoOperacion = 's';
		char saldoRetiro = 'r';
		do {
			Scanner leer = new Scanner(System.in);
			System.out.println("s para saldo o r para retirar importe");
			charAt = leer.nextLine().charAt(0);
		} while (charAt != saldoOperacion || charAt != saldoRetiro);
		return charAt==saldoOperacion;
	}

	/**
	 * Obtener el identificador de la tarjeta
	 * 
	 * @return el numero identificador de la tarjeta
	 */
	public static String leerNumeroTarjeta() {
		return "987654321";
	}

	/**
	 * Obtener el pin secreto de la tarjeta
	 * 
	 * @return el pin de la tarjeta
	 */
	public static String leerPinSecretoTarjeta() {
		// Este dato esta en la tarjeta, como no existe
		// realmente me tengo que inventar un numero secreto
		return "1234";
	}

	/**
	 * Obtener el pin del usuario
	 * 
	 * @return el pin
	 */
	public static String leerPinUsuario() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe el pin");
		return leer.nextLine();
	}

	/**
	 * Informa de que el pin del usuario no coincide con el secreto
	 */
	public static void informarErrorPinInvalido() {
		System.out.println("el pin no es correcto");
	}

	/**
	 * Comprueba si el pin del usuario es igual al pin secreto
	 * 
	 * @param pinSecreto leido de la tarjeta
	 * @param pinUsuario proporcionado por el usuario
	 * @return true si son iguales y false en caso contrario
	 */
	public static boolean comprobarPin(String pinSecreto, String pinUsuario) {
		boolean equals = pinSecreto.equals(pinUsuario);
		if (!equals)
			informarErrorPinInvalido();
		return equals;
	}

	/**
	 * Pide al usuario que introduzca una cantidad
	 * 
	 * @return el valor de la cantidad del importe
	 */
	public static int solicitarImporte() {
		Scanner leer = new Scanner(System.in);
		System.out.println("escriba la cantidad del importe");
		return leer.nextInt();
	}

	/**
	 * comprueba si hay dinero suficiente en la maquina
	 * 
	 * @param importe la cantidada retirar
	 * @return true si hay dinero suficiente y false en caso contrario
	 */
	public static boolean comprobarCajero(int importe) {
		// Saldo inventado, como si me lo dijera la maquina
		// la variable saldoMaquina es global. la puedes ver arriba del todo
		// es accesible desde todo el archivo (o clase)
		return importe <= saldoMaquina;
	}

	/**
	 * Comprueba si el saldo del cajero y del banco son suficientes para satisfacer
	 * la operacion
	 * 
	 * @param tarjeta identificador de la tarjeta
	 * @param importe la cantidad solicitada
	 * @return true si la operacion se puede realizar y false en caso contrario
	 */
	public static boolean comprobarImporte(String tarjeta, int importe) {
		boolean comprobarCajero = comprobarCajero(importe);
		boolean aprobacionBanco = false;
		if (comprobarCajero) {
			aprobacionBanco = comprobarBanco(tarjeta, importe);
		}
		return aprobacionBanco;
	}

	/**
	 * Informa al cajero y al banco de que la operacion se puede realizar para que
	 * estos resten el importe a los saldos
	 * 
	 * @param tarjeta donde se realiza la operacion
	 * @param importe cantidad solicitada
	 */
	public static void finalizarOperacion(String tarjeta, int importe) {
		if (tarjetaBanco.equals(tarjeta)) {
			saldoBanco = saldoBanco - importe;
			saldoMaquina -= importe;
		}
	}

	/**
	 * realizamos la operacion de retirada de dinero
	 * 
	 * @param tarjeta identificador para validar operacion
	 */
	public static void sacarDinero(String tarjeta) {
		int importe = solicitarImporte();
		boolean comprobarImporte = comprobarImporte(tarjeta, importe);
		if (comprobarImporte) {
			finalizarOperacion(tarjeta, importe);
		}
	}

	/**
	 * Comprueba si el saldo de la tarjeta es superior o igual al importe
	 * 
	 * @param numeroTarjeta del usuario
	 * @param importe       lo que se quiere retirar
	 * @return true si el saldo es sufiente y false en caso contrario
	 */
	public static boolean comprobarBanco(String numeroTarjeta, int importe) {
		return numeroTarjeta.equals(tarjetaBanco) && importe <= saldoBanco;
	}
}
