package com.mycompany.circle_e7;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class Circle_E7 {

    public static void main(String[] args) {
     
        String r; 
        
        double rCircle;
        
        //Resultados
        double area, volume; 
        
        //Lectura
        r = JOptionPane.showInputDialog("Escribe el Radio de su Circulo: ");
     
        //Convirtiendo String a Double:
        rCircle = Double.parseDouble(r);
        
        area = Math.PI * Math.pow(rCircle, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(rCircle, 3);
        
        JOptionPane.showMessageDialog(null, "Area: " + area + "\nVolumen: " + volume, "Resultados :)", JOptionPane.PLAIN_MESSAGE);
        
    }
}
