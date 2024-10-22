/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package if_ex01;

/**
 *
 * @author Sara
 */
public class Numero
{
    int num;
    
    public Numero(int num)
    {
        this.num = num;
    }
    
    public int getNum()
    {
        return (this.num);
    }
    
    public String parImpar()
    {
        if (num % 2 == 0)
            return ("par");
        else
            return ("impar");
    }
    
    public String negatPosit()
    {
        if (num < 0)
            return ("negativo");
        else if (num == 0)
            return ("cero");
        else
            return ("positivo");
    }
}
