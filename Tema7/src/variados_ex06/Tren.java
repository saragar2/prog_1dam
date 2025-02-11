/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package variados_ex06;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Tren {
    private String      origen;
    private String      destino;
    private LocalDate   fecha;
    private int         tarifa;

    public Tren(String origen, String destino, LocalDate fecha, int tarifa) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.tarifa = tarifa;
    }

    public Tren(String origen, String destino, int tarifa) {
        this.origen = origen;
        this.destino = destino;
        this.tarifa = tarifa;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getTarifa() {
        return tarifa;
    }

    @Override
    public String toString() {
        return "Tren{" + "origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", tarifa=" + tarifa + '}';
    }
    
    abstract public int  calcularPVP();

}
