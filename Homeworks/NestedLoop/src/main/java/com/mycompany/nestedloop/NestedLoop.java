package com.mycompany.nestedloop;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */
public class NestedLoop {

    public static void main(String[] args) {
        int a = 1;
        String dia;
        
        for (int num_dia = 1; num_dia < 8; num_dia++) {
            switch (num_dia) {
                case 1:
                    dia = "Lunes";
                    break;
                case 2:
                    dia = "Martes";
                    break;
                case 3:
                    dia = "Miercoles";
                    break;
                case 4:
                    dia = "Jueves";
                    break;
                case 5:
                    dia = "Viernes";
                    break;
                case 6:
                    dia = "Sabado";
                    break;
                case 7:
                    dia = "Domingo";
                    break;
                default:
                    dia = "¿Que Dia es Hoy?";
                    break;      
            }// fin del switch
            
            JOptionPane.showMessageDialog(null, "Hoy es " + dia + " el dia Nº " + num_dia + " de la semana", "Resultado"
                    + "", JOptionPane.PLAIN_MESSAGE);
        }//fin del for
    }
}
