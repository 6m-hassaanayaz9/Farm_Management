package Manage_Farm;
// This is a storage class
public class Harvest {
    static private double revenue;
    // Private data members
    static private double fertilizer;
    static private double water;
    static private double amountRice;
    static private double amountWheat;
    static private double amountCorn;
    // Initialization of static data members
    static {
        fertilizer = 0;
        water = 0;
        amountRice = 0;
        amountCorn = 0;
        amountWheat = 0;
        revenue = 0;
    }
    // Setter functions
    static public void setFertilizer(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Fertilizer amount cannot be negative");
            }
            fertilizer = amount;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static public void setWater(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Water amount cannot be negative");
            }
            water = amount;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Getter functions
    static public double getWater()
    {
        return water;
    }

    static public double getFertilizer()
    {
        return fertilizer;
    }

    // Function to update amount of water
    static public void updateWater(double amount)
    {
        water += amount;
    }

    // Function to update amount of fertilizer
    static public void updateFertilizer(double amount)
    {
        fertilizer += amount;
    }

    // Function to store the harvested crop
    static public void harvestAndStore()
    {
        amountWheat = Wheat.getQuantity();
        Wheat.setQuantity(0);
        amountCorn = Corn.getQuantity();
        Corn.setQuantity(0);
        amountRice = Rice.getQuantity();
        Rice.setQuantity(0);
    }

    //Function to sell all harvested crops and return the revenue
    static public void SellAndGenerateRevenue()
    {
        // Calculate revenue for each crop
        double cornRevenue = amountCorn * Corn.getPrice();
        double wheatRevenue = amountWheat * Wheat.getPrice();
        double riceRevenue = amountRice * Rice.getPrice();
        // Sum the revenues
        revenue = cornRevenue + wheatRevenue + riceRevenue;
        // Set all amounts to zero after selling
        amountCorn = 0;
        amountWheat = 0;
        amountRice = 0;
    }
}