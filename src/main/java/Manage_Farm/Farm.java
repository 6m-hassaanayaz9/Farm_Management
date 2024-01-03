/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage_Farm;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mhass
 */
public class Farm {
    public double ttstockprice;
    public double ttcropprice;
    
    cow Cow= new cow();
    chicken Chicken=new chicken();
    Corn corn=new Corn();
    Wheat wheat=new Wheat();
    Rice rice=new Rice();
    
    public double allstocksprice(){
        ttstockprice=Cow.totalprice()+Chicken.totalprice();
        return ttstockprice;
    }
    public double allcropprice(){
        ttcropprice=corn.calctotalprice()+wheat.calctotalprice()+rice.calctotalprice();
        
        return ttcropprice;
    }
    public void updatingcornquantity(double cornquantity){
        corn.updateQuantity(cornquantity);
        corn.close();
        System.out.println("Sample Corn file is created");
        
    }
    public void updatingwheatquantity(double wheatquantity){
        wheat.updateQuantity(wheatquantity);
    }
    public void updatingricequantity(double ricequantity){
        rice.updateQuantity(ricequantity);
    }
    public void addnewCow(double age,String healthstatus, double weight,int quantity){
        cow c1=new cow();
        c1.setage(age);
        c1.setQuantity(quantity);
        c1.setweight(weight);
        c1.sethealthstatus(healthstatus);
        Farm ff=new Farm();
        ff.printnewcow(c1);
        
        
    }
    public void printnewcow(cow c){
        System.out.println("A new object of cow is created:\n");
        System.out.println("The animal is: "+c.getname());
        System.out.println("Age is "+c.getage());
        System.out.println("Weight is "+c.getweight());
        System.out.println("Quantity is "+c.getquantity());
        if (c.breed()){
            System.out.println("It can breed");
        }
        else{
            System.out.println("It can not breed");
        }
        c.close();
        System.out.println("Cow sample is created");
        
    }
     public void addnewChicken(double age,String healthstatus, double weight,int quantity){
        chicken ch1=new chicken();
        ch1.setage(age);
        ch1.setQuantity(quantity);
        ch1.setweight(weight);
        ch1.sethealthstatus(healthstatus);
        Farm ff1=new Farm();
        ff1.printnewchicken(ch1);
        
        
    }
     public void printnewchicken(chicken ch){
        System.out.println("A new object of chicken is created:\n");
        System.out.println("The animal is: "+ch.getname());
        System.out.println("Age is"+ch.getage());
        System.out.println("Weight is "+ch.getweight());
        System.out.println("Quantity is"+ch.getquantity());
        if (ch.breed()){
            System.out.println("It can lay eggs");
        }
        else{
            System.out.println("It can not lay eggs");
        }
        ch.close();
        System.out.println("sample chicken is created");
        
    }

    public static void main(String [] args){
        JFrame frame1=new JFrame("Farm Management");
        Home h1=new Home();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.getContentPane().add(h1);
        frame1.pack();
        frame1.setVisible(true);
        
        
        while (h1.getfunnumb() == 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(h1.getfunnumb()==1){
        CropUpdate_pg ucp1=new CropUpdate_pg();
        frame1.getContentPane().removeAll();
        frame1.getContentPane().add(ucp1);
        frame1.revalidate();    


        while (ucp1.getcropno()==0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(ucp1.getcropno()==1){
            Farm f2=new Farm();
            double cornquantity=ucp1.getuserquantity();
            f2.updatingcornquantity(cornquantity);
            
            
        }
        else if(ucp1.getcropno()==2){
            Farm f2=new Farm();
            double wheatquantity=ucp1.getuserquantity();
            f2.updatingwheatquantity(wheatquantity);
        }
        else if(ucp1.getcropno()==3){
            Farm f2=new Farm();
            double ricequantity=ucp1.getuserquantity();
            f2.updatingricequantity(ricequantity);
        }
        else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }              
        }
        
        
        }
        
        else if (h1.getfunnumb()==2){
        New_Animal nap1=new New_Animal();
        frame1.getContentPane().removeAll();
        frame1.getContentPane().add(nap1);
        frame1.revalidate();            
        while (nap1.getuserAnimalname()==0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(nap1.getuserAnimalname()==1){
            Farm f3=new Farm();
            f3.addnewCow(nap1.getuserage(), nap1.getuserhealth(), nap1.getuserweight(), nap1.getuserquantity());
        }
        else if (nap1.getuserAnimalname()==2){
            Farm f3=new Farm();
            f3.addnewChicken(nap1.getuserage(), nap1.getuserhealth(), nap1.getuserweight(), nap1.getuserquantity());
        }
        else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }             
        }
        
        
        
        
        
        
        
        }
        
        else if(h1.getfunnumb()==3){
        //for updating animal
        
        }
        else{
            //note more elseifs can be added for other left over buttons
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }                            
        }
        frame1.dispose();
    }
}
