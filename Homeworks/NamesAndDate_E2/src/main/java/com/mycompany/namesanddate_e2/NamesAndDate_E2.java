package com.mycompany.namesanddate_e2;
import javax.swing.JOptionPane;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * @author BRANDON
 */

public class NamesAndDate_E2 {

    public static void main(String[] args) {
        String firstName, lastName;
        
        firstName = JOptionPane.showInputDialog("Ingresa tu Nombre: ");
        lastName = JOptionPane.showInputDialog("Ingresa tu Apellido: ");
        
        Date dateToday = new Date();
        SimpleDateFormat dateFrmt = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        String showDate = dateFrmt.format(dateToday);
        
        JOptionPane.showMessageDialog(null, "Holaaaa " + firstName + " " + lastName + " \nHoy es: " + showDate, "Bienvenido/a", JOptionPane.PLAIN_MESSAGE);
    }
}
