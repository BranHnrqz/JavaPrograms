package com.mycompany.discount;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class Discount {

    public static void main(String[] args) {
        //El usuario inserta estos datos
        double salary = Double.parseDouble(JOptionPane.showInputDialog ("Ingresa tu Salario: "));
        
        String gender = (JOptionPane.showInputDialog ("Ingresa tu Género (hombre o mujer): "));
        
        //Declarando y asignando valores constantes
        final double AFP = salary * 0.0625;
        final double withoutAFP = 0;
        final double ISSS = salary * 0.03;
        final double Renta = salary * 0.10;
        final double RentaM = 0;
        final double ISSSM = salary * 0.02;
        double discount;
        double totalSalary;

        
        switch (gender) {
            case "hombre":
                if (salary > 300) {
                    discount = AFP + ISSS + Renta;
                    totalSalary = salary - discount;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: $" + salary + "\nDescuento de AFP: " + AFP + 
                                                  "%\nDescuento de ISSS: " + ISSS + "%\nDescuento de Renta: " + Renta + 
                                                  "%\nDescuento Total: " + discount + "%\nSueldo total: $" + totalSalary, 
                                             "Resultado", JOptionPane.PLAIN_MESSAGE);
                    
                } else {
                    discount = ISSS + Renta;
                    totalSalary = salary - discount;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: $" + salary + "\nDescuento de AFP: " + withoutAFP + 
                                                                    "%\nDescuento de ISSS: " + ISSS + "%\nDescuento de Renta: " + Renta + 
                                                                    "%\nDescuento Total: " + discount + "%\nSueldo total: $" + totalSalary, 
                                                               "Resultado", JOptionPane.PLAIN_MESSAGE);
                }
                

                break;

            case "mujer":
                if (salary > 300) {
                    discount = AFP + ISSSM;
                    totalSalary = salary - discount;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: $" + salary + "\nDescuento de AFP: " + AFP + 
                                                                    "%\nDescuento de ISSS: " + ISSSM + "%\nDescuento de Renta: " + RentaM + 
                                                                    "%\nDescuento Total: " + discount + "%\nSueldo total: $" + totalSalary, 
                                                               "Resultado", JOptionPane.PLAIN_MESSAGE);
                } else {
                    discount = ISSSM;
                    totalSalary = salary - discount;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: $" + salary + "\nDescuento de AFP: " + withoutAFP + 
                                                                    "%\nDescuento de ISSS: " + ISSSM + "%\nDescuento de Renta: " + RentaM + 
                                                                    "%\nDescuento Total: " + discount + "%\nSueldo total: $" + totalSalary, 
                                                               "Resultado", JOptionPane.PLAIN_MESSAGE);
                }
                
                break;
                default:
                throw new AssertionError();
        }
    }
}
