package Manage_Farm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Derived class Wheat
class Wheat extends Crop {
    private String wheatType;
    private int headsPerYard;
    private double headWeight;    // in grams

    // Constructor
    public Wheat() {
        name = "Wheat";
 
    }

    // Setter functions
    public void setWheatType(String wheatType) {
        try {
            if (wheatType == null || wheatType.isEmpty()) {
                throw new IllegalArgumentException("Wheat type cannot be null or empty");
            }
            this.wheatType = wheatType;
        } catch (IllegalArgumentException e) {
            // Handle the exception or propagate it to the calling code
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setHeadsPerYard(int headsPerYard) {
        try {
            if (headsPerYard < 0) {
                throw new IllegalArgumentException("Heads per yard cannot be negative");
            }
            this.headsPerYard = headsPerYard;
        } catch (IllegalArgumentException e) {
            // Handle the exception or propagate it to the calling code
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setHeadWeight(double headWeight) {
        try {
            if (headWeight < 0) {
                throw new IllegalArgumentException("Head weight cannot be negative");
            }
            this.headWeight = headWeight;
        } catch (IllegalArgumentException e) {
            // Handle the exception or propagate it to the calling code
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Getter functions
    public String getWheatType() {
        return wheatType;
    }

    public int getHeadsPerYard() {
        return headsPerYard;
    }

    public double getHeadWeight() {
        return headWeight;
    }

    // Function to calculate yield in tonnes per acre
    public double calculateYield() {
        return (headsPerYard * headWeight * 0.00002246) / 0.907;
    }

    // Overridden function of startNewSeason
    @Override
    public void startNewSeason()
    {
        super.startNewSeason();
        headWeight = 0;
        headsPerYard = 0;
    }

    // Perform clean up and save data
    @Override
    public void close()
    {
        try {
            FileWriter file = new FileWriter("Wheat.txt", false);
            file.write(wheatType + "\n");
            file.write(fieldSize + "\n");
            file.write(quantity + "\n");
            file.write(price + "\n");
            file.write(growthStatus + "\n");
            file.write(plantingDate + "\n");
            file.write(harvestingDate + "\n");
            file.write(headsPerYard + "\n");
            file.write(headWeight + "");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
