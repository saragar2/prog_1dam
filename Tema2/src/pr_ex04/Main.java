/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pr_ex04;

import java.time.LocalDate;

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
        Persona p1 = new Persona("Pepe", LocalDate.of(2005, Month."APRIL", 3), 49.5, 154);
        System.out.println(p1.getNombre());
    }

}
