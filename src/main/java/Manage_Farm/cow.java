/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage_Farm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author mhass
 */
class cow extends Animal{
   private String gender;
   private String healthstatus;
   private double food;//cow feed in lbs
   private double stockprice;
   private double percow;  //price prercow
   
   public cow(){
       name="Cow";
       
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
   public void setpercow(double percow){
       this.percow=percow;
   }
   public void setstockprice(){
       this.stockprice=percow*quantity;
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
   public double getpercow(){
       return percow;
   }
   //override methods
   
   
   @Override
   
   public  boolean feed(){
    if(food<20.0){
        return false; 
    }
    else{
        return true;
    }
    
   }
   @Override   
   public boolean breed(){
       if (age<12.0){
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
           FileWriter cow_file=new FileWriter("Cow_Data.txt",true);
           cow_file.write(name+"\n");
           cow_file.write("age in months"+age+"\n");
           cow_file.write("weight in lbs"+weight+"\n");
           cow_file.write("Health status:"+healthstatus+"\n");
           cow_file.write("price: "+percow+"\n");
           cow_file.write("/.........................."+"\n");
           cow_file.close();                   
           
       }catch(IOException e){
           e.printStackTrace();
       }
   }
   @Override
   public double totalprice(){
       return stockprice;
   } 
   
}
