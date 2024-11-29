/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ArraysMultid_ex06;

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
        int[][] mat = new int[7][7];
        int j = 0;
        
        for(int i = 0; i < 7; i++)
        {
            while (j < 7)
            {
                if (j == i)
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0;
                System.out.print(" " + mat[i][j]);
                j++;
            }
            j = 0;
            System.out.println("");
        }
    }

}
