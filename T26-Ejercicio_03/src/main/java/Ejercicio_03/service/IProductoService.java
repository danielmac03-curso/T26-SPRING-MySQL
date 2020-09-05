package Ejercicio_03.service;

import java.util.List;

import Ejercicio_03.dto.Producto;

public interface IProductoService {

	public List<Producto> listarProducto(); 
	
	public Producto guardarProducto(Producto producto);
	
	public Producto productoXID(int id);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(int id);
	
}


