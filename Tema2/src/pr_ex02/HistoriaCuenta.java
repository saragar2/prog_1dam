/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pr_ex02;

/**
 *
 * @authorSara
 */
import pr_ex01.SavingsAccount;
public class HistoriaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Cuenta c1 = new Cuenta(1, 100);
        c1.depositar(50);
        System.out.println(c1);
        c1.retirar(25);
        System.out.println(c1);
        Cuenta c2 = new Cuenta(2, c1.saldo());
        System.out.println(c2);
       
        
    }

}
