/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex05;

/**
 *
 * @author Sara
 */
public abstract class VehiculoJuguete {
    private String  nombre;
    private String  marca;
    private double     desplazamiento;

    public VehiculoJuguete(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDesplazamiento(double desplazamiento) {
        this.desplazamiento = desplazamiento;
    }
    
    abstract void correr();
    
    abstract String huella();
}
