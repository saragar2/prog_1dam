/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package if_ex05;

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
        int dia;
        int mes;
        int año;
        
        System.out.println("Dia: ");
        dia = teclado.nextInt();
        System.out.println("Mes: ");
        mes = teclado.nextInt();
        System.out.println("Año: ");
        año = teclado.nextInt();
        
        Fecha f = new Fecha(dia, mes, año);
        
        if (f.esFechaValida())
            System.out.println("la fecha es válida");
        else
            System.out.println("la fecha NO es valida0");
    }

}
