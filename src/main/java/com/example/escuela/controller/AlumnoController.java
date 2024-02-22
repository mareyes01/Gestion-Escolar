package com.example.escuela.controller;

import com.example.escuela.entity.Alumno;
import com.example.escuela.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
   public List<Alumno> getAll(){
       return alumnoService.getAlumnos();
   }

    @GetMapping("/{alumnoId}")
    public Optional<Alumno> getById(@PathVariable("alumnoId") Long alumnoId){
        return alumnoService.getAlumnos(alumnoId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Alumno alumno){
        alumnoService.save(alumno);
    }

    @DeleteMapping("/{alumnoId}")
    public void saveUpdate(@PathVariable("alumnoId") Long alumnoId){
        alumnoService.delete(alumnoId);
    }
}

