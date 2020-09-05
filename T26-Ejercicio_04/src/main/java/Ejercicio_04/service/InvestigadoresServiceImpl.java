package Ejercicio_04.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio_04.dao.IInvestigadoresDAO;
import Ejercicio_04.dto.Investigadores;

@Service
public class InvestigadoresServiceImpl implements IInvesticadoresService{

	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;
	
	@Override
	public List<Investigadores> listarInvestigadores() {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigador(Investigadores investigador) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigador);
	}

	@Override
	public Investigadores investigadorXID(String id) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores actualizarInvestigador(Investigadores investigador) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String id) {
		// TODO Auto-generated method stub
		iInvestigadoresDAO.deleteById(id);
	}

}
