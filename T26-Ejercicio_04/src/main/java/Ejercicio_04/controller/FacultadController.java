package Ejercicio_04.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_04.dto.Facultad;
import Ejercicio_04.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/facultades")
	public List<Facultad> listarFacultades(){
		return facultadServiceImpl.listarFacultades();
	}
	
	@PostMapping("/facultades")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	@GetMapping("/facultades/{id}")
	public Facultad facultadXID(@PathVariable(name="id") int id) {
		Facultad facultadXId = new Facultad();
		
		facultadXId = facultadServiceImpl.facultadXID(id);
		
		System.out.println("Facultad XID: " + facultadXId);
		
		return facultadXId;
	}
	
	@PutMapping("/facultades/{id}")
	public Facultad actualizarFacultad(@PathVariable(name="id") int id, @RequestBody Facultad facultad) {
		Facultad facultadSeleccionado = new Facultad();
		Facultad facultadActualizado = new Facultad();
		
		facultadSeleccionado = facultadServiceImpl.facultadXID(id);
		
		facultadSeleccionado.setNombre(facultad.getNombre());
		
		facultadActualizado = facultadServiceImpl.actualizarFacultad(facultadSeleccionado);
		
		System.out.println("La facultad actualizada es: "+ facultadActualizado);
		
		return facultadActualizado;
	}
	
	@DeleteMapping("/facultades/{id}")
	public void eliminarFacultad(@PathVariable(name="id") int id) {
		facultadServiceImpl.eliminarFacultad(id);
	}
	
}
