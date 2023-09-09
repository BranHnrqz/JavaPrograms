package com.mycompany.forsentence;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class ForSentence {

    public static void main(String[] args) {
        
        //Hasta que i llegue a 10 se acabará el bucle
        for(int i = 1; i <= 10; i++)
        {
            JOptionPane.showMessageDialog(null, "Contador : " + i, "Resultados", JOptionPane.PLAIN_MESSAGE);
        }// fin del for
    }
}
