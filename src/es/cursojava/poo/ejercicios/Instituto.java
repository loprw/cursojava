package es.cursojava.poo.ejercicios;

public class Instituto {

	public static void main(String[] args) {

		String[] asignaturas3 = { "Arte", "Tecnología", "Informática" };
		
		Alumno alumno1 = new Alumno("Ricky", "Martin", 40, 7.5, "rickymartin@mail.com");
		Alumno alumno2 = new Alumno("Duban", "Dubai", 25, 6, "dubaiduban@mail.com");
		Alumno alumno3 = new Alumno("Jose Luis", "Profesor", 18, 4, "joseelprofe@mail.com", asignaturas3);
		Alumno alumno4 = new Alumno();

		Alumno[] arrayAlumnos = { alumno1, alumno2, alumno3, alumno4 };
		
		//Lo hacemos a través un for normal.
		for (int i = 0; i < arrayAlumnos.length; i++) {
			//otra opcion:
			//Alumno alumno = alumno[i];
			//System.out.println(alumno.getNombre());
			System.out.println(arrayAlumnos[i].getNombre());
			arrayAlumnos[i].estudiar();
			if (arrayAlumnos[i].getAsignaturas() != null) {
				for (String asignatura:arrayAlumnos[i].getAsignaturas()) {
					System.out.println(asignatura);
				}
			}
		}
		
		//Lo hacemos a través de un for each.
		for (Alumno alumno:arrayAlumnos) {
			System.out.println(alumno.getNombre());
			alumno.estudiar();
			String[] asigns = alumno.getAsignaturas();
			if (asigns != null) {
				for (String asignatura:asigns) {
					System.out.println("\t" + asignatura);
				}
			}
		}
	}
}
