/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex15;

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
        int totalP;
        int cantP;
        int totalN;
        int cantN;
        int cant0;
        
        totalP = 0;
        cantP = 0;
        totalN = 0;
        cantN = 0;
        cant0 = 0;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("di el numero nº" + i);
            n = teclado.nextInt();
            
            if (n > 0)
            {
                totalP += n;
                cantP++;
            }
            else if (n < 0)
            {
                totalN += n;
                cantN++;
            }
            else
                cant0++;
        }
        System.out.println("Media de positivos: " + (totalP / cantP));
        System.out.println("Media de negativos: " + (totalN / cantN));
        System.out.println("Total de ceros: " + cant0);
    }

}
