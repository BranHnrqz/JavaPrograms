package com.mycompany.array;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class Array {

    public static void main(String[] args) {
        String name;
        int position = 0;
        char alphabet[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
                         'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 
                         'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        name = JOptionPane.showInputDialog("Ingresa tu nombre (solo en minúsculas)");
        
        for(int i = 0; i < name.length(); i++){
            char character = name.charAt(i);
            
            for(int j = 0; j < alphabet.length; j++){
                if(alphabet[j] == character){
                    position = j + 1;
                    
                    JOptionPane.showMessageDialog(null, "Letra: " + character + " está en la Posición: " + position);
                } 
            }
        }
    }
}
