/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerproyecto;

/**
 *
 * @author Sara
 */
public class EjemploVariables
{
    //VARIABLES MIEMBRO
    final double PI = 3.1415926536; //constante
    int x; //variable miembro. Java la inicializa con 0
    int y = 2; // variable miembro inicializada en 2
    
    public static void main (String[] args)
    {
        //VARIABLES LOCALES
        int cont = -10;
        double r; //local sin inicializar
        double m = 3.5; //local inicializada
        char c1 = 'a';
        char c2 = 65;
        boolean encontrado = true;
        String msg = "bienvenido a java";
        
        r = m; //cargar el valor de m en r
        System.out.println(r); //visualizar r
        System.out.println("cont es entero y vale " + cont);
        System.out.println("m es double y vale " + m);
        System.out.println("c1 es char y vale " + c1);
        System.out.println("c2 es char y vale " + c2);
        System.out.println("'encontrado' es bool y vale \"" + encontrado + "\"");
        System.out.println("msg es String y vale \"" + msg + "\"");
    }
}
