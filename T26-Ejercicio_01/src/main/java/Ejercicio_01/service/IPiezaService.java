package Ejercicio_01.service;

import java.util.List;
import Ejercicio_01.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listarPieza(); 
		
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza piezaXID(int id);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(int id);
	
}