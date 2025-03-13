package es.cursojava.ficheros.ejercicios.eventos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilidadesEventos {

	private static final Logger logger = LoggerFactory.getLogger(MainEventos.class);

	public static List<Evento> leerFichero(File fichero) {
		List<Evento> listadoEventos = new ArrayList<Evento>();

		try (Scanner scan = new Scanner(fichero)) {
			scan.useDelimiter("\n");
			// pasamos el cursor de la fila 0 a la 1, ignorando el nombre de los campos
			scan.next();
			while (scan.hasNext()) {
				String[] evento = scan.next().split(",");
				int id = Integer.parseInt(evento[0].trim());
				String name = evento[1].trim();
				SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
				Date fecha = null;
				System.out.println(evento[2]);
				try {
					fecha = formato.parse(evento[2].trim());
					System.out.println(fecha);
				} catch (ParseException pe) {
					logger.error(pe.getMessage());
					pe.printStackTrace();
				}
				String lugar = evento[3].trim();
				String descripcion = evento[4].trim();
				int duracion = Integer.parseInt(evento[5].trim());
				double precio = Double.parseDouble(evento[6].trim());
				String organizador = evento[7].trim();
				boolean gratuito = Boolean.parseBoolean(evento[8].trim());
				//boolean gratuito = evento[8].equals("true")?true:false;
				listadoEventos.add(
						new Evento(id, name, fecha, lugar, descripcion, duracion, precio, organizador, gratuito));
			}

		} catch (FileNotFoundException fnfe) {
			logger.error(fnfe.getMessage());
			fnfe.printStackTrace();
		}

		return listadoEventos;
	}

	public static List<Evento> leerFichero(String nombre) {
		return leerFichero(new File(nombre));
	}

	public static Map<String, List<Evento>> mapearEventosPorCiudad(List<Evento> listadoEventos) {
		
		Map<String, List<Evento>> mapaEventos = new LinkedHashMap<String, List<Evento>>();
		Set<String> setCiudades = new LinkedHashSet<String>();
		
		for (Evento evento : listadoEventos) {
			setCiudades.add(evento.getLugar());
		}
		
		for (String ciudad : setCiudades) {
			List<Evento> lista = new ArrayList<Evento>();
			for (Evento evento:listadoEventos) {
				if (evento.getLugar().equalsIgnoreCase(ciudad)) {
					lista.add(evento);
				}
			}
			mapaEventos.put(ciudad, lista);
		}
		
		return mapaEventos;
	}
	
	public static void cantidadEventosPorCiudad(Map<String, List<Evento>> mapaEventos) {
		
		Set<String> setKeys = mapaEventos.keySet();
		
		for (String key : setKeys) {
			List<Evento> listado = mapaEventos.get(key);
			int cantidad = listado.size();
			String texto = key + ": " + cantidad;
			logger.info(texto);
		}
	}
	
	public static void crearArchivoEventosPorCiudad(Map<String, List<Evento>> mapaEventos, String ciudad) {
		if (mapaEventos.keySet().contains(ciudad)) {
			String direccion = "C:\\Users\\Tardes\\workspace\\CursoJava\\recursos\\" + ciudad.toLowerCase() + ".txt";
			File archivo = new File(direccion);
			List<Evento> listado = mapaEventos.get(ciudad);
			try {
				archivo.createNewFile();
			} catch (IOException ioe) {
				logger.info(ioe.getMessage());
				ioe.printStackTrace();
			}
			
			if (archivo.exists()) {
				StringBuilder sb = new StringBuilder();
				for (Evento evento:listado) {
					sb.append(evento.getId() + ",");
					sb.append(evento.getNombre() + ",");
					sb.append(evento.getFecha() + ",");
					sb.append(evento.getLugar() + ",");
					sb.append(evento.getDescripcion() + ",");
					sb.append(evento.getDuracion() + ",");
					sb.append(evento.getPrecio() + ",");
					sb.append(evento.getOrganizador() + ",");
					sb.append(evento.isGratuito());
					sb.append("\n");
					
					try (PrintWriter buffer = new PrintWriter(archivo)) {
						buffer.print(sb);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				try (PrintWriter buffer = new PrintWriter(archivo)) {
					buffer.print(sb);
				} catch (IOException e) {
					e.printStackTrace();
				}
				logger.info("Se ha creado el archivo " + ciudad.toLowerCase() + ".txt.");
			}
		} else {
			logger.info("La ciudad escogida no tiene eventos disponibles.");
		}
	}
	
	public static void mostrarCiudadesEventosGratis(Map<String, List<Evento>> mapaEventos) {
		Set<String> ciudadesEventoGratis = new LinkedHashSet<String>();
		Set<Entry<String, List<Evento>>> entryEventos = mapaEventos.entrySet();
		
		for (Entry<String, List<Evento>> entry : entryEventos) {
			for(Evento evento: entry.getValue()) {
				if(evento.isGratuito()) {
					System.out.println(entry.getKey());
					ciudadesEventoGratis.add(entry.getKey());
				}
			}
		}
		
		logger.info("Ciudades con eventos gratis:");
		for (String ciudad:ciudadesEventoGratis) {
			logger.info(ciudad);
		}
	}
}
