package Ejercicio_04.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ejercicio_04.dto.Investigadores;

public interface IInvestigadoresDAO extends JpaRepository<Investigadores, String>{

}
