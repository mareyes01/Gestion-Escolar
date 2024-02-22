package com.example.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.escuela.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
