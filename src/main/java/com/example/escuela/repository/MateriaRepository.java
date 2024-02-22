package com.example.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.escuela.entity.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long>{
    
}
