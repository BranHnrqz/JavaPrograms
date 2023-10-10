package com.mycompany.classguideproducts;

/**
 * @author BRANDON
 */

public class refrigeratedProduct extends dataProduct{
    private String code;

    public refrigeratedProduct(String name) {
        super(name);
    }

    public void setCode(String codigo) {
        this.code = codigo;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Código: " + code);
    }
}
