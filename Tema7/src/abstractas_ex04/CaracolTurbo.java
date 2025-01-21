/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractas_ex04;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class CaracolTurbo extends AnimalTerrestre{
    public CaracolTurbo(String nombre, LocalDate fechaNac) {
        super(nombre, fechaNac);
    }

    @Override
    public void correr() {
        super.setDesplaz(super.getDesplaz() + 1);
    }

    @Override
    public String huella() {
        return ("_");
    }
}
