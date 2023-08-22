package com.mycompany.mathoperations;
import javax.swing.JOptionPane;

/**
 *
 * @author BRANDON
 */
public class MathOperations {

    public static void main(String[] args) {           
        //Creación de Variables
        String n1,n2,n3; //Datos que el usuario introducirá
        
        int number1, number2, number3; //Números almacenados en memoria
        
        int suma, resta, multiplicacion; //Resultados
        
        //Lecturas
        n1 = JOptionPane.showInputDialog("Escribe el Primer Número: ");
        n2 = JOptionPane.showInputDialog("Escribe el Segundo Número: ");
        n3 = JOptionPane.showInputDialog("Escribe el Tercer Número: ");
        
        //Convirtiendo Strings a Int:
        number1 = Integer.parseInt(n1);
        number2 = Integer.parseInt(n2);
        number3 = Integer.parseInt(n3);
        
        //Operaciones
           
        //Sumando
        suma = number1 + number2 + number3;
        
        //Restando
        resta = number1 - number2 - number3;
        
        //Multiplicando
        multiplicacion = number1 * number2 * number3;
        
        //Mostrando Resultados
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma, "Resultados", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta, "Resultados", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multiplicacion, "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
}
