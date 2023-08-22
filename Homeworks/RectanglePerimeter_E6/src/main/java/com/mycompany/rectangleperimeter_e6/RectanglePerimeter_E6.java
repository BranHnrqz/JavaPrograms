package com.mycompany.rectangleperimeter_e6;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class RectanglePerimeter_E6 {

    public static void main(String[] args) {
        //Creación de Variables
        String b,h; //Datos que el usuario introducirá
        
        double bRectangle, hRectangle; //Números almacenados en memoria
        
        //Resultados
        double perimeter, area; 
        
        //Lecturas
        b = JOptionPane.showInputDialog("Escribe la Base del Rectángulo: ");
        h = JOptionPane.showInputDialog("Escribe la Altura del Rectángulo: ");

        
        //Convirtiendo Strings a Double:
        bRectangle = Double.parseDouble(b);
        hRectangle = Double.parseDouble(h);
        
        if (bRectangle == hRectangle)
        {
            //Validación (Datos distintos)
            JOptionPane.showMessageDialog(null, "Estamos calculando un rectángulo, no un cuadrado\nIntentalo denuevo" , "Esto es un Cuadrado :)", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            perimeter = 2 * (bRectangle + hRectangle);
            area = bRectangle * hRectangle;
            
            JOptionPane.showMessageDialog(null, "Perímetro: " + perimeter + "\nArea: " + area, "Resultados :)", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
