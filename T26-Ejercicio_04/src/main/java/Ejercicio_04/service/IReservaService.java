package Ejercicio_04.service;

import java.util.List;
import Ejercicio_04.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReservas(); 
	
	public Reserva guardarReserva(Reserva reserva);
	
	public Reserva reservaXID(int id);
	
	public Reserva actualizarReserva(Reserva reserva);
	
	public void eliminarReserva(int id);
	
}
