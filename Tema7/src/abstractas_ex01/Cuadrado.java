/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex01;

/**
 *
 * @author Sara
 */
public class Cuadrado extends Figura{
    private double lado;

    @Override
    public double area() {
        return (lado * lado);
    }

    @Override
    public double perimetro() {
        return (lado * 4);
    }
    
    
}
