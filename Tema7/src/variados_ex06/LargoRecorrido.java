/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package variados_ex06;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class LargoRecorrido extends Tren implements Descuento{
    boolean servicioCafeteria;
    int     duracion;

    public LargoRecorrido(boolean servicioCafeteria, int duracion, String origen, String destino, LocalDate fecha, int tarifa) {
        super(origen, destino, fecha, tarifa);
        this.servicioCafeteria = servicioCafeteria;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "LargoRecorrido{" + "servicioCafeteria=" + servicioCafeteria + ", duracion=" + duracion + '}';
    }

    @Override
    public double calcularDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
