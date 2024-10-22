/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pr_ex01;

/**
 *
 * @author Sara
 */
public class SavingsAccount
{
    public double balance;
    public double interestRate = 0.01;
    public String name;
    
    public SavingsAccount(double balance, double interestRate, String name)
    {
        this.balance = balance;
        this.interestRate = interestRate;
        this.name = name;
    }
    
    public void displayCustomer()
    {
        System.out.println("Customer: " + name);
    }
}
