/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package telaDeAranha;

import java.util.Scanner;

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
        int pesoTela;
        int elefs;
        int total;
        int count;
        Scanner t = new Scanner(System.in);
        
        
        //System.out.println("Cual es el peso total que puede soportar la tela de araña?");
        pesoTela = t.nextInt();
        while (pesoTela != 0)
        {
            total = 0;
            count = 0;
            //System.out.println("Cuanto pesa cada elefante?");
            do
            {
                elefs = t.nextInt();
                total += elefs;
                if (elefs != 0 && total <= pesoTela)
                    count++;
            }
            while (elefs != 0 && total <= pesoTela);
            t.nextLine();
            System.out.println(count);
            //System.out.println("Cual es el peso total que puede soportar la tela de araña?");
            pesoTela = t.nextInt();

        }
        
    }

}
