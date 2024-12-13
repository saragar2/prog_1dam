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
public class Profesor extends Persona{
    private String especialidad;
    private double  salario;

    public Profesor(String nombre, String apellido, LocalDate fechaNac, String especialidad, double salario) {
        super(nombre, apellido, fechaNac);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + ", salario=" + salario + '}';
    }
    
    
}
