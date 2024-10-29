/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex05;

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
        
        n = 1;
        total = 0;
        while (n != 0)
        {
            System.out.println("Dime un número: ");
            n = teclado.nextInt();
            total += n;
        }
        System.out.println("El total es " + total);
    }

}
