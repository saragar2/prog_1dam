/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex03;

/**
 *
 * @author Sara
 */
public class Profesor {
    private String  nombre;
    private int     edad;
    private int     añosConsolidados;

    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñosConsolidados() {
        return añosConsolidados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAñosConsolidados(int añosConsolidados) {
        this.añosConsolidados = añosConsolidados;
    }
    
    double  obtenerSalarioBase() //925 + el número de años consolidados multiplicado por 45.50
    {
        double  salarioBase;
        
        salarioBase = 925 + (añosConsolidados * 45.50);
        return (salarioBase);
    }
}
