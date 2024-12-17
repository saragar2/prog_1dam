/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex05;

/**
 *
 * @author Sara
 */
public class A extends M {
    int a;

    public A(int m, int a) {
        super(m);
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{ " + " m=" + super.m + " a=" + a + " }";
    }
    
    
}
