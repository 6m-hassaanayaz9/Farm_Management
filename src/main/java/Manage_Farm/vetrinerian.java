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
public class vetrinerian extends Employee{
       protected int nooftasks;
    protected List<String> vettasks=new ArrayList<String>();
    public void setnumberoftasks(int nooftasks){
        this.nooftasks=nooftasks;
    }
    public void setList(List vettasks){
        this.vettasks=vettasks;
    }
    
    @Override
    public List givetasks(){
        
        return vettasks;
        
    }
   @Override
    public void close(){
       try{
           FileWriter manager_file=new FileWriter("Vetrinerian_Data.txt",true);
           manager_file.write(name+"\n");
           manager_file.write("age of Vet"+age+"\n");
           manager_file.write("Salary is"+salary+"\n");
           manager_file.write("Vet's Tasks are: "+vettasks+"\n");
           manager_file.write("/.........................."+"\n");
           manager_file.close();                   
           
       }catch(IOException e){
           e.printStackTrace();
       }
   }
    
    
    
    
}
