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
public class Producto
{
    private int         cod;
    private String      nombre;
    private LocalDate   fechaCad;
    private long        codBarras;
    private static int  count;

    public Producto(String nombre, LocalDate fechaCad, long codBarras) {
        this.cod = count++;
        this.nombre = nombre;
        this.fechaCad = fechaCad;
        this.codBarras = codBarras;
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCad() {
        return fechaCad;
    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod=" + cod + ", nombre=" + nombre + ", fechaCad=" + fechaCad + ", codBarras=" + codBarras + '}';
    }
    
    
}
