/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex03;

/**
 *
 * @author Sara
 */
public class Bebida extends Producto{
    private int alcohol;

    public Bebida(String nombre, double precio, int alcohol) {
        super(nombre, precio);
        this.alcohol = alcohol;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }
    
    
}
