package Ejercicio_04.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_04.dto.Reserva;
import Ejercicio_04.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reserva> listarReserva(){
		return reservaServiceImpl.listarReservas();
	}
	
	@PostMapping("/reservas")
	public Reserva salvarReserva(@RequestBody Reserva reserva) {
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	@GetMapping("/reservas/{id}")
	public Reserva reservasXID(@PathVariable(name="id") int id) {
		Reserva reservaXId = new Reserva();
		
		reservaXId = reservaServiceImpl.reservaXID(id);
		
		System.out.println("Reserva XID: " + reservaXId);
		
		return reservaXId;
	}
	
	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id") int id, @RequestBody Reserva reserva) {
		Reserva reservasSeleccionado = new Reserva();
		Reserva reservasActualizado = new Reserva();
		
		reservasSeleccionado = reservaServiceImpl.reservaXID(id);
		
		reservasSeleccionado.setInvestigadores(reserva.getInvestigadores());
		reservasSeleccionado.setEquipos(reserva.getEquipos());
		reservasSeleccionado.setComienzo(reserva.getComienzo());
		reservasSeleccionado.setFin(reserva.getFin());
		
		reservasActualizado = reservaServiceImpl.actualizarReserva(reservasSeleccionado);
		
		System.out.println("La reserva actualizada es: "+ reservasActualizado);
		
		return reservasActualizado;
	}
	
	@DeleteMapping("/reservas/{id}")
	public void eliminarReserva(@PathVariable(name="id") int id) {
		reservaServiceImpl.eliminarReserva(id);
	}
	
}
