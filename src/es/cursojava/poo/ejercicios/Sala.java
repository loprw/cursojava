package es.cursojava.poo.ejercicios;

public class Sala {

	private int numero;
	private String tituloPelicula;
	private String[][] butacas;
	
	public Sala(int numero, String tituloPelicula, String[][] butacas) {
		this.numero = numero;
		this.tituloPelicula = tituloPelicula;
		this.butacas = butacas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public String[][] getButacas() {
		return butacas;
	}

	public void setButacas(String[][] butacas) {
		this.butacas = butacas;
	}
	
	public void iniciarDia() {
		
		for (int columna = 0; columna < butacas.length; columna++) {
			for (int filas = 0; filas < butacas[columna].length; filas++) {
				butacas[columna][filas] = "\tO";
			}
		}
	}
	
	public void mostrarButacas() {
		
		for (String[] columnas:butacas) {
			System.out.println();
			for (String fila:columnas) {
				System.out.print(fila);
			}
		}
	}
	
	public int contarButacasVacias() {
		
		int contadorButacasVacias = 0;
		
		for (String[] columnas:butacas) {
			System.out.println();
			for (String fila:columnas) {
				if (fila == "\tO") {
					contadorButacasVacias++;
				}
			}
		}
		
		return contadorButacasVacias;
	}
	
	public int contarTotalButacas() {
		
		int totalButacas = 0;
		
		for (String[] columnas:butacas) {
			for (int i = 0; i < columnas.length; i++) {
				totalButacas++;
			}
		}
		
		return totalButacas;
	}

	
}