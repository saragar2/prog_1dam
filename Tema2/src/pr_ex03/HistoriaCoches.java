/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pr_ex03;

/**
 *
 * @authorSara
 */
public class HistoriaCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Coche coche1 = new Coche("azul", "Hyundai", "Tucson", 4);
        Coche coche2 = new Coche("rojo", "Seat", "León", 4);
        
        coche1.encender();
        coche1.acelerar();
        coche1.imprimirModeloyMarca();
        coche1.frenar();
        
        coche2.encender();
        coche2.acelerar();
        coche2.imprimirModeloyMarca();
        coche2.frenar();
    }

}
