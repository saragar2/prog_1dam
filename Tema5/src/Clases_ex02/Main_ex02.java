/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Clases_ex02;

import java.time.LocalDate;

/**
 *
 * @authorSara
 */
public class Main_ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Producto galletas = new Producto("galletas Maria", LocalDate.of(2025, 3, 14), 1000000003);
        Fresco queso = new Fresco(LocalDate.of(2024, 11, 8), "Murcia", " queso García Vaquero", LocalDate.of(2025, 1, 27), 1000000000);
        Refrigerado pizza = new Refrigerado(1111, "pizza cuatro quesos Casa Tarradellas", LocalDate.of(2025, 1, 14), 1000000001);
        Congelado gambas = new Congelado(-2, "gambas Hacendado", LocalDate.of(2026, 1, 3), 1000000002);
        
        System.out.println("-----Productos-----");
        System.out.println(galletas);
        System.out.println(queso);
        System.out.println(pizza);
        System.out.println(gambas);
    }

}
