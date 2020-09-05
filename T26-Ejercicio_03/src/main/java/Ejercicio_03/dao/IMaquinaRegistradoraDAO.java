package Ejercicio_03.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ejercicio_03.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraDAO extends JpaRepository<MaquinaRegistradora, Integer>{

}
