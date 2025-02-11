/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package abstractas_ex01;

/**
 *
 * @authorSara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo ci = new Circulo(5);
        Cuadrado cu = new Cuadrado(5);
        Triangulo tri = new Triangulo(8, 5, 10, 10);
        
        System.out.println(ci.area());
        System.out.println(ci.perimetro());
        System.out.println(cu.area());
        System.out.println(cu.perimetro());
        System.out.println(tri.area());
        System.out.println(tri.perimetro());
        
    }

}
