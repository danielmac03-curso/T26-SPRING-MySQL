package Ejercicio_04.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="investigadores")
public class Investigadores {
	
	@Id
	@Column(name="dni")
	private String dni;
	
	@Column(name="nomapels")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="facultad_id")
	Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<Reserva> reserva;
	
	public Investigadores() {}

	public Investigadores(String dni, String nombre, Facultad facultad, List<Reserva> reserva) {
		this.dni = dni;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reserva = reserva;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
