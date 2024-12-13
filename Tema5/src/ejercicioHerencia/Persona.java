/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicioHerencia;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Persona
{
    private String nombre;
    private String apellido;
    private LocalDate   fechaNac;
    
    public Persona(String nombre, String apellido, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
