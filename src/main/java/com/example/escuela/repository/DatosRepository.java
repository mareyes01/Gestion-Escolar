package com.example.escuela.repository;

import com.example.escuela.entity.Datos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosRepository extends JpaRepository<Datos, Long> {

}
