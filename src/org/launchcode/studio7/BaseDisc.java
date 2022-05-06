package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {

    private String name;
    private String content;
    private String discType;
    private int spinSpeed;
    private int storageSize;
    private ArrayList<String> storedData = new ArrayList<>();
    private boolean writable = true;
    private String readLaserType;

    public BaseDisc(String aName, String dContent, String aDiscType) {

        this.name = aName;
        this.content = dContent;
        this.discType = aDiscType.toLowerCase();

        if (this.discType.equals("cd")) {
            this.storageSize = OpticalDisc.cdStorageSize;
            this.spinSpeed = OpticalDisc.cdSpinSpeed;
            this.readLaserType = "red";

        } else if (this.discType.equals("dvd")) {
            this.storageSize = OpticalDisc.dvdStorageSize;
            this.spinSpeed = OpticalDisc.dvdSpinSpeed;
            this.readLaserType = "red";
        }
    }


    public String getName() {
        return name;
    }
    public String getContent() {
        return content;
    }
    public int getSpinSpeed() {
        return this.spinSpeed;
    }
    public int getStorageSize() {
        return this.storageSize;
    }
    public String getDiscType() {
        return this.discType;
    }
    public ArrayList<String> getStoredData() {
        return storedData;
    }
    public boolean isWritable() {
        return writable;
    }

    public void setName(String aName) {
        this.name = aName;
    }



    @Override
    public void spinDisc() {
        System.out.println("Your " + this.discType + " is spinning at " + this.spinSpeed + " rmp.");
    }

    @Override
    public void storeData(String aData) {
        System.out.println("Storing " + aData + " to disc.");
        System.out.println("Storing...");
        this.storedData.add(aData);
        System.out.println("Storing...");
        System.out.println("Data store complete");
    }

    @Override
    public void writeData() {
        if (this.writable) {
            System.out.println("Your " + this.discType + " has " + this.storageSize +"MB of storage size");
            this.writable = false;
            System.out.println("Writing to disc...");
            System.out.println("Writing to disc...");
            System.out.println("Writing to disc...");
            System.out.println("Writing complete.");
        } else {
            System.out.println("Disc has already been written.");
        }
    }

    @Override
    public void readData() {
        System.out.println("Data on disc: ");
        for (String item : this.getStoredData()) {
            System.out.println(item);
        }
    }

    @Override
    public void printInfo() {
        String str = "Disc Name: " + this.name + "\n" +
                "Capacity: " + this.storageSize + "MB\n" +
                "Content: " + this.content + "\n" +
                "Disc Type: " + this.discType;
        System.out.println(str);
    }

    @Override
    public void printReadLaserColor() {
        String str = this.readLaserType;
        System.out.println(str);
    }

    @Override
    public void printSpinningSpeed() {
        String str = "Your " + this.discType + " can spin at a max speed of " + this.spinSpeed + "rmp.";
        System.out.println(str);
    }
}
