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
public class Refrigerado extends Producto{
    private int codSuperv;

    public Refrigerado(int codSuperv, String nombre, LocalDate fechaCad, long codBarras) {
        super(nombre, fechaCad, codBarras);
        this.codSuperv = codSuperv;
    }

    public int getCodSuperv() {
        return codSuperv;
    }

    public void setCodSuperv(int codSuperv) {
        this.codSuperv = codSuperv;
    }

    @Override
    public String toString() {
        return "Refrigerado{" + "codSuperv=" + codSuperv + super.toString() + '}';
    }
    
    
}
