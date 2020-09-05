package Ejercicio_03.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_03.dto.MaquinaRegistradora;
import Ejercicio_03.service.MaquinaRegistradoraServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraServiceImpl;
	
	@GetMapping("/maquinasRegistradoras")
	public List<MaquinaRegistradora> listarMaquinasRegistradoras(){
		return maquinaRegistradoraServiceImpl.listarMaquinaRegistradora();
	}
	
	
	@PostMapping("/maquinasRegistradoras")
	public MaquinaRegistradora salvarMaquinaRegistradora(@RequestBody MaquinaRegistradora maquinaRegistradora) {
		return maquinaRegistradoraServiceImpl.guardarMaquinaRegistradora(maquinaRegistradora);
	}
	
	
	@GetMapping("/maquinasRegistradoras/{id}")
	public MaquinaRegistradora maquinaRegistradora(@PathVariable(name="id") int id) {
		
		MaquinaRegistradora maquinaRegistradoraXId= new MaquinaRegistradora();
		
		maquinaRegistradoraXId = maquinaRegistradoraServiceImpl.maquinaRegistradoraXID(id);
		
		System.out.println("MaquinaRegistradora XID: " + maquinaRegistradoraXId);
		
		return maquinaRegistradoraXId;
	}
	
	@PutMapping("/maquinasRegistradoras/{id}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name="id") int id, @RequestBody MaquinaRegistradora maquinaRegistradora) {
		
		MaquinaRegistradora maquinaRegistradoraSeleccionada = new MaquinaRegistradora();
		MaquinaRegistradora maquinaRegistradoraActualizada = new MaquinaRegistradora();
		
		maquinaRegistradoraSeleccionada= maquinaRegistradoraServiceImpl.maquinaRegistradoraXID(id);
		
		maquinaRegistradoraSeleccionada.setPiso(maquinaRegistradora.getPiso());
		
		maquinaRegistradoraActualizada = maquinaRegistradoraServiceImpl.actualizarMaquinaRegistradora(maquinaRegistradoraSeleccionada);
		
		System.out.println("La maquina registradora actualizada es: "+ maquinaRegistradoraActualizada);
		
		return maquinaRegistradoraActualizada;
	}
	
	@DeleteMapping("/maquinasRegistradoras/{id}")
	public void eliminarMaquinaRegistradora(@PathVariable(name="id") int id) {
		maquinaRegistradoraServiceImpl.eliminarMaquinaRegistradora(id);
	}
	
}
