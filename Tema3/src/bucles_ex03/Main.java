/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex03;

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
        int n1;
        int n2;
        Scanner teclado = new Scanner(System.in);
        
        n1 = 1;
        n2 = 2;
        while (n1 != n2)
        {
            System.out.println("Dime el primer número: ");
            n1 = teclado.nextInt();
            teclado.nextLine();
            
            System.out.println("Dime el segundo número: ");
            n2 = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");
        }
    }

}
