/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package switch_ex09;

import java.util.Scanner;

/**
 *
 * @authorSara
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double  n1;
        double  n2;
        char    oper;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qué operacion quieres hacer? (pon el signo)");
        oper = teclado.nextLine().charAt(0);
        
        System.out.println("Cuál es el primer número?");
        n1 = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("Cuál es el segundo número");
        n2 = teclado.nextDouble();
        teclado.nextLine();
        
        OperacionBasica ej = new OperacionBasica(n1, n2);
        
        switch(oper)
        {
            case '+':
                System.out.println(ej.sumar());
                break;
            case '-':
                System.out.println(ej.restar());
                break;
            case '*':
                System.out.println(ej.multiplicar());
                break;
            case '/':
                System.out.println(ej.dividir());
                break;
            default:
                System.out.println("Signo no válido");
        }
    }

}
