package es.cursojava.poo.herencia.ejercicios.garaje;

public class Garaje {

	private String nombre;
	private PlantaGaraje[] plantas;

	public Garaje(String nombre, PlantaGaraje[] plantas) {
		this.nombre = nombre;
		this.plantas = plantas;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PlantaGaraje[] getPlantas() {
		return plantas;
	}

	public void setPlantas(PlantaGaraje[] plantas) {
		this.plantas = plantas;
	}

	public void aparcar(Vehiculo[] vehiculos) {

		int plazasCoche = 0;
		int plazasCamion = 0;
		int plazasMoto = 0;

		for (PlantaGaraje planta : plantas) {
			plazasCoche += planta.calcularPlazas()[0];
			plazasCamion += planta.calcularPlazas()[1];
			plazasMoto += planta.calcularPlazas()[2];
		}

		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Coche) {
				if (plazasCoche != 0) {
					plazasCoche--;
					System.out.println("Se ha aparcado el " + vehiculo.getMarca() + " " + vehiculo.getModelo() + ".");
				} else {
					System.out
							.println("El " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " no se ha aparcado.");
				}
			} else if (vehiculo instanceof Camion) {
				if (plazasCamion != 0) {
					plazasCamion--;
					System.out.println("Se ha aparcado el " + vehiculo.getMarca() + " " + vehiculo.getModelo() + ".");
				} else {
					System.out
							.println("El " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " no se ha aparcado.");
				}
			} else if (vehiculo instanceof Motocicleta) {
				Motocicleta moto = (Motocicleta) vehiculo;
				if (!moto.getTieneSidecar()) {
					if (plazasMoto != 0) {
						plazasMoto--;
						System.out
								.println("Se ha aparcado la " + vehiculo.getMarca() + " " + vehiculo.getModelo() + ".");
					} else {
						System.out.println(
								"La " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " no se ha aparcado.");
					}
				} else {
					System.out.println("LA " + vehiculo.getMarca() + " " + vehiculo.getModelo()
							+ " no se ha aparcado porque tiene sidecar.");
				}

			}
		}
	}
}
