/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package if_ex02;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Persona
{
    private String      nombre;
    private String      apellidos;
    private LocalDate   fecha;
    
    public Persona(String nombre, String apellidos, LocalDate fecha)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
    }
    
    public int edad()
    {
        int diaNacim;
        int diaAhora;
        int añoNacim;
        int añoAhora;
        
        diaNacim = fecha.getDayOfYear();
        diaAhora = LocalDate.now().getDayOfYear();
        añoNacim = fecha.getYear();
        añoAhora = LocalDate.now().getYear();
        
        if (diaNacim < diaAhora)
            return (añoAhora - añoNacim);
        else
            return (añoAhora - añoNacim - 1);
    }
    
    public boolean mayorEdad()
    {
        if (edad() >= 18)
            return (true);
        else
            return (false);
    }
}
