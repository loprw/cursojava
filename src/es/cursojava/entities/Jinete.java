package es.cursojava.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_JINETE")
public class Jinete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombreJinete;
	
	@Column(name = "nacionalidad")
	private String nacionalidad;
	
	public Jinete() {
		
	}
	
	
}
