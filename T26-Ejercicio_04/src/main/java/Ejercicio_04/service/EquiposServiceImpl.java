package Ejercicio_04.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio_04.dao.IEquiposDAO;
import Ejercicio_04.dto.Equipos;

@Service
public class EquiposServiceImpl implements IEquiposService{

	@Autowired
	IEquiposDAO iEquiposDAO;
	
	@Override
	public List<Equipos> listarEquipos() {
		// TODO Auto-generated method stub
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipo(Equipos equipo) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipo);
	}

	@Override
	public Equipos equipoXID(char id) {
		// TODO Auto-generated method stub
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipos actualizarEquipo(Equipos equipo) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(char id) {
		// TODO Auto-generated method stub
		iEquiposDAO.deleteById(id);
	}

}
