package com.example.escuela.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.escuela.entity.Materia;
import com.example.escuela.services.MateriaService;

@RestController
@RequestMapping(path = "/materias")
public class MateriaController {
     @Autowired
    private MateriaService materiaService;

    @GetMapping
   public List<Materia> getAll(){
       return materiaService.getMaterias();
   }

    @GetMapping("/{materiaId}")
    public Optional<Materia> getById(@PathVariable("materiaId") Long materiaId){
        return materiaService.getMaterias(materiaId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Materia materia){
        materiaService.save(materia);
    }

    @DeleteMapping("/{materiaId}")
    public void saveUpdate(@PathVariable("materiaId") Long materiaId){
        materiaService.delete(materiaId);
    }
}
