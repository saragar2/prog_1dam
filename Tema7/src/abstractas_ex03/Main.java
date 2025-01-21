/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package abstractas_ex03;

/**
 *
 * @authorSara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto[] arProd = new Producto[4];
        
        Alimento galletas = new Alimento("Galletas Maria", 2.5, 786);
        Alimento lechuga = new Alimento("Lechuga fresca", 1.8, 117);
        Bebida vodka = new Bebida("Vodka de mora Knebeb", 4.5, 597);
        Bebida ron = new Bebida("Ron La Recompensa", 6.2, 943);
        
        arProd[0] = galletas;
        arProd[1] = lechuga;
        arProd[2] = vodka;
        arProd[3] = ron;
    }

}
