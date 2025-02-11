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
    private double altura;
    private double base;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado2, double lado3, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(double base, double altura, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    
    
    @Override
    public double area() {
        return ((base * altura) / 2);
    }

    @Override
    public double perimetro() {
        return (base + lado2 + lado3);
    }
    
    
}
