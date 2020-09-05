package Ejercicio_04.service;

import java.util.List;
import Ejercicio_04.dto.Investigadores;

public interface IInvesticadoresService {
	
	public List<Investigadores> listarInvestigadores(); 
	
	public Investigadores guardarInvestigador(Investigadores investigador);
	
	public Investigadores investigadorXID(String id);
	
	public Investigadores actualizarInvestigador(Investigadores investigador);
	
	public void eliminarInvestigador(String id);
	
}
