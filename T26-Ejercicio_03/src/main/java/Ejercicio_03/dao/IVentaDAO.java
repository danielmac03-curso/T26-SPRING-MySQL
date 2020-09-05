package Ejercicio_03.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio_03.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
