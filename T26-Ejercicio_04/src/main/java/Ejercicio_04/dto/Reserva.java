package Ejercicio_04.dto;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="dni_id")
	Investigadores investigadores;
	
	@ManyToOne
	@JoinColumn(name = "numserie_id")
	Equipos equipos;
	
	@Column(name="comienzo")
//	@Type(type="date")
	private Date comienzo;
	
	@Column(name="fin")
//	@Type(type="date")
	private Date fin;
	
	public Reserva() {}

	public Reserva(int id, Investigadores investigadores, Equipos equipos, Date cominezo, Date fin) {
		this.id = id;
		this.investigadores = investigadores;
		this.equipos = equipos;
		this.comienzo = cominezo;
		this.fin = fin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Investigadores getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(Investigadores investigadores) {
		this.investigadores = investigadores;
	}

	public Equipos getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}
	
}
