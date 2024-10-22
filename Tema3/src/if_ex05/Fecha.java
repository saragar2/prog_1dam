/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package if_ex05;

/**
 *
 * @author Sara
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int dia, int mes, int año)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public boolean esFechaValida()
    {
        if (dia <= 0 || mes <= 0)
            return (false);
        else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31)
            return (false);
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)
            return (false);
        else if (mes == 2 && dia > 28)
            return (false);
        else
            return (true);
    }
}
