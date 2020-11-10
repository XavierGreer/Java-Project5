/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author xaviergreer
 */
//class supplies is created and inherits methods and attributes from the Accounts class
class Supplies extends Accounts{
    int  numberOfHours;
    float ratePerHour;
    
    //setter and getter methods are created for the hours and rates
    public int getHours(){
        return numberOfHours;
    }
    
    public void setHours(int newHours){
        this.numberOfHours = newHours;
    }
    
    public float getRate(){
        return ratePerHour;
    }
    
    public void setRate(float newRate){
        this.ratePerHour = newRate;
    }
    
    //method calculateSales is overriden so that the correct data is used when calculating data
    @Override
    public float calculateSales(){
       float totalSales = numberOfHours * ratePerHour;
       return totalSales;
    }
}
