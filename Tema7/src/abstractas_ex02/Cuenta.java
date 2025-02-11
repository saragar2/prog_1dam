/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex02;

/**
 *
 * @author Sara
 */
public abstract class Cuenta {
    long    numeroCuenta;
    double  saldo;
    Persona cliente;

    public Cuenta(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0;
    }
    
    void ingresar(double cantidad)
    {
        if (cantidad > 0)
            saldo += cantidad;
        else
            System.out.println("Cantidad no válida. Vuelve a intentarlo");
    }
    
    abstract void retirar(double cantidad);
    
    abstract void actualizarSaldo();
}
