package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import es.cursojava.poo.herencia.ejercicios.garaje.Coche;
import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Consultable;
import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Deletable;
import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Insertable;
import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Updatable;

public class MainApagableyEncendible {

	public static void main(String[] args) {

		MainApagableyEncendible nuevo = new MainApagableyEncendible();
		Object[] objetos = nuevo.crearObjetos();

		Encendible[] encendibles = nuevo.tomarEncendible(objetos);
		Apagable[] apagables = nuevo.tomarApagable(objetos);

		nuevo.pintarEncendidoApagado(encendibles, apagables);
		
		Consultable[] consultables = nuevo.tomarConsultable(objetos);
		nuevo.pintarConsultables(consultables);
		
		Insertable[] insertables = nuevo.tomarInsertable(objetos);
		nuevo.pintarInsertables(insertables);
		
		Updatable[] updatables = nuevo.tomarUpdatable(objetos);
		nuevo.pintarUpdatable(updatables);
		
		Deletable[] deletables = nuevo.tomarDeletable(objetos);
		nuevo.pintarDeletables(deletables);
 	}

	private Object[] crearObjetos() {

		Coche coche = new Coche("Chevrolet", "Kalos", 2008, 140, "Gasolina", "90 CV", 5, true);
		Bicicleta bici = new Bicicleta("Shimano", "SH1", 2019, 60, "A pedales", 5);
		Galleta galleta = new Galleta("Cookie", 0.75, "15/5/2025", "trigo", true);
		Ebook ebook = new Ebook("SPC", 20.05, "15/12/2020", 40.4);

		ebook.encender();
		ebook.apagar();
		coche.encender();
		coche.apagar();

		Object[] objetos = { coche, bici, galleta, ebook };

		return objetos;
	}

	private Apagable[] tomarApagable(Object[] objetos) {

		int contador = 0;

		for (Object objeto : objetos) {
			if (objeto instanceof Apagable) {
				contador++;
			}
		}

		Apagable[] apagables = new Apagable[contador];
		int posicionArray = 0;

		for (int i = 0; i < objetos.length; i++) {

			if (objetos[i] instanceof Apagable) {
				apagables[posicionArray++] = (Apagable) objetos[i];
			}
		}

		return apagables;
	}

	private Encendible[] tomarEncendible(Object[] objetos) {

		int contador = 0;

		for (Object objeto : objetos) {
			if (objeto instanceof Encendible) {
				contador++;
			}
		}

		Encendible[] encendibles = new Encendible[contador];
		int posicionArray = 0;

		for (int i = 0; i < objetos.length; i++) {

			if (objetos[i] instanceof Encendible) {
				encendibles[posicionArray++] = (Encendible) objetos[i];
			}
		}

		return encendibles;
	}
	
	private Operable[] tomarOperable(Object[] objetos) {

		int contador = 0;

		for (Object objeto : objetos) {
			if (objeto instanceof Operable) {
				contador++;
			}
		}

		Operable[] operables = new Operable[contador];
		int posicionArray = 0;

		for (int i = 0; i < objetos.length; i++) {

			if (objetos[i] instanceof Operable) {
				operables[posicionArray++] = (Operable) objetos[i];
			}
		}

		return operables;
	}
	
	private Consultable[] tomarConsultable(Object[] objetos) {

		int contador = 0;

		for (Object objeto : objetos) {
			if (objeto instanceof Consultable) {
				contador++;
			}
		}

		Consultable[] consultables = new Consultable[contador];
		int posicionArray = 0;

		for (int i = 0; i < objetos.length; i++) {

			if (objetos[i] instanceof Consultable) {
				consultables[posicionArray++] = (Consultable) objetos[i];
			}
		}

		return consultables;
	}
	
	private Insertable[] tomarInsertable(Object[] objetos) {

		int contador = 0;

		for (Object objeto : objetos) {
			if (objeto instanceof Insertable) {
				contador++;
			}
		}

		Insertable[] insertables = new Insertable[contador];
		int posicionArray = 0;

		for (int i = 0; i < objetos.length; i++) {

			if (objetos[i] instanceof Insertable) {
				insertables[posicionArray++] = (Insertable) objetos[i];
			}
		}

		return insertables;
	}
	
	private Updatable[] tomarUpdatable(Object[] objetos) {

		int contador = 0;

		for (Object objeto : objetos) {
			if (objeto instanceof Updatable) {
				contador++;
			}
		}

		Updatable[] updatables = new Updatable[contador];
		int posicionArray = 0;

		for (int i = 0; i < objetos.length; i++) {

			if (objetos[i] instanceof Updatable) {
				updatables[posicionArray++] = (Updatable) objetos[i];
			}
		}

		return updatables;
	}
	
	private Deletable[] tomarDeletable(Object[] objetos) {

		int contador = 0;

		for (Object objeto : objetos) {
			if (objeto instanceof Deletable) {
				contador++;
			}
		}

		Deletable[] deletables = new Deletable[contador];
		int posicionArray = 0;

		for (int i = 0; i < objetos.length; i++) {

			if (objetos[i] instanceof Deletable) {
				deletables[posicionArray++] = (Deletable) objetos[i];
			}
		}

		return deletables;
	}
	
	private void consulta(Consultable consulta) {
		consulta.select();
	}
	
	private void inserta(Insertable inserta) {
		inserta.insert();
	}
	
	private void actualiza(Updatable actualiza) {
		actualiza.update();
	}
	
	private void borra(Deletable borra) {
		borra.delete();
	}
	
	private void pintarConsultables(Consultable[] consultables) {

		if (consultables != null) {
			for (Consultable consultable : consultables) {
				consultable.select();

			}
		} else {
			System.out.println("No hay objetos Operables.");
		}
	}
	
	private void pintarInsertables(Insertable[] insertable) {

		if (insertable != null) {
			for (Insertable operable : insertable) {
				operable.insert();
			}
		} else {
			System.out.println("No hay objetos Operables.");
		}
	}
	
	private void pintarUpdatable(Updatable[] updatables) {

		if (updatables != null) {
			for (Updatable operable : updatables) {
				operable.update();
			}
		} else {
			System.out.println("No hay objetos Operables.");
		}
	}
	
	private void pintarDeletables(Deletable[] deletables) {

		if (deletables != null) {
			for (Deletable operable : deletables) {
				operable.delete();
			}
		} else {
			System.out.println("No hay objetos Operables.");
		}
	}
	
	private void pintarOperables(Operable[] operables) {

		if (operables != null) {
			for (Operable operable : operables) {
				operable.encender();
				operable.suspender();
				operable.apagar();
			}
		} else {
			System.out.println("No hay objetos Operables.");
		}
	}

	private void pintarEncendidoApagado(Encendible[] encendibles, Apagable[] apagables) {

		if (encendibles != null) {
			for (Encendible encendible : encendibles) {
				encendible.encender();
			}
		} else {
			System.out.println("No hay objetos Encendibles.");
		}

		if (apagables != null) {
			for (Apagable apagable : apagables) {
				apagable.apagar();
			}
		} else {
			System.out.println("No hay objetos Apagables.");
		}
	}
}