/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex13;

/**
 *
 * @authorSara
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int n;
        int total;
        
        System.out.println("De qué numero quieres el factorial?");
        n = teclado.nextInt();
        total =  1;
        for (int i = n; i > 0; i--)
        {
            total *= i;
        }
        System.out.println("El total es " + total);
    }

}
