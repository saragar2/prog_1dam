/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bucles_ex19;

/**
 *
 * @authorSara
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        int nota;
        int apr;
        int con;
        int susp;
        
        apr = 0;
        con = 0;
        susp = 0;
        for (int i = 1; i <= 6; i++)
        {
            System.out.println("Introduce la nota del alumno nº" + i);
            nota = t.nextInt();
            t.nextLine();
            if (nota < 4)
                susp++;
            else if (nota >= 4 && nota < 5)
                con++;
            else
                apr++;
        }
        System.out.println("Hay un total de " + susp + " suspensos, " + con + " condicionados, y " + apr + " aprobados");
    }

}
