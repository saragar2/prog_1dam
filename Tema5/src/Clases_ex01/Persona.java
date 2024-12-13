/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex01;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Persona
{
    private int         id;
    private String      nombre;
    private String      apelido;
    private LocalDate   fechaNac;

    public Persona(int id, String nombre, String apelido, LocalDate fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apelido = apelido;
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apelido=" + apelido + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
