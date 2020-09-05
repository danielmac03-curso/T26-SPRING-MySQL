package Ejercicio_01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ejercicio_01.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, Character>{

}
