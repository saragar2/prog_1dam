/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package if_ex02;

import java.time.LocalDate;
import java.time.Month;

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
        Persona yo = new Persona("Sara", "García Miguel", LocalDate.of(2005, Month.APRIL, 3));
        
        System.out.println("Tiene " + yo.edad() + " años");
    }

}
