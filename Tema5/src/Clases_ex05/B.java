/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex05;

/**
 *
 * @author Sara
 */
public class B extends M{
    int b;

    public B( int m, int b) {
        super(m);
        this.b = b;
    }
    
    @Override
    public String toString() {
        return "A{ " + " m=" + super.m + " b=" + b + " }";
    }
}
