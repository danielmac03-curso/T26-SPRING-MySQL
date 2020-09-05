package Ejercicio_03.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_03.dto.Venta;
import Ejercicio_03.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImpl suministraServiceImpl;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas(){
		return suministraServiceImpl.listarVenta();
	}
	
	
	@PostMapping("/ventas")
	public Venta salvarVenta(@RequestBody Venta venta) {
		return suministraServiceImpl.guardarVenta(venta);
	}
	
	
	@GetMapping("/ventas/{id}")
	public Venta ventaXID(@PathVariable(name="id") int id) {
		Venta ventaXId = new Venta();

		ventaXId = suministraServiceImpl.ventaXID(id);
		
		System.out.println("Ventas XID: " + ventaXId);
		
		return ventaXId;
	}
	
	@PutMapping("/ventas/{id}")
	public Venta actualizarVentas(@PathVariable(name="id") int id, @RequestBody Venta venta) {
		
		Venta suministraSeleccionado = new Venta();
		Venta suministraActualizado = new Venta();
		
		suministraSeleccionado = suministraServiceImpl.ventaXID(id);
		
		suministraSeleccionado.setCajero(venta.getCajero());
		suministraSeleccionado.setMaquina(venta.getMaquina());
		suministraSeleccionado.setProducto(venta.getProducto());
		
		suministraActualizado = suministraServiceImpl.actualizarVenta(suministraSeleccionado);
		
		System.out.println("La venta actualizada es: "+ suministraActualizado);
		
		return suministraActualizado;
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eliminarVentas(@PathVariable(name="id") int id) {
		suministraServiceImpl.eliminarVenta(id);
	}
	
}
