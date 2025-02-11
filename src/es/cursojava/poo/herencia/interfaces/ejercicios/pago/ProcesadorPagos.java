package es.cursojava.poo.herencia.interfaces.ejercicios.pago;

public class ProcesadorPagos {
	
	public static void realizarPago(Pago metodoPago, double monto) {
		metodoPago.procesarPago(monto);
	}
}
