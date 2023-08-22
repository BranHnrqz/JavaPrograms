package com.mycompany.wordnumber_e3;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class WordNumber_E3 {

    public static void main(String[] args) {
        String word, number;
        int n;
        
        word = JOptionPane.showInputDialog("Ingresa una Palabra: ");
       
        number = JOptionPane.showInputDialog("Ingresa la Cantidad de Veces a Repetirla: ");
        n = Integer.parseInt(number);
        
        for (int i = 0; i < n; i++)
        {
            //Se muestra en la consola
            System.out.print(word + "\n");
        }        
    }
}
