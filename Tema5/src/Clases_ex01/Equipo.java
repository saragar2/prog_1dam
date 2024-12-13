/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases_ex01;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Sara
 */
public class Equipo
{
    private String nombre;
    private ArrayList<Persona> integrantes = new ArrayList<>();

    public Equipo(String nombre, Persona pNueva)
    {
        this.nombre = nombre;
        agregarIntegrante(pNueva);
    }

    public String getNombre()
    {
        return nombre;
    }

    public ArrayList<Persona> getIntegrantes()
    {
        return integrantes;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    void    agregarIntegrante(Persona pNueva)
    {
        integrantes.add(pNueva);
    }
    
    void    quitarIntegrante(Persona pAntig)
    {
        integrantes.remove(pAntig);
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", integrantes=" + integrantes + '}';
    }
    
    
}
