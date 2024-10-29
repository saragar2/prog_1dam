/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex07;

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
        int total;
        int n;
        Scanner teclado = new Scanner(System.in);
        
        total = 0;
        
        System.out.println("Hasta qué numero quieres sumar?");
        n = teclado.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            total += i;
        }
        
        System.out.println("El total es " + total);
    }

}
