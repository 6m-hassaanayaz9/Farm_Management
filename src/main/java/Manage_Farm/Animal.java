/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage_Farm;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mhass
 */
abstract class Animal implements Closeable {
    protected String name;
    protected double age;//in months
    protected double weight;//in lb
    static protected int quantity;//number of animals
    public Animal(){
        
    }//constructor
    static {
        quantity=0;
    }
      // Setter functions
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        //setting ==initial or updating
        try {
            if (Animal.quantity==0 && quantity < 0) {
                throw new IllegalArgumentException("Quantity of Animals cannot be negative");
            }
            Animal.quantity= Animal.quantity+quantity;
        } catch (IllegalArgumentException e) {
            // Handle the exception here, such as logging an error message or taking appropriate action
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void setage(double age){
        try{
            if(age<0){
            throw new IllegalArgumentException("Age of Animal cannot be  less than 0");
        }
        this.age=age;
    }catch(IllegalArgumentException e) {
            // Handle the exception here, such as logging an error message or taking appropriate action
            System.out.println("Error: " + e.getMessage());
        }

    
    }
    
    public void setweight(double weight){
        try{
            if(weight<=0){
            throw new IllegalArgumentException("Weight of Animal cannot be  less than or equal to  0");
        }
        this.weight=weight;
    }catch(IllegalArgumentException e) {
            // Handle the exception here, such as logging an error message or taking appropriate action
            System.out.println("Error: " + e.getMessage());
        }

    
    }
    //...............................
    //getter methods
    public String getname(){
        return name;
    }
    public double getage(){
        return age;
    }
    public int getquantity(){
        return quantity;
    }
    public double getweight(){
        return weight;
    }
    
    //Required abstract Functions can be molded according to the animal type
    
    public abstract boolean feed();
  
    public abstract boolean breed();
    public abstract boolean healthmanagement();
    public abstract double totalprice();
    
}

    
  
    

