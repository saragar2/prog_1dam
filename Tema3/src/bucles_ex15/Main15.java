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

public class Main15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int n;
        int totalP; //acumulador de positivos
        int cantP; //contador de positivos
        int totalN; //acumulador de negativos
        int cantN; //contador de negativos
        int cant0; // contador de 0s
        
        totalP = 0;
        cantP = 0;
        totalN = 0;
        cantN = 0;
        cant0 = 0;
        for (int i = 1; i <= 10; i++)
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
        if (cantP > 0)
            System.out.println("Media de positivos: " + (totalP / cantP));
        if (cantN > 0)
            System.out.println("Media de negativos: " + (totalN / cantN));
        System.out.println("Total de ceros: " + cant0);
    }

}
