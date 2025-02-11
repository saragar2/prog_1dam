/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex02;

/**
 *
 * @author Sara
 */
public class CuentaCorriente extends Cuenta{
    double interes = 1.5;

    public CuentaCorriente(long numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interes=" + interes + '}';
    }
}
