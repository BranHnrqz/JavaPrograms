package com.mycompany.classguideproducts;

/**
 * @author BRANDON
 */

public class freshProduct extends dataProduct{
    private String packingDate, countryO;

    public freshProduct(String name) {
        super(name);
    }

    public void setPackingDate(String packingDate) {
        this.packingDate = packingDate;
    }

    public void setOriginCountry(String countryO) {
        this.countryO = countryO;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Fecha de Envasado: " + packingDate);
        System.out.println("País de Origen: " + countryO);
    }
}
