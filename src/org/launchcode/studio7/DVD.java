package org.launchcode.studio7;

public class DVD extends BaseDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private int regionCode; // code 1 ~ 9

    public DVD (String aName, String dContent, int dRegionCode) {
        super(aName, dContent, "DVD");
        this.regionCode = dRegionCode;
    }

    public int getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }

    public void printRegionCode() {
        System.out.println("RegionCode: " + this.regionCode);
    }
}
