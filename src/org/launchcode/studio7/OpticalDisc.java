package org.launchcode.studio7;

public interface OpticalDisc {

    double diameter = 120;
    double thickness = 1.2;

    int cdStorageSize = 680;
    int cdSpinSpeed = 500;

    int dvdStorageSize = 4700;
    int dvdSpinSpeed = 1600;


    void spinDisc();

    void storeData(String aData);

    void writeData();

    void readData();


    void printInfo();

    void printReadLaserColor();

    void printSpinningSpeed();
}
