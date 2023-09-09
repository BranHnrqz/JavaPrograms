package com.mycompany.shop;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */

public class Shop {

    public static void main(String[] args) {
         int stockProduct, gift = 0;
         double total=0, amount, discount=0;
  
         
         for(int cliente=1; cliente<=10; cliente++){
            stockProduct = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantas decenas necesitas: "));
            amount = stockProduct * 12;

            if(stockProduct > 0){
                if (stockProduct == 3){
                    discount = amount * 0.15;
                    total = amount - discount;
                }
                else {
                    if (stockProduct > 3){
                        gift = stockProduct - 3;
                        discount = amount * 0.10;
                        total = amount - discount;
                    }
                    discount = amount * 0.10;
                    total = amount - discount;
                }
            }
            
            JOptionPane.showMessageDialog(null, "Cliente #" + cliente + "-" + " \nDocenas: " + stockProduct + ", "
                                                            + "\nMonto descontado: $" + discount + ", \nTotal a Pagar: $" + total +
                                                            " \nObsequios: " + gift);
        }
    }
}
