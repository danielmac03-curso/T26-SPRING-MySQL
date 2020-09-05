package Ejercicio_03.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio_03.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Integer>{

}
