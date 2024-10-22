/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

/**
 *
 * @author Sara
 */
import java.util.Scanner;
import java;
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int     a;
        int     b;
        int     c;
        String  s;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de A");
        a = teclado.nextInt();
        System.out.println("introduce el valor de B");
        b = teclado.nextInt();
        System.out.println("introduce el valor de c");
        c = teclado.nextInt();
        System.out.println("introduce el valor de S");
        s = teclado.nextLine();
        
        System.out.println("A = " + a + "  B = " + b + "  C = " + c + "  S = " + s);
    }
    
}
