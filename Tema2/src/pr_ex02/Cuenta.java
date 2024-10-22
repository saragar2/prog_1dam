/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pr_ex02;

/**
 *
 * @author Sara
 */
public class Cuenta
{
    double saldo;
    int numCuenta;
    
    public Cuenta(int cuenta, double inicial)
    {
        this.numCuenta = cuenta;
        this.saldo = inicial;
    }
    
    double saldo()
    {
        return (this.saldo);
    }
    
    void depositar(double cantidad)
    {
        this.saldo = this.saldo + cantidad;
    }
    
    void retirar(double cantidad)
    {
        this.saldo = this.saldo - cantidad;
    }
    
    @Override
    public String toString()
    {
        return ("la cuenta " + this.numCuenta + " tiene un saldo de " + this.saldo + " euros");
    }
}
