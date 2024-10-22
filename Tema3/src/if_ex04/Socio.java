/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package if_ex04;

/**
 *
 * @author Sara
 */
public class Socio
{
    private int     edad;
    private boolean padresSocios;
    
    public Socio(int edad, boolean padresSocios)
    {
        this.edad = edad;
        this.padresSocios = padresSocios;
    }
    
    public double cuota()
    {
        double base;
        double total;
        
        base = 800;
        if (edad > 65)
            total = base - (base * 0.40);
        else if (edad < 21 && padresSocios)
            total = base - (base * 0.45);
        else if (edad < 21)
            total = base - (base * 0.25);
        else
            total = base;
        return (total);
    }
}
