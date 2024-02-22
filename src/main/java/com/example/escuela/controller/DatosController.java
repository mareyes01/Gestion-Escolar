package com.example.escuela.controller;

import com.example.escuela.entity.Alumno;
import com.example.escuela.entity.Datos;
import com.example.escuela.services.AlumnoService;
import com.example.escuela.services.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/datos")
public class DatosController {

    @Autowired
    private DatosService datosService;
    private AlumnoService alumnoService;


    @GetMapping
    public List<Datos> getAll(){
        return datosService.getDatos();
    }

    @GetMapping("/{idDatos}")
    public Optional<Datos> getById(@PathVariable("idDatos") Long idDatos){
        return datosService.getDatos(idDatos);
    }

}
