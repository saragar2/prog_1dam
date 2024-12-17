/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex04;

/**
 *
 * @author Sara
 */
public class PokemonFuego extends Pokemon
{

    public PokemonFuego(String name, double healthPoints, double strikeForce) {
        super(name, healthPoints, strikeForce);
    }
    
    @Override
    public void attack(Pokemon p2)
    {
        if (isDead() == false)
        {
            if (p2 instanceof PokemonPlanta)
            {
                if (p2.getHealthPoints() - (super.getStrikeForce() * 2) >= 0)
                    p2.setHealthPoints(p2.getHealthPoints() - (super.getStrikeForce() * 2));
                else
                    p2.setHealthPoints(0);
                System.out.println(super.getName() + " attacks " + p2.getName() + ". Its health points now are " + p2.getHealthPoints());
            }
            else if (p2 instanceof PokemonAgua)
            {
                if (p2.getHealthPoints() - (super.getStrikeForce() * 0.5) >= 0)
                    p2.setHealthPoints(p2.getHealthPoints() - (super.getStrikeForce() * 0.5));
                else
                    p2.setHealthPoints(0);
                System.out.println(super.getName() + " attacks " + p2.getName() + ". Its health points now are " + p2.getHealthPoints());
            }
            else
                super.attack(p2);
        }
        
        else
            System.out.println("You can't attack because your pokemon is dead");
    }
}
