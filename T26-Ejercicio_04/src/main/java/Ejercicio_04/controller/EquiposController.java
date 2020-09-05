package Ejercicio_04.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_04.dto.Equipos;
import Ejercicio_04.service.EquiposServiceImpl;

@RestController
@RequestMapping("/api")
public class EquiposController {

	@Autowired
	EquiposServiceImpl equiposServiceImpl;
	
	@GetMapping("/equipos")
	public List<Equipos> listarEquipoes(){
		return equiposServiceImpl.listarEquipos();
	}
	
	@PostMapping("/equipos")
	public Equipos salvarEquipo(@RequestBody Equipos equipo) {
		return equiposServiceImpl.guardarEquipo(equipo);
	}
	
	@GetMapping("/equipos/{id}")
	public Equipos equiposXID(@PathVariable(name="id") char id) {
		Equipos equipoXId = new Equipos();
		
		equipoXId = equiposServiceImpl.equipoXID(id);
		
		System.out.println("Equipo XID: " + equipoXId);
		
		return equipoXId;
	}
	
	@PutMapping("/equipos/{id}")
	public Equipos actualizarEquipo(@PathVariable(name="id") char id, @RequestBody Equipos equipo) {
		Equipos equiposSeleccionado = new Equipos();
		Equipos equiposActualizado = new Equipos();
		
		equiposSeleccionado = equiposServiceImpl.equipoXID(id);
		
		equiposSeleccionado.setNombre(equipo.getNombre());
		equiposSeleccionado.setFacultad(equipo.getFacultad());
		
		equiposActualizado = equiposServiceImpl.actualizarEquipo(equiposSeleccionado);
		
		System.out.println("El equipo actualizado es: "+ equiposActualizado);
		
		return equiposActualizado;
	}
	
	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipo(@PathVariable(name="id") char id) {
		equiposServiceImpl.eliminarEquipo(id);
	}
	
}
