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
//companySales class is created for testing toString() method as well as the calculatedSales() method
public class companySales {
    
    Supplies suppliesAccount1 = new Supplies();
    
    
    public float sales(){
        suppliesAccount1.setHours(80);
        suppliesAccount1.setRate(16.88f);
        
        return suppliesAccount1.calculateSales();
    }
    
    @Override
    public String toString(){
        
        return "" + sales();
    }
    
}
