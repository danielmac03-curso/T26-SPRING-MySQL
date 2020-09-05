package Ejercicio_01.service;

import java.util.List;
import Ejercicio_01.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedores();
	
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public Proveedor proveedorXID(char id);
	
	public Proveedor actualizarProveedor(Proveedor proveedor);
	
	public void eliminarProveedor(char id);
	
}


