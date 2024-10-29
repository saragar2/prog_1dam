/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package switch_ex09;

/**
 *
 * @author Sara
 */
public class OperacionBasica
{
    private double  n1;
    private double  n2;
    
    public OperacionBasica(double n1, double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double sumar()
    {
        return (n1 + n2);
    }
    
    public double restar()
    {
        return (n1 - n2);
    }
    
    public double multiplicar()
    {
        return (n1 * n2);
    }
    
    public double dividir()
    {
        return (n1 / n2);
    }
}
