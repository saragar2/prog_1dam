/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex14;

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
        int nSueldos;
        int sueldo;
        int max;
        
        System.out.println("Cuantos sueldos quieres introducir?");
        nSueldos = teclado.nextInt();
        teclado.nextLine();
        
        max = 0;
        
        for (int i = 1; i <= nSueldos; i++)
        {
            System.out.println("Introduce el sueldo nº" + i);
            sueldo = teclado.nextInt();
            if (max < sueldo)
                max = sueldo;
        }
        System.out.println("El máximo es " + max);
    }

}
