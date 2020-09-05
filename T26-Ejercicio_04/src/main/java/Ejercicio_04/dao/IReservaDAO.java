package Ejercicio_04.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ejercicio_04.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer>{

}
