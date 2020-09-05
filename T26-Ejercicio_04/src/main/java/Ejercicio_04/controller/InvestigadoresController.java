package Ejercicio_04.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_04.dto.Investigadores;
import Ejercicio_04.service.InvestigadoresServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadoresController {

	@Autowired
	InvestigadoresServiceImpl investigadoresServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigadores> listarInvestigadores(){
		return investigadoresServiceImpl.listarInvestigadores();
	}
	
	@PostMapping("/investigadores")
	public Investigadores salvarInvestigador(@RequestBody Investigadores investigador) {
		return investigadoresServiceImpl.guardarInvestigador(investigador);
	}
	
	@GetMapping("/investigadores/{id}")
	public Investigadores investigadoresXID(@PathVariable(name="id") String id) {
		Investigadores investigadorXId = new Investigadores();
		
		investigadorXId = investigadoresServiceImpl.investigadorXID(id);
		
		System.out.println("Investigador XID: " + investigadorXId);
		
		return investigadorXId;
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigadores actualizarInvestigador(@PathVariable(name="id") String id, @RequestBody Investigadores investigador) {
		Investigadores investigadoresSeleccionado = new Investigadores();
		Investigadores investigadoresActualizado = new Investigadores();
		
		investigadoresSeleccionado = investigadoresServiceImpl.investigadorXID(id);
		
		investigadoresSeleccionado.setNombre(investigador.getNombre());
		investigadoresSeleccionado.setFacultad(investigador.getFacultad());
		
		investigadoresActualizado = investigadoresServiceImpl.actualizarInvestigador(investigadoresSeleccionado);
		
		System.out.println("El investigador actualizado es: "+ investigadoresActualizado);
		
		return investigadoresActualizado;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void eliminarInvestigador(@PathVariable(name="id") String id) {
		investigadoresServiceImpl.eliminarInvestigador(id);
	}
	
}
