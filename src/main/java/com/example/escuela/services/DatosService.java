package com.example.escuela.services;

import com.example.escuela.entity.Alumno;
import com.example.escuela.entity.Datos;
import com.example.escuela.repository.AlumnoRepository;
import com.example.escuela.repository.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosService {

    @Autowired
    private DatosRepository datosRepository;

    public List<Datos> getDatos() {
        return datosRepository.findAll();
    }

    public Optional<Datos> getDatos(Long id) {
        return datosRepository.findById(id);
    }

}
