package Ejercicio_03.service;

import java.util.List;

import Ejercicio_03.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	public List<MaquinaRegistradora> listarMaquinaRegistradora();
		
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	
	public MaquinaRegistradora maquinaRegistradoraXID(int id);
	
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	
	public void eliminarMaquinaRegistradora(int id);
	
}