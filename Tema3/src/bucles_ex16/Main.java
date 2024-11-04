/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_ex16;

/**
 *
 * @authorSara
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int total;
        int min;
        Scanner t = new Scanner(System.in);

        total = 0;
        min = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Di el numero para la posición nº " + i);
            n = t.nextInt();
            t.nextLine();

            total += n;
            if (i == 1 || min > n) {
                min = n;
            }
        }
        System.out.println("El total es " + total);
        System.out.println("El mínimo es " + min);
    }

}
