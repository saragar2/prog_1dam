/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex03;

/**
 *
 * @author Sara
 */
public class Alimento extends Producto{
    private int calorias;

    public Alimento(String nombre, double precio, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public void mostrar() {
        System.out.println("------------------------------------");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Calorias: " + getCalorias());
        System.out.println("------------------------------------");
    }
    
    
}
