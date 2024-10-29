/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex02;

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
        int n;
        Scanner teclado = new Scanner(System.in);
        
        n = 1;
        while (n != 0)
        {
            System.out.println("Dime un número: ");
            n = teclado.nextInt();
            teclado.nextLine();
            
            if (n != 0)
            {
                if (n % 2 == 0)
                    System.out.print("El número es par");
                else
                    System.out.print("El numero es impar");
                if (n > 0)
                    System.out.println(" y positivo");
                else
                    System.out.println(" y negativo");
            }
        }
    }

}
