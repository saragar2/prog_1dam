/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicioHerencia;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Alumno extends Persona {
    private String  grupo;
    private double  notaMedia;

    public Alumno(String nombre, String apellido, LocalDate fechaNac, String grupo, double notaMedia) {
        super(nombre, apellido, fechaNac);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public String getGrupo() {
        return grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", fechaNac=" + getFechaNac() + ", grupo=" + grupo + ", notaMedia=" + notaMedia + '}';
    }
    
    
}
