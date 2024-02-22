package com.example.escuela.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.escuela.entity.Materia;
import com.example.escuela.repository.MateriaRepository;

@Service
public class MateriaService {
    
    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> getMaterias() {
        return materiaRepository.findAll();
    }

    public Optional<Materia> getMaterias(Long id) {
        return materiaRepository.findById(id);
    }
    public void save(Materia materia) {
        materiaRepository.save(materia);
    }

    public void delete(Long id) {
        materiaRepository.deleteById(id);
    }
}
