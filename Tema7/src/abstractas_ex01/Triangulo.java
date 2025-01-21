/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex01;

/**
 *
 * @author Sara
 */
public class Triangulo extends Figura
{
    private double base;
    private double altura;

    @Override
    public double area() {
        return ((base * altura) / 2);
    }

    @Override
    public double perimetro() {
        
    }
    
    
}
