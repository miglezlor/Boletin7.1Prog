
package boletin71;

import javax.swing.JOptionPane;

/**
 *
 * @author miglezlor
 */
public class Numero {
    
    public int pedirNumero(){
        int num;
        String res = JOptionPane.showInputDialog("Introduce o número");
        num=Integer.parseInt(res);
        return num;
    }
    public void Comparar(int num){
        if (num>=0)
            System.out.println("O número é positivo");
        else
            System.out.println("O número é negativo");
    }
    
}
