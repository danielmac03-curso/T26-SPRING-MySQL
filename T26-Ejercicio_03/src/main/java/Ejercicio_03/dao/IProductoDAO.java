package Ejercicio_03.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio_03.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
