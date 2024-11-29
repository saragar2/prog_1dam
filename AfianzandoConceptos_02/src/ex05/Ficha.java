/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex05;

/**
 *
 * @author Sara
 */
public class Ficha
{
    private int posicion;
    
    public Ficha()
    {
        this.posicion = 0;
    }
    
    public Ficha(int posicion)
    {
        this.posicion = posicion;
    }
    
    public void avanzar()
    {
        this.posicion += 1;
    }
    
    public void retroceder()
    {
        this.posicion -= 1;
    }
    
    public void saltar(int n)
    {
        this.posicion += n;
    }
    
    @Override
    public String toString()
    {
        return("La ficha se encuentra en la posición " + this.posicion);
    }
}
