package com.mycompany.classguideproducts;

/**
 * @author BRANDON
 */

public class freezeProduct extends dataProduct{
    private String temperature;

    public freezeProduct(String name) {
        super(name);
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Temperatura: " + temperature);
    }

}