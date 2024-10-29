/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex04;

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
        int cont;
        int total;
        double  media;
        Scanner teclado = new Scanner(System.in);
        
        n = 0;
        cont = 0;
        total = 0;
        
        while (n >= 0)
        {
            System.out.println("Dime un número: ");
            n = teclado.nextInt();
            teclado.nextLine();
            
            if (n >= 0)
            {
                cont += 1;
                total += n;
            }
        }
        media = total / cont;
        System.out.println("Se han introducido " + cont + " números");
        System.out.println("La media es " + media);
    }

}
