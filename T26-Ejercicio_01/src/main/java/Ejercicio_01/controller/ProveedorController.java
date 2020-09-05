package Ejercicio_01.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Ejercicio_01.dto.Proveedor;
import Ejercicio_01.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores(){
		return proveedorServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id") char id) {
		
		Proveedor proveedorXId= new Proveedor();
		
		proveedorXId = proveedorServiceImpl.proveedorXID(id);
		
		System.out.println("Proveedor XID: " + proveedorXId);
		
		return proveedorXId;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id") char id, @RequestBody Proveedor proveedor) {
		
		Proveedor proveedorSeleccionado = new Proveedor();
		Proveedor proveedorActualizado = new Proveedor();
		
		proveedorSeleccionado= proveedorServiceImpl.proveedorXID(id);
		
		proveedorSeleccionado.setNombre(proveedor.getNombre());
		
		proveedorActualizado = proveedorServiceImpl.actualizarProveedor(proveedorSeleccionado);
		
		System.out.println("El proveedor actualizado es: "+ proveedorActualizado);
		
		return proveedorActualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name="id") char id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
	
}
