/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package switch_ex07;

/**
 *
 * @authorSara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Fecha f = new Fecha(3,1,2005);
        
        if (f.esFechaValida())
            System.out.println("la fecha es válida");
        else
            System.out.println("la fecha NO es valida");
        
        if (f.totalDias() > 0)
            System.out.println("Ese mes es " + f.nombreMes() + " y tiene " + f.totalDias() + " dias");
    }

}
