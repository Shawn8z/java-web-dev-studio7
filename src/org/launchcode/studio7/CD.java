package org.launchcode.studio7;

public class CD extends BaseDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private String sparsCode;

    public CD(String aName, String dContent, String dSparsCode) {
        super(aName, dContent, "CD");
        this.sparsCode = dSparsCode;
    }

    public String getSparsCode() {
        return this.sparsCode;
    }
    public void setSparsCode(String newCode) {
        this.sparsCode = newCode;
    }

    public void printSparsCode() {
        System.out.println("SPARS: " + this.sparsCode);
    }
}
