package Ejercicio_04.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="equipos")
public class Equipos {

	@Id
	@Column(name="numserie")
	private char numserie;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="facultad_id")
	Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="numserie")
	private List<Reserva> reserva;
	
	public Equipos() {}

	public Equipos(char numserie, String nombre, Facultad facultad, List<Reserva> reserva) {
		this.numserie = numserie;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reserva = reserva;
	}

	public char getNumserie() {
		return numserie;
	}

	public void setNumserie(char numserie) {
		this.numserie = numserie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	
	
	
	
}
