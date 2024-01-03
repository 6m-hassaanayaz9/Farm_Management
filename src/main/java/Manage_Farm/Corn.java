package Manage_Farm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Derived class Corn
class Corn extends Crop {
    private String cornType;
    private int earsPerAcre;
    private int kernelsPerEar;
    private double earWeight;    // in grams
    private int shrinkage;

    // Constructor
    public Corn() {
        name = "Corn";
        cornType="Pakistani";
        earsPerAcre=2;
        kernelsPerEar=100;
        earWeight=20.0;
        shrinkage=2;
    }

    // Setter functions
    public void setCornType(String cornType) {
        try {
            if (cornType == null) {
                throw new IllegalArgumentException("Corn type cannot be null");
            }
            this.cornType = cornType;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setEarsPerAcre(int earsPerAcre) {
        try {
            if (earsPerAcre < 0) {
                throw new IllegalArgumentException("Ears per acre cannot be negative");
            }
            this.earsPerAcre = earsPerAcre;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setKernelsPerEar(int kernelsPerEar) {
        try {
            if (kernelsPerEar < 0) {
                throw new IllegalArgumentException("Kernels per ear cannot be negative");
            }
            this.kernelsPerEar = kernelsPerEar;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setEarWeight(double earWeight) {
        try {
            if (earWeight < 0) {
                throw new IllegalArgumentException("Ear weight cannot be negative");
            }
            this.earWeight = earWeight;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setShrinkage(int shrinkage) {
        try {
            if (shrinkage < 0) {
                throw new IllegalArgumentException("Shrinkage cannot be negative");
            }
            this.shrinkage = shrinkage;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    // Getter functions
    public String getCornType() {
        return cornType;
    }

    public int getEarsPerAcre() {
        return earsPerAcre;
    }

    public int getKernelsPerEar() {
        return kernelsPerEar;
    }

    public double getEarWeight() {
        return earWeight;
    }

    public int getShrinkage() {
        return shrinkage;
    }

    // Function to calculate yield in tonnes per acre
    public double calculateYield() {
        return (earsPerAcre * kernelsPerEar * earWeight * 0.0254) / (1000 * (1 - shrinkage * 0.01));
    }

    // Overridden function of startNewSeason
    @Override
    public void startNewSeason()
    {
        super.startNewSeason();
        earWeight = 0;
        earsPerAcre = 0;
        kernelsPerEar = 0;
        shrinkage = 0;
    }

    // Perform clean up and save data
    @Override
    public void close()
    {
        try {
            FileWriter file = new FileWriter("Corn.txt", false);
            file.write(cornType + "\n");
            file.write(fieldSize + "\n");
            file.write(quantity + "\n");
            file.write(price + "\n");
            file.write(growthStatus + "\n");
            file.write(plantingDate + "\n");
            file.write(harvestingDate + "\n");
            file.write(earsPerAcre + "\n");
            file.write(earWeight + "\n");
            file.write(kernelsPerEar + "\n");
            file.write(shrinkage + "");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
