package es.cursojava.poo.herencia.interfaces.ejercicios.pago;

public class PagoTarjetaCredito implements Pago {

	@Override
	public void procesarPago(double monto) {
		System.out.println("Se está pagando " + monto + " a través de tarjeta de crédito.");
	}
}
