/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex12;

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
        int n;
        int total;
        
        n = 1;
        total = 1;
        for (int i = 1; i <= 10; i++, n++)
        {
            while (n % 2 != 1)
                n++;
            total *= n;
        }
        System.out.println("El total es " + total);
    }

}
