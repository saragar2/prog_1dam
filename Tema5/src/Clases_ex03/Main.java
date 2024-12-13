/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Clases_ex03;

/**
 *
 * @authorSara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Profesor p1 = new Profesor("Ana", 38, 11);
        ProfesorEmerito p2 = new ProfesorEmerito(3, "Pedro", 68, 28);
        
        System.out.println(p1.obtenerSalarioBase());
        System.out.println(p2.obtenerSalarioBase());
    }

}
