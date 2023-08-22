package com.mycompany.math_e4;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class Math_E4 {

    public static void main(String[] args) {
        //Creación de Variables
        String n1,n2; //Datos que el usuario introducirá
        
        int number1, number2; //Números almacenados en memoria
        
        //Resultados
        int suma, resta, multiplicacion; 
        double division;
        
        //Lecturas
        n1 = JOptionPane.showInputDialog("Escribe el Primer Número: ");
        n2 = JOptionPane.showInputDialog("Escribe el Segundo Número: ");

        
        //Convirtiendo Strings a Int:
        number1 = Integer.parseInt(n1);
        number2 = Integer.parseInt(n2);

        //Operaciones
        //Sumando
        suma = number1 + number2;
        
        //Restando
        resta = number1 - number2;
        
        //Multiplicando
        multiplicacion = number1 * number2;
        
        
        division = 0;
        
        
        //Mostrando Resultados
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma, "Resultados", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta, "Resultados", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multiplicacion, "Resultados", JOptionPane.PLAIN_MESSAGE);
        
        
        if (number2 == 0)
        {
            JOptionPane.showMessageDialog(null, "No es posible dividir entre 0" , "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            division = number1 / number2;
            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + division, "Resultados", JOptionPane.PLAIN_MESSAGE);
        }
        
    }
}
