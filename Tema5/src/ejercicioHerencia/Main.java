/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioHerencia;

import java.time.LocalDate;

/**
 *
 * @authorSara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Pepe","García", LocalDate.of(2005,4,3));
        Alumno a = new Alumno("Jaime", "López", LocalDate.of(2006,8,24), "A", 7.5);
        Profesor pr = new Profesor("Alicia", "Muñoz", LocalDate.of(1992, 3, 19), "Lengua", 2000);
        System.out.println(pr);
    }

}
