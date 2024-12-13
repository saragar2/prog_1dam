/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex03;

/**
 *
 * @author Sara
 */
public class ProfesorEmerito extends Profesor
{
    private int añosEmerito;

    public ProfesorEmerito(int añosEmerito, String nombre, int edad, int añosConsolidados) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }

    public int getAñosEmerito() {
        return añosEmerito;
    }

    public void setAñosEmerito(int añosEmerito) {
        this.añosEmerito = añosEmerito;
    }
    
    @Override
    double  obtenerSalarioBase()
    {
        double  salarioBase;
        
        salarioBase = super.obtenerSalarioBase() + (67.80 * añosEmerito);
        return (salarioBase);
    }
}
