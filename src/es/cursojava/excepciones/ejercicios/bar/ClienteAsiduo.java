package es.cursojava.excepciones.ejercicios.bar;

public class ClienteAsiduo extends ClienteCafetero {

	private String mote;

	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}
}
