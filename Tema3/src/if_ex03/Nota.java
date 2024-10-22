/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package if_ex03;

/**
 *
 * @author Sara
 */
public class Nota
{
    private double n;
    
    public Nota(double n)
    {
        this.n = n;
    }
    
    public double getNota()
    {
        return(this.n);
    }
    
    public String calificacion()
    {
        if (n < 0 || n > 10)
            return("fuera de rango");
        else if (n < 5)
            return ("suspenso");
        else if (n < 7)
            return ("aprobado");
        else if (n < 9)
            return ("notable");
        else if (n < 10)
            return ("sobresaliente");
        else
            return ("matricula de honor");
    }
}
