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
public class Manager extends Employee{
    protected int nooftasks;
    protected List<String> managertasks=new ArrayList<String>();
    public void setnumberoftasks(int nooftasks){
        this.nooftasks=nooftasks;
    }
    public void setList(List managertasks){
        this.managertasks=managertasks;
    }
    
    @Override
    public List givetasks(){
        
        return managertasks;
        
    }
   @Override
    public void close(){
       try{
           FileWriter manager_file=new FileWriter("Manager_Data.txt",true);
           manager_file.write(name+"/n");
           manager_file.write("age of Manager"+age+"/n");
           manager_file.write("Salary is"+salary+"/n");
           manager_file.write("Manager's Tasks are: "+managertasks+"/n");
           manager_file.write("/.........................."+"/n");
           manager_file.close();                   
           
       }catch(IOException e){
           e.printStackTrace();
       }
   }
    
    
    
    
}
