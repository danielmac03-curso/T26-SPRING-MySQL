package Ejercicio_03.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_03.dto.Producto;
import Ejercicio_03.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProducto(){
		return productoServiceImpl.listarProducto();
	}
	
	
	@PostMapping("/productos")
	public Producto salvarProducto(@RequestBody Producto producto) {
		return productoServiceImpl.guardarProducto(producto);
	}
	
	
	@GetMapping("/productos/{id}")
	public Producto productoXID(@PathVariable(name="id") int id) {
		Producto productoXId= new Producto();
		
		productoXId = productoServiceImpl.productoXID(id);
		
		System.out.println("Productor XID: " + productoXId);
		
		return productoXId;
	}
	
	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@PathVariable(name="id") int id, @RequestBody Producto producto) {
		
		Producto productoSeleccionado = new Producto();
		Producto productoActualizado = new Producto();
		
		productoSeleccionado= productoServiceImpl.productoXID(id);
		
		productoSeleccionado.setNombre(producto.getNombre());
		
		productoActualizado = productoServiceImpl.actualizarProducto(productoSeleccionado);
		
		System.out.println("El producto actualizado es: "+ productoActualizado);
		
		return productoActualizado;
	}
	
	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable(name="id") char id) {
		productoServiceImpl.eliminarProducto(id);
	}
	
}
