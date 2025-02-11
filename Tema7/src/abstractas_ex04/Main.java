/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package abstractas_ex04;

import java.time.LocalDate;
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
    public static void main(String[] args)
    {
        Serpiente serp1 = new Serpiente("Petunia", LocalDate.of(2024, 10, 21));
        Saltamontes salt1 = new Saltamontes("Margarita", LocalDate.of(2024, 10, 21));
        CaracolTurbo car1 = new CaracolTurbo("Destructor de Galaxias", LocalDate.of(2024, 10, 21));
        ArrayList<AnimalTerrestre> competidores = new ArrayList<>();
        Random azar = new Random();
        
        competidores.add(serp1);
        competidores.add(salt1);
        competidores.add(car1);
        
        while (serp1.getDesplaz() < 25 && salt1.getDesplaz() < 25 && car1.getDesplaz() < 25)
        {
            int i;
            i = azar.nextInt(3);
            System.out.println(competidores.get(i).huella()); //la huella creo que no se tenia que imprimir asi pero me la pela
            competidores.get(i).correr();
        }
        System.out.println("----RESULTADOS FINALES----");
        System.out.println("Serpiente: " + serp1.getDesplaz());
        System.out.println("Saltamontes: " + salt1.getDesplaz());
        System.out.println("caracolTurbo: " + car1.getDesplaz());
    }

}
