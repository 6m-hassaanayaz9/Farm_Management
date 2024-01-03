package Manage_Farm;
import java.io.Closeable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Crop Class
abstract class Crop implements Closeable {
    // Private data members
    protected String name;
    protected int fieldSize;    // in acres
    static protected double quantity;  // in tonnes
    static protected double price;     // in Rs. per tonne
    protected String growthStatus;
    protected String plantingDate;
    protected String harvestingDate;
    protected double totalprice;

    // Constructor
    public Crop() { }

    // Initialize static members
    static
    {
        quantity = 0;
        price = 0;
    }
    public double calctotalprice(){
        totalprice=quantity*price;
        return totalprice;
    }
        

    // Setter functions
    public void setName(String name) {
        this.name = name;
    }
    static public void setQuantity(double quantity) {
        try {
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity of crops cannot be negative");
            }
            Crop.quantity = quantity;
        } catch (IllegalArgumentException e) {
            // Handle the exception here, such as logging an error message or taking appropriate action
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setPrice(double price) {
        try {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            Crop.price = price;
        } catch (IllegalArgumentException e) {
            // Handle the exception here, such as logging an error message or taking appropriate action
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void setPlantingDate(String plantingDate) {
        this.plantingDate = plantingDate;
        // Also Turn status to germination when planting date is set
        growthStatus = "Germination";
    }

    public void setHarvestingDate(String harvestingDate) {
        this.harvestingDate = harvestingDate;
    }

    // Getter functions
    public String getName() {
        return name;
    }

    static public double getQuantity() {
        return quantity;
    }

    static public double getPrice() {
        return price;
    }

    public String getPlantingDate() {
        return plantingDate;
    }

    public String getHarvestingDate() {
        return harvestingDate;
    }

    public String getGrowthStatus()
    {
        return growthStatus;
    }

    // Function to advance the growth status
    // The growth statuses in order are
    // Germination, Seedling, Vegetative,
    // Flowering, Filling, Maturity
    public void advanceStatus ()
    {
        if ("Not Planted".equals(growthStatus)) {
            growthStatus = "Germination";
        } else if ("Germination".equals(growthStatus)) {
            growthStatus = "Seedling";
        } else if ("Seedling".equals(growthStatus)) {
            growthStatus = "Vegetative";
        } else if ("Vegetative".equals(growthStatus)) {
            growthStatus = "Flowering";
        } else if ("Flowering".equals(growthStatus)) {
            growthStatus = "Filling";
        } else if ("Filling".equals(growthStatus)) {
            growthStatus = "Maturity";
        }
    }

    // Function to update quantity i.e. add or remove some amount
    public void updateQuantity(double amount) {
        quantity += amount;
    }

    // Function to update price i.e. add or remove
    public void updatePrice(double amount) {
        price += amount;
    }

    // Calculates and returns revenue
    public double calculateRevenue() {
        return quantity * price;
    }

    // Get Crop Yield after harvest
    public double getTotalYield() {
        return quantity / fieldSize;
    }

    // Calculates and returns Yield
    public abstract double calculateYield();

    // Record any pest infestations
    public void recordPestInfestation(String date, String description) {
        try {
            FileWriter file = new FileWriter("Pest Infestation record.txt", true);
            file.write("Crop: " + name + "\n");
            file.write("Date: " + date + "\n");
            file.write("Description: " + description + "\n\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Record any disease outbreaks
    public void recordDiseaseOutbreak(String date, String description) {
        try {
            FileWriter file = new FileWriter("Crop Disease record.txt", true);
            file.write("Crop: " + name + "\n");
            file.write("Date: " + date + "\n");
            file.write("Description: " + description + "\n\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Water crop and record it
    public void recordCropWatering(String date, double water) throws RuntimeException {
        if ("Maturity".equals(growthStatus))
        {
            System.out.println("Crop has already matured!");
        }
        if (Harvest.getWater() < water) {
            throw new RuntimeException("Insufficient water!");
        }
        Harvest.updateWater(-water);
        try {
            FileWriter file = new FileWriter("Crop Watering record.txt", true);
            file.write("Crop: " + name + "\n");
            file.write("Date: " + date + "\n");
            file.write("Amount of water used: " + water + "\n\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to fertilize crop and record it
    public void recordFertilization(String date, double fertilizer) throws RuntimeException {
        if ("Maturity".equals(growthStatus))
        {
            System.out.println("Crop has already matured!");
        }
        if (Harvest.getFertilizer() < fertilizer) {
            throw new RuntimeException("Insufficient fertilizer!");
        }
        Harvest.updateFertilizer(-fertilizer);
        try {
            FileWriter file = new FileWriter("Crop Fertilization record.txt", true);
            file.write("Crop: " + name + "\n");
            file.write("Date: " + date + "\n");
            file.write("Amount of fertilizer used: " + fertilizer + "\n\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to reset the Crop for new season
    public void startNewSeason()
    {
        growthStatus = "Not Planted";
        fieldSize = 0;
        quantity = 0;
        plantingDate = null;
        harvestingDate = null;
    }
}
