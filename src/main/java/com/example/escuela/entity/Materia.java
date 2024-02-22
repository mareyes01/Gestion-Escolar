package com.example.escuela.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "materias")

public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMateria;
    @Column(name = "materia")
    private String materia;


    public Materia() {
    }

    public Materia(int idMateria, String materia) {
        super();
        this.idMateria = idMateria;
        this.materia = materia;

    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
