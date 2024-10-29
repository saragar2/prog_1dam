/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package switch_ex07;

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
    
    public int getMes()
    {
        return(this.mes);
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
        else if (mes > 12)
            return (false);
        else
            return (true);
    }
    
    public String nombreMes()
    {
        String nombre;
        
        switch(this.mes)
        {
            case 1:
                nombre = "enero";
                break;
            case 2:
                nombre = "febrero";
                break;
            case 3:
                nombre = "marzo";
                break;
            case 4:
                nombre = "abril";
                break;
            case 5:
                nombre = "mayo";
                break;
            case 6:
                nombre = "junio";
                break;
            case 7:
                nombre = "julio";
                break;
            case 8:
                nombre = "agosto";
                break;
            case 9:
                nombre = "septiembre";
                break;
            case 10:
                nombre = "octubre";
                break;
            case 11:
                nombre = "noviembre";
                break;
            case 12:
                nombre = "diciembre";
                break;
            default:
                nombre = "no válido";
                break;
        }
        
        return (nombre);
    }
    
    public int totalDias()
    {
        int total;
        switch(mes)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                total = 31;
                break;
            case 4, 6, 9, 11:
                total = 30;
                break;
            case 2:
                total = 29;
                break;
            default:
                total = -1;
                break;
        }
        return (total);
    }
}
