package Ejercicio_01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ejercicio_01.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{

}
