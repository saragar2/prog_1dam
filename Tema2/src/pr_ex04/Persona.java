/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pr_ex04;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Persona
{

    private String      nombre;
    private LocalDate   fechaNacimiento;
    private double      peso;
    private int         altura;
    
    public Persona(String nombre, LocalDate fechaNacimiento, double peso, int altura)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String  getNombre()
    {
        return (this.nombre);
    }
    
    public LocalDate   getFechaNacimiento()
    {
        return (this.fechaNacimiento);
    }
    
    public double  getPeso()
    {
        return (this.peso);
    }
    
    public int getAltura()
    {
        return (this.altura);
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }
    
    public int edad()
    {
        LocalDate actual = LocalDate.now();
        int añoActual = actual.getYear();
        int añoNacimiento = fechaNacimiento.getYear();
        return (añoActual - añoNacimiento);
    }
}
