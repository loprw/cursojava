package es.cursojava.poo.herencia.ejercicios.garaje;

public class EjecutarVehiculos {

	public static void main(String[] args) {

		EjecutarVehiculos vehiculo = new EjecutarVehiculos();
		Vehiculo[] vehiculos = vehiculo.crearVehiculos();
		vehiculo.pintarInformacion(vehiculos);
		vehiculo.obtenerImpuestos(vehiculos);
		Garaje garaje = vehiculo.crearGaraje();
		garaje.aparcar(vehiculos);
	}
	
	public Garaje crearGaraje() {
		
		Coche[] plazasCoche = new Coche[3];
		Camion[] plazasCamion = new Camion[2];
		Motocicleta[] plazasMoto = new Motocicleta[3]; 
		PlantaGaraje planta1 = new PlantaGaraje(1, plazasCoche);
		PlantaGaraje planta2 = new PlantaGaraje(2, plazasCamion);
		PlantaGaraje planta3 = new PlantaGaraje(3, plazasMoto);
		PlantaGaraje[] plantas = {planta1, planta2, planta3};
		Garaje garaje = new Garaje("Garaje de tus Sueños", plantas);
		System.out.println("Bienvenido a " + garaje.getNombre() + ".\n");
		
		return garaje;
	}

	public Vehiculo[] crearVehiculos() {

		Coche coche1 = new Coche("Chrevolet", "Kalos", 2008, 140, "Gasolina", 5, true);
		Coche coche2 = new Coche("Opel", "Kadett", 1994, 150, "Diesel", 5, false);
		Coche coche3 = new Coche("Kia", "Picanto", 2018, 130, "Híbrido", 3, true);
		Coche coche4 = new Coche("Tesla", "Cybertruck", 2024, 170, "Eléctrico", 5, true);

		Motocicleta moto1 = new Motocicleta("Aprilia", "Tuono", 2023, 180, "Gasolina", false, 125);
		Motocicleta moto2 = new Motocicleta("Harley Davidson", "FLH Duo Glide", 2009, 130, "Diesel", true, 125);
		Motocicleta moto3 = new Motocicleta("Honda", "Integra", 2015, 165, "Gasolina", false, 250);
		Motocicleta moto4 = new Motocicleta("Kawasaki", "Z900", 2021, 150, "Eléctrico", false, 125);

		Camion camion1 = new Camion("IVECO", "Daily", 2016, 120, "Gasolina", 7.8, 3);
		Camion camion2 = new Camion("Scania", "V8", 1990, 110, "Diesel", 5.3, 2);
		Camion camion3 = new Camion("Volvo", "FMX", 2007, 120, "Gasolina", 9.7, 4);

		Vehiculo[] vehiculos = { coche1, coche2, coche3, coche4, moto1, moto2, moto3, moto4, camion1, camion2,
				camion3 };

		return vehiculos;
	}
	
	public void pintarInformacion (Vehiculo[] vehiculos) {
		
		for (Vehiculo vehiculo: vehiculos) {
			vehiculo.mostrarInformacion();
			System.out.println();
		}
	}

	public void obtenerImpuestos(Vehiculo[] vehiculos) {

		for (Vehiculo vehiculo : vehiculos) {
			double impuesto = vehiculo.calcularImpuesto();
			System.out.println("El impuesto del " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " es de "
					+ impuesto + " euros.\n");
		}
	}
}