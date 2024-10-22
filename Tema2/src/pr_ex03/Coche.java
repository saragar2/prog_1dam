/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pr_ex03;

/**
 *
 * @author Sara
 */
public class Coche
{
    String  color;
    String  marca;
    String  modelo;
    int     cilindrada;
    
    public Coche(String color, String marca, String modelo, int cilindrada)
    {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada =  cilindrada;
    }
    
    void encender()
    {
        System.out.println("El " + marca + " " + modelo + " se ha encendido");
    }
    
    void acelerar()
    {
        System.out.println("El " + marca + " " + modelo + " está acelerando");
    }
    
    void frenar()
    {
        System.out.println("El " + marca + " " + modelo + " está frenando");
    }
    
    void imprimirModeloyMarca()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
}
