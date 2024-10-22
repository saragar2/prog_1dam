/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package if_ex04;

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
        int edad;
        boolean padresSocios;
        String respuesta;
        
        System.out.println("Cual es la edad del socio?");
        edad = teclado.nextInt();
        teclado.nextLine();
        respuesta = ".";
        
        if (edad < 21)
        {
            while (!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No"))
            {
                System.out.println("Son tus padres socios? (Si / No)");
                respuesta = teclado.nextLine();
            }
            if (respuesta.equalsIgnoreCase("Si"))
                padresSocios = true;
            else
                padresSocios = false;
        }
        else
            padresSocios = false;
        
        Socio s1 = new Socio(edad, padresSocios);
        System.out.println("El precio a pagar es " + s1.cuota());
    }

}
