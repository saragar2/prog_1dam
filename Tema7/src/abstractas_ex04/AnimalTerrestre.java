/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex04;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public abstract class AnimalTerrestre {
    private String      nombre;
    private LocalDate   fechaNac;
    private double      desplaz;

    public AnimalTerrestre(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public double getDesplaz() {
        return desplaz;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setDesplaz(double desplaz) {
        this.desplaz = desplaz;
    }
    
    public abstract void correr();
    
    public abstract String huella();
}
