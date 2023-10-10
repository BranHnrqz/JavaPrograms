package com.mycompany.classguideproducts;
import java.util.Scanner;

/**
 * @author BRANDON
 */

public class ClassGuideProducts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del Producto: ");
        String name = scanner.nextLine();

        System.out.println("Selecciona el tipo de producto:");
        System.out.println("1. Producto Fresco");
        System.out.println("2. Producto Refrigerado");
        System.out.println("3. Producto Congelado");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                freshProduct fP = new freshProduct(name);
                System.out.print("Ingresa la FECHA DE ENVASADO del Producto: ");
                String pD = scanner.next();
                fP.setPackingDate(pD);
                System.out.print("Ingresa el PAIS DE ORIGEN del Producto: ");
                String cO = scanner.next();
                fP.setOriginCountry(cO);
                fP.showInformation();
                break;
            case 2:
                refrigeratedProduct rP = new refrigeratedProduct(name);
                System.out.print("Ingresa el Codigo del Producto: ");
                String code = scanner.next();
                rP.setCode(code);
                rP.showInformation();
                break;
            case 3:
                freezeProduct fProduct = new freezeProduct(name);
                System.out.print("Ingresa la TEMPERATURA del Producto: ");
                String t = scanner.next();
                fProduct.setTemperature(t);
                fProduct.showInformation();
                break;
            default:
                System.out.println("Opción Inválida");
        }

        scanner.close();
    }
}
