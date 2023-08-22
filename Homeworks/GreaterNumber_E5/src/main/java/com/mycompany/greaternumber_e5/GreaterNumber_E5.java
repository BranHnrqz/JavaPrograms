package com.mycompany.greaternumber_e5;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class GreaterNumber_E5 {

    public static void main(String[] args) {
        
        String n1,n2,n3; 
        
        int number1, number2, number3; //Números almacenados en memoria
        

        //Lecturas
        n1 = JOptionPane.showInputDialog("Escribe el Primer Número: ");
        n2 = JOptionPane.showInputDialog("Escribe el Segundo Número: ");
        n3 = JOptionPane.showInputDialog("Escribe el Tercer Número: ");

        
        //Convirtiendo Strings a Int:
        number1 = Integer.parseInt(n1);
        number2 = Integer.parseInt(n2);
        number3 = Integer.parseInt(n3);
        
        int greaterNumber = Math.max (Math.max(number1, number2),number3);
        JOptionPane.showMessageDialog(null, "El número mayor entre: " + number1 + ", " + number2 + ", " + number3 + " -- es: " + greaterNumber, "Resultados", JOptionPane.PLAIN_MESSAGE);
      
    }
}
