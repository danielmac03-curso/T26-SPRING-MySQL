package Ejercicio_03.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_03.dto.Cajero;
import Ejercicio_03.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros(){
		return cajeroServiceImpl.listarCajero();
	}
	
	
	@PostMapping("/cajeros")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	
	@GetMapping("/cajeros/{id}")
	public Cajero cajeroXID(@PathVariable(name="id") int id) {
		Cajero cajeroXId = new Cajero();
		
		cajeroXId = cajeroServiceImpl.cajeroXID(id);
		
		System.out.println("Cajero XID: " + cajeroXId);
		
		return cajeroXId;
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name="id") int id, @RequestBody Cajero cajero) {
		Cajero cajeroSeleccionado = new Cajero();
		Cajero cajeroActualizado = new Cajero();
		
		cajeroSeleccionado = cajeroServiceImpl.cajeroXID(id);
		
		cajeroSeleccionado.setNombre(cajero.getNombre());
		
		cajeroActualizado = cajeroServiceImpl.actualizarCajero(cajeroSeleccionado);
		
		System.out.println("El cajero actualizado es: "+ cajeroActualizado);
		
		return cajeroActualizado;
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajero(@PathVariable(name="id") int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
	
}
