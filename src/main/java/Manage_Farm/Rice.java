package Manage_Farm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Derived class Rice
class Rice extends Crop {
    private String riceType;
    private int numPaniclesPerM2;
    private int grainsPerPanicle;
    private double grainWeight;    // in grams

    // Constructor
    public Rice() {
        name = "Rice";

    }

    // Setter functions
    public void setRiceType(String riceType) {
        try {
            if (riceType == null) {
                throw new IllegalArgumentException("Rice type cannot be null");
            }
            this.riceType = riceType;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setNumPaniclesPerM2(int numPaniclesPerM2) {
        try {
            if (numPaniclesPerM2 < 0) {
                throw new IllegalArgumentException("Number of panicles per square meter cannot be negative");
            }
            this.numPaniclesPerM2 = numPaniclesPerM2;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setGrainsPerPanicle(int grainsPerPanicle) {
        try {
            if (grainsPerPanicle < 0) {
                throw new IllegalArgumentException("Grains per panicle cannot be negative");
            }
            this.grainsPerPanicle = grainsPerPanicle;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setGrainWeight(double grainWeight) {
        try {
            if (grainWeight < 0) {
                throw new IllegalArgumentException("Grain weight cannot be negative");
            }
            this.grainWeight = grainWeight;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Getter functions
    public String getRiceType() {
        return riceType;
    }

    public int getNumPaniclesPerM2() {
        return numPaniclesPerM2;
    }

    public int getGrainsPerPanicle() {
        return grainsPerPanicle;
    }

    public double getGrainWeight() {
        return grainWeight;
    }

    // Function to calculate yield in tonnes per acre
    public double calculateYield() {
        return (numPaniclesPerM2 * grainsPerPanicle * grainWeight) / 40.47;
    }

    // Overridden function of startNewSeason
    @Override
    public void startNewSeason()
    {
        super.startNewSeason();
        numPaniclesPerM2 = 0;
        grainWeight = 0;
        grainsPerPanicle = 0;
    }

    // Perform clean up and save data
    @Override
    public void close()
    {
        try {
            FileWriter file = new FileWriter("Rice.txt", false);
            file.write(riceType + "\n");
            file.write(fieldSize + "\n");
            file.write(quantity + "\n");
            file.write(price + "\n");
            file.write(growthStatus + "\n");
            file.write(plantingDate + "\n");
            file.write(harvestingDate + "\n");
            file.write(numPaniclesPerM2 + "\n");
            file.write(grainsPerPanicle + "\n");
            file.write(grainWeight + "");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}