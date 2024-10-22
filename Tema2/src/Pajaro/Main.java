/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Pajaro;

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
        Pajaro p1 = new Pajaro(); //hecho con el primer constructor
        Pajaro p2 = new Pajaro("Manuela", 5, 10); //hecho con el segundo constructor
        
        System.out.println(p1.nombre); //sale nulo
        System.out.println(p1.posX); //sale 0
        System.out.println(p2.nombre); //sale el nombre del segundo
        System.out.println(p2.posX); //sale la posicion X del segundo

        p1.consultarEstado();
        System.out.println("distancia recorrida: " + p1.volar(2, 2));
        
        p2.consultarEstado();
        System.out.println("distancia recorrida: " + p2.volar(7, 12));
        
        // Bautizamos al pajaro 1
        p1.nombre = "Pedrito";
        p1.consultarEstado();
    }

}
