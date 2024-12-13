/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Clases_ex01;

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
        Persona p1 = new Persona(1, "Sara", "García", LocalDate.of(2005,4,3));
        Persona p2 = new Persona(2, "Bárbara", "Martín", LocalDate.of(2002,11,27));
        Persona p3 = new Persona(3, "Darío", "Márquez", LocalDate.of(2001,9,11));
        Persona p4 = new Persona(4, "Carlos", "Sánchez", LocalDate.of(2005,7,13));
        Persona p5 = new Persona(5, "Andrés", "Martín", LocalDate.of(2001,2,2));
        Persona p6 = new Persona(6, "Antonia", "del Olmo", LocalDate.of(2096,8,8));
        
        Equipo e1 = new Equipo("Matemáticos", p1);
        e1.agregarIntegrante(p2);
        e1.agregarIntegrante(p3);
        e1.agregarIntegrante(p4);
        
        Equipo e2 = new Equipo("Poetas", p5);
        e2.agregarIntegrante(p6);
        
        e1.quitarIntegrante(p4);
        
        e2.agregarIntegrante(p4);
        
        System.out.println("---matemáticos---");
        System.out.println(e1);
        System.out.println("---poetas---");
        System.out.println(e2);
    }

}
