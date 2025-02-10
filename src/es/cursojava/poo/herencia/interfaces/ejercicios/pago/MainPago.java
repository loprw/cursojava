package es.cursojava.poo.herencia.interfaces.ejercicios.pago;

public class MainPago {

	public static void main(String[] args) {
		
		MainPago compra = new MainPago();
		
	}
	
	private Pago[] crearPagos() {
		
		PagoPayPal paypal = new PagoPayPal();
		PagoCriptomonedas cripto = new PagoCriptomonedas();
		PagoTarjetaCredito tarjeta = new PagoTarjetaCredito();
		
		Pago[] formaPago = {paypal,cripto, tarjeta};
		
		return formaPago;
	}
}
