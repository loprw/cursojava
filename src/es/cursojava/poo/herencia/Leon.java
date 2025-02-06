package es.cursojava.poo.herencia;

//de base, si Animal tiene un constructor añadido y ninguno vacío, la clase Leon daría error si no tiene constructor propio.
public class Leon extends Animal {
	
	private boolean tieneMelena;
	
	public Leon(String nombre, double peso, boolean tieneMelena) {
		super(nombre, peso);
		this.tieneMelena = tieneMelena;
	}
	
		
    public boolean isTieneMelena() {
		return tieneMelena;
	}

	public void setTieneMelena(boolean tieneMelena) {
		this.tieneMelena = tieneMelena;
	}

	public void cazar(){
        System.out.println("El leon "+ this.getNombre() +" está cazando");
    }

    
    //Override (sobreescritura) ampliando funcionalidad.
	@Override
	public void comer() {
		super.comer();
		System.out.println("Ferozmente");
	}

    

}
