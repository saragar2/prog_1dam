/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex18;

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
        int n;
        Scanner t = new Scanner(System.in);
        
        System.out.println("Dime un número");
        n = t.nextInt();
        t.nextLine();
        
        while (n < 1 || n > 10)
        {
            System.out.println("Introduce un número válido");
            n = t.nextInt();
            t.nextLine();
        }
        
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " * " + i + " = " + (n*i));
    }

}
