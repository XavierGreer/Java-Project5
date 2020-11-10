/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package accounts;
//import necessary packages for user input
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author xaviergreer
 */

//abstract Class Accounts is declared
abstract class Accounts {
    
    //initiallize accountId varible and create calculateSales() abstract method
    private String accountId;
    public abstract float calculateSales();
    
    //Setter and getter methods are declared
    public String getId() {
        return accountId;
    }
    public void setId(String newAccountId) {
        this.accountId = newAccountId;
    }    
        
    //main method declared
    public static void main(String[] args) {
        
        //creating an object for the form
        AccountsForm acc1 = new AccountsForm();
        
        //window created
        acc1.setSize(550, 300);
        acc1.setTitle("Unit 5 - Accounts GUI");
        acc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        acc1.setVisible(true);
        
        //System.out.println("Hello User!");
        //an array is made for holding all the accounts that are created at a max of 10 accounts
        Accounts[] accounts = new Accounts[10];
        //method accounting is ran, this method was made to be recursive
        accounting(accounts, 0);
        
        
        
    }
    
    //remove for loop since method is recursive, the method will continue to set i to 0 so it must be removed and instead when the method is called again
    //you must initialize the increment within the parameters
    
    static int accounting(Accounts accounts[], int n){
        Scanner sc = new Scanner(System.in);
        
        //integer for keeping track of array element position
        int i = n;
        
        //ask for user input to find out what kind of account they want to create
        System.out.println("What kind of account would you like to create? \n\nServices or Supplies?");
        String answer = sc.nextLine();
        
        //while statement is declared for catching an invalid input from the user
        while(!(answer.equalsIgnoreCase("services") || answer.equalsIgnoreCase("supplies"))) {
            System.out.println("Invalid input, please enter 'services' or 'supplies'");
            answer = sc.nextLine();
        }
        
        //if.. else if.. statement is declared for picking correct route depending on user input
        if(answer.equalsIgnoreCase("supplies")) {
            
            //Supplies object is created and named supplies then added to the accounts array
            Supplies supplies = new Supplies();
            accounts[i] = supplies;
            
            //get user input for the new accounts name
            System.out.println("\nWhat would you like to name this account?\t");
            answer = sc.nextLine();
            supplies.setId(answer);

            //get user input for the hourly rate
            System.out.println("\nWhat is the hourly rate for this account?\t");
            float rate = sc.nextFloat();
            supplies.setRate(rate);
            
            //get user input for the hours set on this account
            System.out.println("\nHow many hours are on this account?\t");
            int hours = sc.nextInt();
            supplies.setHours(hours);
            
            //total sales for this account are calculated and printed
            System.out.println("\nThe total sales for " + accounts[i].getId() + " is: " + accounts[i].calculateSales());
        }
        
        else if(answer.equalsIgnoreCase("services")) {
            
            //Services object is created and named services then added to the accounts array
            Services services = new Services();
            accounts[i] = services;

            //User names the account
            System.out.println("\nWhat would you like to name this account?\t");
            answer = sc.nextLine();
            services.setId(answer);

            //User inputs the amount of items
            System.out.println("\nHow many Items are in this account?\t");
            int item = sc.nextInt();
            services.setItems(item);

            //User inputs the price per item on the account
            System.out.println("\nWhat is the price of the items in this account?\t");
            float price = sc.nextFloat();
            services.setPrice(price);

           //total sales for this account are calculated and printed
            System.out.println("\nThe total sales for " + accounts[i].getId() + " is: " + accounts[i].calculateSales());
        }
        
        //increment for keeping track of which array element is being manipulated
        i++;
        
        //User inputs wether or not they would like to create another account
        System.out.println("\nWould you like to create another account? Yes(Y) or No(N)");
        sc.nextLine();
        answer = sc.nextLine();

        //if.. else if.. statement for adding another account or exiting the program.
        if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("y")){
            accounting(accounts, i);
        }

        else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
            System.out.println("The accounts that have been made are:\n");

            //for loop that prints out each element in the array
            for(int x=0; x<=accounts.length-1; x++){
                if(accounts[x] == null){
                    Runtime.getRuntime().exit(0);
                }
                else{

                    System.out.println(accounts[x].getId() + "\tTotal Sales: " + accounts[x].calculateSales());
                }
            }

            Runtime.getRuntime().exit(0);
        }
        
            return 0;
    } 
    
        companySales test1 = new companySales();
}
