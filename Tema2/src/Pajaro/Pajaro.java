/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Pajaro;

/**
 *
 * @author Sara
 */
public class Pajaro
{
    String nombre;
    int posX;
    int posY;
    
    //sin argumentos
    public Pajaro()
    {
        //el nombre es nulo
        //la posicion X e Y tienen valor 0
    }
    
    //con todos los argumentos
    public Pajaro(String nombre, int posX, int posY)
    {
        //inicializar lso atributos
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }
    
    /**
     * representa el desplazamiento del pajaro al volar
     * @param posX posicion x a la que va a volar el pajaro
     * @param posY posicion y a la que va a volar el pajaro
     * @return el desplazamiento en linea recta desde su posicion original hasta la actual
     */
    public double volar(int posX, int posY)
    {
        double desplazamiento;
        
        desplazamiento = Math.sqrt(Math.pow(posX - this.posX, 2) + Math.pow(posY - this.posY, 2));
        this.posX = posX;
        this.posY = posY;
        return (desplazamiento);
    }
    
    public void consultarEstado()
    {
        System.out.println("---------" + this.nombre + "---------");
        System.out.println("PosX: " + this.posX);
        System.out.println("PosY: " + this.posY);
    }
}
