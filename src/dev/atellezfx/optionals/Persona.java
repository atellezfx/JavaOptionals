package dev.atellezfx.optionals;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private final String nombre;
    private LocalDate fechaNac;
    private String nacionalidad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Persona(String nombre, LocalDate fechaNac, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int edad() {
        return Period.between(LocalDate.now(), fechaNac).getYears();
    }

}
