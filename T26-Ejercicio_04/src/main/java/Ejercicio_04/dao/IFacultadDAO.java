package Ejercicio_04.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ejercicio_04.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Integer>{

}
