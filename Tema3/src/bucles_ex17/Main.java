/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex17;

/**
 *
 * @authorSara
 */

import java.util.Scanner;

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int     edad;
        int     edadMedia;
        double  altura;
        double  alturaMedia;
        int     mayoresEdad;
        int     masAltos;
        Scanner t = new Scanner(System.in);
        
        edadMedia = 0;
        alturaMedia = 0;
        mayoresEdad = 0;
        masAltos = 0;
        
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("¿qué edad tiene el alumno nº" + i + "?");
            edad = t.nextInt();
            t.nextLine();
            System.out.println("¿cuánto mide el alumno nº" + i + "?");
            altura = t.nextDouble();
            t.nextLine();
            
            edadMedia += edad;
            alturaMedia += altura;
            
            if (edad >= 18)
                mayoresEdad++;
            if (altura >= 1.75)
                masAltos++;
        }
        edadMedia /= 5;
        alturaMedia /= 5;
        
        System.out.println("La edad media es " + edadMedia);
        System.out.println("La altura media es " + alturaMedia);
        System.out.println("Hay " + mayoresEdad + " mayores de edad");
        System.out.println("Hay " + masAltos + " mas altos que 1.75");
    }

}
