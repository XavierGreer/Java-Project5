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
//Services class is created and inherits attributes from Accounts class
class Services extends Accounts {
    int numberOfItems;
    float pricePerItem;
    
    //getter and setter methods are created for the items and prices
    public int getItems() {
        return numberOfItems;
    }
    
    public void setItems(int newItems) {
        this.numberOfItems = newItems;
    }
    
    public float getPrice() {
        return pricePerItem;
    }
    
    public void setPrice(float newPrice) {
        this.pricePerItem = newPrice;
    }
    
    //method for overriding the calculateSales method so that the correct data is used for calculations
    @Override
    public float calculateSales(){
       float totalSales = numberOfItems * pricePerItem;
       return totalSales;
    }
}
