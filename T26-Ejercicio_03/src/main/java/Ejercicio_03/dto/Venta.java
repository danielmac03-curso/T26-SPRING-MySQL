package Ejercicio_03.dto;

import javax.persistence.*;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="producto_id")
	Producto producto;
	
	@ManyToOne
	@JoinColumn(name="cajero_id")
	Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name="maquina_id")
	MaquinaRegistradora maquina;
	
	public Venta() {}

	public Venta(int id, Producto producto, Cajero cajero, MaquinaRegistradora maquina) {
		this.id = id;
		this.producto = producto;
		this.cajero = cajero;
		this.maquina = maquina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public MaquinaRegistradora getMaquina() {
		return maquina;
	}

	public void setMaquina(MaquinaRegistradora maquina) {
		this.maquina = maquina;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", producto=" + producto + ", cajero=" + cajero + ", maquina=" + maquina + "]";
	}
	
}

