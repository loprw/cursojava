package es.cursojava.poo.herencia.interfaces.ejercicios.pago;

import es.cursojava.inicio.funciones.Utilidades;
import es.cursojava.poo.ejercicios.Maniqui;
import es.cursojava.poo.ejercicios.Tienda;

public class MainPago {

	public static void main(String[] args) {

		MainPago compra = new MainPago();
		compra.menuCompra();

	}

	public void menuCompra() {

		final int SALIDA = 0;
		int opcion;
		Tienda tienda = new Tienda("Tienda Importante Especial Nunca Da Añadidos");
		Maniqui[] maniquies = tienda.abrirTienda();

		do {
			opcion = Utilidades.pideDatoNumerico("Bienvenido/a a " + tienda.getNombre()
					+ "\nEscoja  el número de opción que desea realizar:\n\t0. Salir.\n\t1. Comprar pantalón por "
					+ maniquies[1].getPantalon().getPrecio() + " euros.\n\t2. Comprar camisa por "
					+ maniquies[1].getCamisa().getPrecio() + " euros.\n\t3. Comprar vestido por "
					+ maniquies[2].getVestido().getPrecio() + " euros.");
			int valor = opcion - 1;

			switch (opcion) {
			case 0 -> System.out.println("¡Adiós!");
			case 1 -> {
				menuPago(maniquies[1].getPantalon().getPrecio());
				break;
			}
			case 2 -> {
				menuPago(maniquies[1].getCamisa().getPrecio());
				break;
			}
			case 3 -> {
				menuPago(maniquies[valor].getVestido().getPrecio());
				break;
			}
			default -> System.out.println("Ha indicado un número incorrecto.");
			}

		} while (opcion != SALIDA);
	}

	public void menuPago(double monto) {

		final int SALIDA = 0;
		int opcion;

		do {
			opcion = Utilidades.pideDatoNumerico(
					"Bienvenido a la pasarela de pagos.\n\nEscoja una opción a través del número:\n\t0. Salir."
							+ "\n\t1. Pago mediante Paypal.\n\t2. Pago mediante criptomonedas."
							+ "\n\t3. Pago mediante tarjeta de crédito.");
			int valor = opcion - 1;
			Pago[] pagos = crearPagos();

			switch (opcion) {
			case 0 -> System.out.println("¡Adiós!");
			case 1, 2, 3 -> ProcesadorPagos.realizarPago(pagos[valor], monto);
			default -> System.out.println("Ha indicado un número incorrecto.");
			}
		} while (opcion != SALIDA);
	}

	private Pago[] crearPagos() {

		PagoPayPal paypal = new PagoPayPal();
		PagoCriptomonedas cripto = new PagoCriptomonedas();
		PagoTarjetaCredito tarjeta = new PagoTarjetaCredito();

		Pago[] formaPago = { paypal, cripto, tarjeta };

		return formaPago;
	}
	
	private void metodoPago(Pago[] pagos) {
		
		for (Pago pago : pagos) {
			int cantidad = Utilidades.pideDatoNumerico("Introduce cantidad a pagar");
			ProcesadorPagos.realizarPago(pago, cantidad);
		}
	}
}
