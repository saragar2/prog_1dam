/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ArraysMultid_ex07;

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
        Scanner t = new Scanner(System.in);
        int     range;
        int     j;
        boolean flag;
        
        do
        {
            flag = true;
            range = t.nextInt();
            t.nextLine();
            j = 0;
            int[][] mat = new int[range][range];

            for (int i = 0; i < range; i++)
            {
                while (j < range)
                    mat[i][j++] = t.nextInt();
                j = 0;
            }

            for(int i = 0; i < range; i++)
            {
                while (j < range && flag == true)
                {
                    if ((j == i && mat[i][j] != 1) || (j != i && mat[i][j] != 0))
                        flag = false;
                    j++;
                }
                j = 0;
            }
            if (flag == true && range != 0)
                System.out.println("SI");
            else if (flag == false && range != 0)
                System.out.println("NO");
        }
        while (range != 0);
        
    }

}
