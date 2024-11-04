/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex09;

/**
 *
 * @authorSara
 */
import java.util.Scanner;

public class Main_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String pinCorrecto;
        String intento;
        Scanner teclado = new Scanner(System.in);
        
        pinCorrecto = "miclave";
        intento = "";
        for (int i = 1; i <= 3 && intento.compareTo(pinCorrecto) != 0; i++)
        {
            System.out.println("Introduce el pin:");
            intento = teclado.nextLine();
        }
        if (intento.compareTo(pinCorrecto) == 0)
            System.out.println("Login succesfully");
        else
            System.out.println("Login failed");
    }

}
