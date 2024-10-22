/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package if_ex03;

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
        double n;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cual es la nota?");
        n = teclado.nextDouble();
        Nota yo = new Nota(n);
        
        System.out.println("La calificacion es: " + yo.calificacion());
    }

}
