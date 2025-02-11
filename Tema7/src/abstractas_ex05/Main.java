/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package abstractas_ex05;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @authorSara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<VehiculoJuguete> al = new ArrayList<>();
        
        Random azar = new Random();
        
        BiciInfantil bi = new BiciInfantil("Francisca", "Decathlon");
        CocheTeledirigido ct = new CocheTeledirigido("Terreneitor", "Bandai");
        
        al.add(bi);
        al.add(ct);
        
        for (int i = 0; i < 50; i++) {
            //Hay que terminar esto
        }
    }

}
