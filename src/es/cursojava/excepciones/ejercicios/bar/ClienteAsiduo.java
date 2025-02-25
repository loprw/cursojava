package es.cursojava.excepciones.ejercicios.bar;

public class ClienteAsiduo extends Cliente implements Cafeteable {

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
	
	@Override
	public void beberCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException {
		System.out.println("El cliente asiduo " + getMote() + " está tomando café...");
		if (cafe.getTemperatura() > 80) {
			throw new TooHotTemperatureException("¡Quema!");
		} else if (cafe.getTemperatura() < 20) {
			throw new TooColdTemperatureException("¡Muy frío!");
		} else {
			System.out.println("Disfruta del café " + cafe.getTipoCafe());
		}
	}
}
