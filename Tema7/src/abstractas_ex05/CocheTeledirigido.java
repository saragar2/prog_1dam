/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex05;

/**
 *
 * @author Sara
 */
public class CocheTeledirigido extends VehiculoJuguete{
    public CocheTeledirigido(String nombre, String marca) {
        super(nombre, marca);
    }

    @Override
    void correr() {
        super.setDesplazamiento(super.getDesplazamiento() + 1.2);
    }

    @Override
    String huella() {
        return ("=");
    }

}
