/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package switch_ex08;

import java.util.Scanner;

/**
 *
 * @authorSara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        char    carac;
        
        System.out.println("Escribe un caracter:");
        carac = teclado.nextLine().toLowerCase().charAt(0);
        
        if (carac >= 'a' && carac <= 'z')
        {
            switch(carac)
            {
                case 'a', 'e','i','o','u':
                    System.out.println("Se trata de una vocal");
                    break;
                default:
                    System.out.println("Se trata de una consonante");
                    break;
            }
        }
        else
            System.out.println("No es una letra");
    }

}
