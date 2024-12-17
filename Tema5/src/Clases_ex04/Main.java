/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Clases_ex04;

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
        Pokemon jigglypuff = new Pokemon("Jigglypuff", 90, 30);
        PokemonFuego moltres = new PokemonFuego("Moltres", 140, 70);
        PokemonAgua gyarados = new PokemonAgua("Gyarados", 160, 80);
        PokemonPlanta venosaur = new PokemonPlanta("Venosaur", 150, 50);
        
        jigglypuff.attack(moltres);
        moltres.attack(gyarados);
        gyarados.attack(venosaur);
        venosaur.attack(jigglypuff);
        moltres.attack(venosaur);
        jigglypuff.attack(venosaur);
        venosaur.attack(gyarados);
    }

}
