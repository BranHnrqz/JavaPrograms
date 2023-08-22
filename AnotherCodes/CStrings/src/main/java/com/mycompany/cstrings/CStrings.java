package com.mycompany.cstrings;
import javax.swing.JOptionPane;

/**
 *
 * @author BRANDON
 */
public class CStrings {

    public static void main(String[] args) {
        String firstName, lastName;
        
        firstName = JOptionPane.showInputDialog("Ingresa tu Nombre: ");
        lastName = JOptionPane.showInputDialog("Ingresa tu Apellido: ");
        
        JOptionPane.showMessageDialog(null, "Holaaaa " + firstName + " " + lastName, "Bienvenido/a", JOptionPane.PLAIN_MESSAGE);
    }
}
