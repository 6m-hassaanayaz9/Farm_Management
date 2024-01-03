/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage_Farm;

/**
 *
 * @author mhass
 */
public class Inventory_management {
    protected int animalquantity;
    protected int cropquantity;
    protected double cropssold;
    
    cow Cow1= new cow();
    chicken Chicken1=new chicken();
    Corn corn1=new Corn();
    Wheat wheat1=new Wheat();
    Rice rice1=new Rice();
     public void updatecornquant(double quantity){
         corn1.updateQuantity(quantity);
     }
          public void updatewheatquant(double quantity){
         wheat1.updateQuantity(quantity);
     }
         public void updatericequant(double quantity){
         rice1.updateQuantity(quantity);
     }
     public void updatecowquantity(int quantity){
         Cow1.setQuantity(quantity);
         
     }
     public void updatechickenquantity(int quantity){
         Chicken1.setQuantity(quantity);
         
     }
     
    
    
    
    
    
}

