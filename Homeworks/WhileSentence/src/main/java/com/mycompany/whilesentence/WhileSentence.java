package com.mycompany.whilesentence;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */
public class WhileSentence {

    public static void main(String[] args) {
        int alumno = 1, aprobado = 0;
        
        double nota1;
        
        String primerNota;
        
        //Mientras que, la cantidad de alumnos que ingresen su calificación sea menor o igual a 5, se repetirá el bucle
        while (alumno <= 5) {
            primerNota = JOptionPane.showInputDialog("Digite la nota del alumno: ");
            nota1 = Double.parseDouble(primerNota);
            
            if (nota1 > 5.99) {
                aprobado++;
            }//fin del if
            
            alumno++;
        }//fin del while
        
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: "
                + aprobado, "Resultados del examen", JOptionPane.INFORMATION_MESSAGE);
    }
}
