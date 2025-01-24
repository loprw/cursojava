package es.cursojava.poo.ejercicios;

public class Tienda {

	private String nombre;

	public Tienda(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public static void main(String[] args) {

		Tienda tienda1 = new Tienda("Tienda Importante Especial Nunca Da Añadidos");
		Maniqui[] maniquies = tienda1.abrirTienda();
		tienda1.mostrarEscaparate(tienda1, maniquies);
		tienda1.cerrarTienda(maniquies);

	}

	public Maniqui[] abrirTienda() {

		Boton boton1 = new Boton("rojo", "diminuto", "redonda");
		Boton boton2 = new Boton("azul", "enorme", "cuadrada");
		Boton boton3 = new Boton("amarillo", "grande", "rectangular");
		Boton boton4 = new Boton("verde", "normal", "hexagonal");

		Boton[] botones1 = { boton1, boton2, boton3 };

		Pantalon pantalon = new Pantalon("negro", 15, "XL", boton4);
		Camisa camisa = new Camisa("blanca", 9, "L", botones1);
		Vestido vestido = new Vestido("naranja", 12, "M");

		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, pantalon, camisa);
		Maniqui maniqui3 = new Maniqui(3, vestido);

		Maniqui[] maniquisTienda = { maniqui1, maniqui2, maniqui3 };

		return maniquisTienda;
	}

	public void mostrarEscaparate(Tienda tienda, Maniqui[] maniquisTienda) {

		int sumaPrecios = 0;
				System.out.println("El escaparate de la tienda " + tienda.getNombre() + " contiene " + maniquisTienda.length
				+ " maniquíes.\n\n");
		
		for (Maniqui maniqui : maniquisTienda) {
		
			int sumaPreciosManiqui = 0;
			System.out.print("El maniquí con id " + maniqui.getId());
			
			if (maniqui.getPantalon() != null) {
				System.out.print(" tiene un pantalón de color " + maniqui.getPantalon().getColor() + ", "
						+ maniqui.getPantalon().getPrecio() + "€ de precio y talla " + maniqui.getPantalon().getTalla()
						+ ". En el pantalón hay 1 botón: \n");
				System.out.println("\t- El botón es de color " + maniqui.getPantalon().getBoton().getColor()
						+ ", de tamaño " + maniqui.getPantalon().getBoton().getTamany() + " y forma "
						+ maniqui.getPantalon().getBoton().getForma() + ".");
				
				sumaPreciosManiqui += maniqui.getPantalon().getPrecio();
			}
			
			if (maniqui.getCamisa() != null) {
				System.out.print(" tiene una camisa de color " + maniqui.getCamisa().getColor() + ", "
						+ maniqui.getCamisa().getPrecio() + "€ de precio y talla " + maniqui.getCamisa().getTalla()
						+ ". En la camisa hay " + maniqui.getCamisa().getBotones().length + " botones: \n");
				
				Boton[] botones = maniqui.getCamisa().getBotones();
				
				for (int i = 0; i < botones.length; i++) {
					System.out.println("\t- El botón " + (i + 1) + " es de color " + botones[i].getColor()
							+ ", de tamaño " + botones[i].getTamany() + " y forma " + botones[i].getForma() + ".");
				}
				
				sumaPreciosManiqui += maniqui.getCamisa().getPrecio();
			}
			
			if (maniqui.getVestido() != null) {
				System.out.print(" tiene un vestido de color " + maniqui.getVestido().getColor() + ", "
						+ maniqui.getVestido().getPrecio() + "€ de precio y talla " + maniqui.getVestido().getTalla()
						+ ".");
				
				sumaPreciosManiqui += maniqui.getVestido().getPrecio();
			}
			
			if (maniqui.getVestido() == null && maniqui.getCamisa() == null && maniqui.getPantalon() == null) {
				System.out.print(" no tiene ninguna prenda.");
			}
			System.out.println("El coste total de las prendas de este maniquí es " + sumaPreciosManiqui + " euros.\n");
			
			sumaPrecios += sumaPreciosManiqui;
		}
		
		System.out.println("El precio total de la ropa en todos los maniquíes es de " + sumaPrecios + " €.\n");
	}

	public void cerrarTienda(Maniqui[] maniquisTienda) {

		for (Maniqui maniqui : maniquisTienda) {
			maniqui.desvestir();
		}
		System.out.println("Los maniquíes han sido desvestidos.");
	}
}
