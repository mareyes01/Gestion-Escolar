package com.example.escuela.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.escuela.entity.Alumno;
import com.example.escuela.repository.AlumnoRepository;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> getAlumnos(Long id) {
        return alumnoRepository.findById(id);
    }
    public void save(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

    public void delete(Long id) {
        alumnoRepository.deleteById(id);
    }
}