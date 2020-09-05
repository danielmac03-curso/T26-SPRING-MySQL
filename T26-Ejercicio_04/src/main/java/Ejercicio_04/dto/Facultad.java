package Ejercicio_04.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facultad")
public class Facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Investigadores> investigadores;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Equipos> equipos;
	
	public Facultad() {}

	public Facultad(int id, String nombre, List<Investigadores> investigadores, List<Equipos> equipos) {
		this.id = id;
		this.nombre = nombre;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigadores")
	public List<Investigadores> getInvestigador() {
		return investigadores;
	}

	public void setInvestigador(List<Investigadores> investigadores) {
		this.investigadores = investigadores;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipos")
	public List<Equipos> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}

}
