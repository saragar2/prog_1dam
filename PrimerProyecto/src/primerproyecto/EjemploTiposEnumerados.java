/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerproyecto;

/**
 *
 * @author alumnotd
 */
public class EjemploTiposEnumerados
{
    public enum Dias {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};
    
    public static void main(String[] args)
    {
        Dias diaActual = Dias.LUNES;
        Dias diaSiguiente = Dias.MARTES;
        
        System.out.println("Hoy es " + diaActual + " y mañana es " + diaSiguiente);
    }
}
