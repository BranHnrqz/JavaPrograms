package com.mycompany.ifsentence;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class IfSentence {

    public static void main(String[] args) {
        //menor de 3 numeros a, b y c
        float a, b, c, menor;
        
        String primerNumero, segundoNumero, tercerNumero;
        
        //Leer los valores de a, b, y c
        primerNumero = JOptionPane.showInputDialog("Digite el primer número: ");
        segundoNumero = JOptionPane.showInputDialog("Digite el segundo número: ");
        tercerNumero = JOptionPane.showInputDialog("Digite el tercer número: ");
        
        a = Float.parseFloat(primerNumero);
        b = Float.parseFloat(segundoNumero);
        c = Float.parseFloat(tercerNumero);
        
        if (a < b && a < c) {
            menor = a;
        } else if (b < c) {
            menor = b;
        } else {
            menor = c;
        }
        JOptionPane.showMessageDialog(null, "Menor: " + menor, "Muestra", JOptionPane.PLAIN_MESSAGE);
    }
}
