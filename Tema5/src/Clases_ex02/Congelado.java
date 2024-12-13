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
public class Congelado extends Producto{
    private int temperatura;

    public Congelado(int temperatura, String nombre, LocalDate fechaCad, long codBarras)
    {
        super(nombre, fechaCad, codBarras);
        this.temperatura = temperatura;
    }

    public int getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(int temperatura)
    {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Congelado{" + "temperatura=" + temperatura + super.toString() + '}';
    }
    
    
}
