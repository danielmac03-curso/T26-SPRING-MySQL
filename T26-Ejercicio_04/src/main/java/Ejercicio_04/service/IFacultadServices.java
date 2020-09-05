package Ejercicio_04.service;

import java.util.List;
import Ejercicio_04.dto.Facultad;

public interface IFacultadServices {

	public List<Facultad> listarFacultades(); 
	
	public Facultad guardarFacultad(Facultad facultad);
	
	public Facultad facultadXID(int id);
	
	public Facultad actualizarFacultad(Facultad facultad);
	
	public void eliminarFacultad(int id);
	
}
