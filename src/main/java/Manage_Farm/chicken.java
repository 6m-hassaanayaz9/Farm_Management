/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage_Farm;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mhass
 */
public class chicken extends Animal {
   private String gender;
   private String healthstatus;
   private double food;//cow feed in lbs
   private double perchicken;
   private double stockprice;
   public chicken(){
       name="Chicken";
       
   }
   public void setgender(String gender){
       this.gender=gender;
   }
   public void sethealthstatus(String healthstatus){
       this.healthstatus=healthstatus;
   }
   public void setfood(double food){
       this.food=food;
   }
   public void setperchicken(double perchicken){
       this.perchicken=perchicken;
   }
   public void setstockprice(){
       this.stockprice=perchicken*quantity;
   }
//getter methods
   public String getgender(){
       return gender;
   }
   public String gethealthstatus(){
       return healthstatus;
   }
   public double getfood(){
       return food;
   }
   public double getperchicken(){
       return perchicken;
   }
   //override methods
   
   
   @Override
   
   public  boolean feed(){
    if(food<5.0){
        return false; 
    }
    else{
        return true;
    }
    
   }
   @Override   
   public boolean breed(){
       if (age<4.0){
           return false;
       }
       else{
           return true;
       }
    
   }
   @Override
   public boolean healthmanagement(){
       if(healthstatus=="Healthy") {
           return true;
       }
       else if( healthstatus=="healthy"){
           return true;
       }
       else{
           return false;
       }
   }
   @Override
   public void close(){
       try{
           FileWriter chicken_file=new FileWriter("Chicken_Data.txt",true);
           chicken_file.write(name+"/n");
           chicken_file.write("age in months"+age+"\n");
           chicken_file.write("weight in lbs"+weight+"\n");
           chicken_file.write("Health status:"+healthstatus+"\n");
           chicken_file.write("/.........................."+"\n");
           chicken_file.close();                   
           
       }catch(IOException e){
           e.printStackTrace();
       }
   }
   @Override
   public double totalprice(){
       return stockprice;
   }
   
}
