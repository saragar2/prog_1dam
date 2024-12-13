/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex02;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Fresco extends Producto{
    private LocalDate   fechaEnv;
    private String      origen;

    public Fresco(LocalDate fechaEnv, String origen, String nombre, LocalDate fechaCad, long codBarras) {
        super(nombre, fechaCad, codBarras);
        this.fechaEnv = fechaEnv;
        this.origen = origen;
    }

    public LocalDate getFechaEnv() {
        return fechaEnv;
    }

    public String getOrigen() {
        return origen;
    }

    public void setFechaEnv(LocalDate fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Fresco{" + "fechaEnv=" + fechaEnv + ", origen=" + origen + super.toString() + '}';
    }
    
    
}
