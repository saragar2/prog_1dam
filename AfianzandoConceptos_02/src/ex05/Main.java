/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ex05;

import java.util.Scanner;

/**
 *
 * @authorSara
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Ficha j1 = new Ficha();
        Ficha j2 = new Ficha(5);
        
        System.out.println(j1.toString());
        System.out.println(j2.toString());
        j1.avanzar();
        j2.avanzar();
        System.out.println(j1.toString());
        System.out.println(j2.toString());
        j1.retroceder();
        j2.retroceder();
        System.out.println(j1.toString());
        System.out.println(j2.toString());
        j1.saltar(2);
        j2.saltar(2);
        System.out.println(j1.toString());
        System.out.println(j2.toString());
        
    }

}
