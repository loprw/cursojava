package es.cursojava.poo.herencia.interfaces.ejercicios.pago;

public class ProcesadorPagos {
	
	public void realizarPago(Pago metodoPago, double monto) {
		metodoPago.procesarPago(monto);
	}
}
