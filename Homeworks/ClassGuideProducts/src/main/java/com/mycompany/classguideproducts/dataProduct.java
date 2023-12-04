
package com.mycompany.classguideproducts;

/**
 * @author BRANDON
 */

public class dataProduct {
    private String name, expirationDate, lote;

    public dataProduct(String nombre) {
        this.name = nombre;
        
        //Los Valores Asignados quedan estáticos
        this.expirationDate = "01/01/2026"; 
        this.lote = "HM0002"; 
    }

    public void showInformation() {
        System.out.println("Producto: " + name);
        System.out.println("Fecha de Caducidad: " + expirationDate);
        System.out.println("Lote: " + lote);
    }
}
