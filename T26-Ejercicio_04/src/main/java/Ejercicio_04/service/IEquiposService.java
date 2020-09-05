package Ejercicio_04.service;

import java.util.List;
import Ejercicio_04.dto.Equipos;

public interface IEquiposService {

	public List<Equipos> listarEquipos(); 
	
	public Equipos guardarEquipo(Equipos equipo);
	
	public Equipos equipoXID(char id);
	
	public Equipos actualizarEquipo(Equipos equipo);
	
	public void eliminarEquipo(char id);
	
}
