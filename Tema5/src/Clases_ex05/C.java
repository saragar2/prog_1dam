/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex05;

/**
 *
 * @author Sara
 */
public class C extends B{
    int c;

    public C(int m, int b, int c) {
        super(m, b);
        this.c = c;
    }

    
    
    @Override
    public String toString() {
        return "C {" + " m=" + super.m + " b=" + super.b + " c=" + c + " }";
    }
    
    
}
