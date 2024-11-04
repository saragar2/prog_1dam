/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex08;

/**
 *
 * @authorSara
 */

import java.util.Scanner;

public class Main_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int pinCorrecto;
        int intento;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Establece la contraseña:");
        pinCorrecto = teclado.nextInt();
        teclado.nextLine();
        
        intento = 0;
        for (int i = 1; i <= 3 && intento != pinCorrecto; i++)
        {
            System.out.println("Introduce el pin:");
            intento = teclado.nextInt();
        }
        if (intento == pinCorrecto)
            System.out.println("Pin correcto");
        else
            System.out.println("Has superado el máximo de intentos");
    }

}
