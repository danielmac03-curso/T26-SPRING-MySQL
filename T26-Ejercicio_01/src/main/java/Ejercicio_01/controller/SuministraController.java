package Ejercicio_01.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Ejercicio_01.dto.Suministra;
import Ejercicio_01.service.SuminstraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuminstraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministros")
	public List<Suministra> listarSuministros(){
		return suministraServiceImpl.listarSuministra();
	}
	
	
	@PostMapping("/suministros")
	public Suministra salvarSuministro(@RequestBody Suministra suministra) {
		return suministraServiceImpl.guardarSuministra(suministra);
	}
	
	@GetMapping("/suministros/{id}")
	public Suministra suministroXID(@PathVariable(name="id") int id) {
		
		Suministra suministraXId= new Suministra();
		
		suministraXId = suministraServiceImpl.suministraXID(id);
		
		System.out.println("Curso XID: " + suministraXId);
		
		return suministraXId;
	}
	
	@PutMapping("/suministros/{id}")
	public Suministra actualizarSuministro(@PathVariable(name="id") int id, @RequestBody Suministra suministra) {
		
		Suministra suministraSeleccionado = new Suministra();
		Suministra suministraActualizado = new Suministra();
		
		suministraSeleccionado = suministraServiceImpl.suministraXID(id);
		
		suministraSeleccionado.setPieza(suministra.getPieza());
		suministraSeleccionado.setProveedor(suministra.getProveedor());
		suministraSeleccionado.setPrecio(suministra.getPrecio());
		
		suministraActualizado = suministraServiceImpl.actualizarSuministra(suministraSeleccionado);
		
		System.out.println("El suministro actualizado es: "+ suministraActualizado);
		
		return suministraActualizado;
	}
	
	@DeleteMapping("/suministros/{id}")
	public void eliminarSuministro(@PathVariable(name="id") int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}
	
}
