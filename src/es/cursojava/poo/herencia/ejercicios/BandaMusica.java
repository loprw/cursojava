package es.cursojava.poo.herencia.ejercicios;

public class BandaMusica {

	public static void main(String[] args) {
		
		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();

	}

	public void empezarConcierto() {
		
		Instrumento[] instrumentosBanda = inicializarInstrumentos();
		afinarInstrumentos(instrumentosBanda);
		tocarInstrumentos(instrumentosBanda);
					
	}
	
	public Instrumento[] inicializarInstrumentos() {
		
		Guitarra guitarra1 = new Guitarra("Rumbera", "Cuerda", 6);
		GuitarraElectrica guitarra2 = new GuitarraElectrica("Slash", "Cuerda", 8, 43.5);
		Piano piano1 = new Piano("Pianola", "Cuerda", 16, "Grande");
		Tambor tambor1 = new Tambor("Bombo", "Percusión", "Cuero");
		
		Instrumento[] instrumentosBanda = {guitarra1, guitarra2, piano1, tambor1};
		
		return instrumentosBanda;
	}
	
	public void afinarInstrumentos(Instrumento[] instrumentosBanda) {
		
		for (Instrumento instrumento:instrumentosBanda) {
			instrumento.afinar();
		}
	}
	
	public void tocarInstrumentos(Instrumento[] instrumentosBanda) {
		boolean suenaBien = true;
		
		for (int i = 0; i < instrumentosBanda.length; i++) {
			if (!instrumentosBanda[i].getClass().getName().equals("Tambor")) {
				instrumentosBanda[i].tocar();				
			} else {
				Tambor instrumentoTambor = (Tambor) instrumentosBanda[i];
				instrumentoTambor.aporrear();
			}
			
			if (!instrumentosBanda[i].getAfinado()) {
				suenaBien = false;				
			}
		}
		
		if (!suenaBien) {
			System.out.println("La banda suena mal.");
		}
	}
}
