package com.example.escuela.entity;

import org.springframework.boot.context.properties.bind.DefaultValue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "datos")

public class Datos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDatos;

    @ManyToOne
    @JoinColumn(name = "alumnoId")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "materiaId")
    private Materia materia;

    @Column(name = "calificacion")
    private Float calificacion;

    public Datos(){}

    public Datos(int idDatos, Alumno alumno, Materia materia) {
        this.idDatos = idDatos;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdDatos() {
        return idDatos;
    }

    public void setIdDatos(int idDatos) {
        this.idDatos = idDatos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }
}
