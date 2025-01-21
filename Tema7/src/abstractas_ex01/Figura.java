/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex01;

/**
 *
 * @author Sara
 */
public abstract class Figura
{
    private        int     id;
    private        String  color;
    private static int     cont = 0;

    public Figura(String color)
    {
        this.id = cont++;
        this.color = color;
    }
    
    public Figura()
    {
        this.id = cont++;
        this.color = "blanco";
    }
    
    public abstract double area();
    
    public abstract double perimetro();
}
