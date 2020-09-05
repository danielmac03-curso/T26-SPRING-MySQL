package Ejercicio_01.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Ejercicio_01.dto.Pieza;
import Ejercicio_01.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPieza();
	}
	
	
	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	@GetMapping("/piezas/{id}")
	public Pieza piezaXID(@PathVariable(name="id") int id) {
		Pieza piezaXId = new Pieza();
		
		piezaXId = piezaServiceImpl.piezaXID(id);
		
		System.out.println("Peiza XID: " + piezaXId);
		
		return piezaXId;
	}
	
	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name="id") int id, @RequestBody Pieza pieza) {
		
		Pieza piezaSeleccionada = new Pieza();
		Pieza piezaActualizada = new Pieza();
		
		piezaSeleccionada = piezaServiceImpl.piezaXID(id);
		
		piezaSeleccionada.setNombre(pieza.getNombre());
		
		piezaActualizada = piezaServiceImpl.actualizarPieza(piezaSeleccionada);
		
		System.out.println("La pieza actualizado es: "+ piezaActualizada);
		
		return piezaActualizada;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPieza(@PathVariable(name="id") int id) {
		piezaServiceImpl.eliminarPieza(id);
	}
	
}
