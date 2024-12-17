/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex04;

/**
 *
 * @author Sara
 */
public class Pokemon
{
    private String  name;
    private double  healthPoints;
    private double  strikeForce;

    public Pokemon(String name, double healthPoints, double strikeForce) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strikeForce = strikeForce;
    }

    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public double getStrikeForce() {
        return strikeForce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setStrikeForce(double strikeForce) {
        this.strikeForce = strikeForce;
    }
    
    public boolean isDead()
    {
        if (healthPoints <= 0)
            return (true);
        else
            return (false);
    }
    
    public void attack(Pokemon p2)
    {
        if (isDead() == false)
        {
            if ((p2.getHealthPoints() - strikeForce) >= 0)
                p2.setHealthPoints(p2.getHealthPoints() - strikeForce);
            else
                p2.setHealthPoints(0);
            System.out.println(name + " attacks " + p2.name + ". Its health points now are " + p2.healthPoints);
        }
        else
            System.out.println("You can't attack because your pokemon is dead");
    }

    @Override
    public String toString() {
        return "Pokemon{" + "name=" + name + ", healthPoints=" + healthPoints + ", strikeForce=" + strikeForce + '}';
    }
    
    
}
