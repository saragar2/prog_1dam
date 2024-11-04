/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex20;

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
        Scanner t = new Scanner(System.in);
        int base;
        int exp;
        int res;
        
        res = 1;
        
        System.out.println("Dime la base de la potencia");
        base = t.nextInt();
        t.nextLine();
        
        System.out.println("Dime el exponente de la potencia");
        exp = t.nextInt();
        
        for (int i = 0; i < exp; i++)
        {
            res *= base;
        }
        System.out.println("El resultado es " + res);
    }

}
