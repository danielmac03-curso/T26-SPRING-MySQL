package Ejercicio_03.service;

import java.util.List;

import Ejercicio_03.dto.Venta;

public interface IVentaService {

	public List<Venta> listarVenta();
		
	public Venta guardarVenta(Venta venta);
		
	public Venta ventaXID(int id);
		
	public Venta actualizarVenta(Venta venta);
		
	public void eliminarVenta(int id);
	
}


