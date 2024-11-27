package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5
 * 
 * Diseña un programa que clasifique a los empleados de una empresa en diferentes categorías según los siguientes clientes.
 * 
 * Edad del empleado:
 * 
 * Menor de 18 años: Clasificado como "Becario".
 * Entre 18 y 35 años (ambos inclusive): Dependerá del siguiente criterio.
 * Mayor de 35 años: Clasificado como "Veterano".
 * 
 * Nivel de experiencia (en años):
 * 
 * Menos de 1 año:
 * Si tiene menos de 18 años, clasificar como "Becario junior".
 * Si tiene entre 18 y 35 años, clasificar como "Trainee".
 * Entre 1 y 5 años:
 * Si tiene entre 18 y 35 años, clasificar como "Junior".
 * Si tiene más de 35 años, clasificar como "Especialista".
 * Más de 5 años:
 * Si tiene entre 18 y 35 años, clasificar como "Senior".
 * Si tiene más de 35 años, clasificar como "Experto".
 * 
 * Sector de la empresa:
 * 
 * Si el empleado pertenece al departamento de TI y tiene más de 5 años de experiencia:
 * Independientemente de la edad, clasificar como "Tech Lead".
 * Si pertenece a Recursos Humanos y tiene entre 1 y 5 años de experiencia:
 * Clasificar como "Gestor de Personas".
 * Si pertenece al sector de Ventas y tiene menos de 1 año de experiencia:
 * Clasificar como "Asistente de Ventas".
 */
public class Ejercicio5 {

	public static void main(String [] args) {
		
		//declaramos variables y pedimos entrada de datos
		String clasificacionProf = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique edad del empleado:");
		int edadEmpleado = scan.nextInt();
		
		System.out.println("Indique experiencia profesional del empleado en meses:");
		int expEmpleado = scan.nextInt();
		
		scan = new Scanner(System.in);	
		System.out.println("Indique el nombre del empleado:");
		String nombreEmpleado = scan.nextLine();
		
		scan = new Scanner(System.in);
		System.out.println("Indique el sector en la empresa del empleado:");
		String sectorEmpleado = scan.nextLine();
		
		String puestoEmpleado = "Otro";
		
//		//clasificamos si es menor de edad
//		if (edadEmpleado < 18 && expEmpleado < 12) {
//			clasificacionProf = "Becario Junior";
//		} else if (edadEmpleado < 18) {
//			clasificacionProf = "Becario";
//		}
//		
//		//clasificamos si tiene entre 18 y 35 años 
//		if (edadEmpleado >= 18 && edadEmpleado <= 35 && expEmpleado < 12) {
//			clasificacionProf = "Trainee";
//		} else if (edadEmpleado >= 18 && edadEmpleado <= 35 && expEmpleado >= 12 && expEmpleado <= 60) {
//			clasificacionProf = "Junior";
//		} else if (edadEmpleado >= 18 && edadEmpleado <= 35 && expEmpleado > 60) {
//			clasificacionProf = "Senior";
//		}
//		
//		//clasificamos si tiene más de 35 años
//		if (edadEmpleado > 35 && expEmpleado >= 12 && expEmpleado <= 60) {
//			clasificacionProf = "Especialista";
//		} else if (edadEmpleado > 35 && expEmpleado > 60) {
//			clasificacionProf = "Experto";
//		} else {
//			clasificacionProf = "Veterano";
//		}
		
		//Más correcto, porque evalúa menos condiciones
		
		if (edadEmpleado < 18) {
			if (expEmpleado < 12) {
				clasificacionProf = "Becario Junior";
			} else {
				clasificacionProf = "Becario";
			}
		} else if (edadEmpleado > 35) {
			if (expEmpleado > 60) {
				clasificacionProf = "Experto";
			} else if (expEmpleado <= 60 && expEmpleado >= 12) {
				clasificacionProf = "Especialista";
			} else {
				clasificacionProf = "Veterano";
			}
		} else if (edadEmpleado >=18 && edadEmpleado <= 35) {
			if (expEmpleado < 12) {
				clasificacionProf = "Trainee";
			} else if (expEmpleado >= 12 && expEmpleado <= 60) {
				clasificacionProf = "Junior";
			} else if (expEmpleado > 60) {
				clasificacionProf = "Senior";
			}
		}
		
		//clasificamos tipos especiales, se convierten los if separados en else if, se crea variable puesto tras indicar profe
		if (sectorEmpleado.equals("TI") && expEmpleado >= 60) {
			puestoEmpleado = "Tech Lead";
		} else if (sectorEmpleado.equals("Recursos Humanos") && expEmpleado >= 12 && expEmpleado <= 60) {
			puestoEmpleado = "Gestor de Personas";
		} else if (sectorEmpleado.equals("Ventas") && expEmpleado < 12) {
			puestoEmpleado = "Asistente de Ventas";
		}
		
		System.out.println(nombreEmpleado + " del departamento " + sectorEmpleado + " tiene el puesto de " + puestoEmpleado + " la categoría de " + clasificacionProf + ".");
		
		scan.close();
	}
}