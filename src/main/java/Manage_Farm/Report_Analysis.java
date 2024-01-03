/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage_Farm;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author mhass
 */
public class Report_Analysis {
    public double moreshare;
    public double stockshare;
    public double cropshare;
    public double stocksharepercent;
    public double cropsharepercent;
    Farm f=new Farm();
    public void setcropshare(){
      this.cropshare=f.allcropprice();
    } 
    public void setstockshare(){
    stockshare=f.allstocksprice();    
    }
    
    
    public double calcstockshareperc(){
        stocksharepercent=(stockshare/(stockshare+cropshare))*100;
        return stocksharepercent;
    }
    public double calccropshareperc(){
        cropsharepercent=(cropshare/(stockshare+cropshare))*100;
        return cropsharepercent;
    }
    
    
}
