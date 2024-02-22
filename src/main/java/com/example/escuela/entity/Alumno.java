package com.example.escuela.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "alumnos")

public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumnos;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;
    // @Column(name = "PromedioGral")
    private float PromedioGral;

    public Alumno() {
    }

    public Alumno(int idAlumnos, String nombre, String apellidoPaterno, String apellidoMaterno, float promedioGral) {
        super();
        this.idAlumnos = idAlumnos;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        PromedioGral = promedioGral;
    }

    public int getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(int idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public float getPromedioGral() {
        return PromedioGral;
    }

    public void setPromedioGral(float promedioGral) {
        PromedioGral = promedioGral;
    }
}
