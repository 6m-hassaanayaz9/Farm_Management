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
import java.util.*;

/**
 *
 * @author mhass
 */
public abstract class Employee implements Closeable{
    protected String name ;
    protected double age;
    protected String role;
    protected double salary;
    protected int quantity;
    
    
    //setter meth
    public void setname(String name){
        this.name=name;
    }
    public void setage(double age){
        this.age=age;
    }
    public void setquantity(int quantity){
        this.quantity+=quantity;
    }
    public void setrole(String role){
        this.role=role;
    }   
    public String getname(){
        return name;
    }
    public double getage(){
        return age;
    }
    public int getquantity(){
        return quantity;
    }
    public String getrole(){
        return role;
    }
    public double getsalary(){
        return salary;
    }
    
    public  abstract List givetasks();
}
