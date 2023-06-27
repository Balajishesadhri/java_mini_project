package Supermarket;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Supermarket {
	
	 static Map<String, Double> itemPrices = new HashMap<>();
     static Map<String, Double> itemDiscounts = new HashMap<>();
     static HashMap<String, Double> bill = new HashMap<>();
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Supermarket!");
        System.out.println("----------------------------");
       
        initializeItemPrices();
       
        System.out.println(itemPrices);
        double totalAmount = 0.0;
        String itemName;

        do {
            System.out.println("Enter item name (or 'exit' to complete the billing): ");
            
            itemName = scanner.nextLine();

            if (!itemName.equalsIgnoreCase("exit")) {
                if (itemPrices.containsKey(itemName)) {
                    double itemPrice = itemPrices.get(itemName);
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    double itemTotal = itemPrice * quantity;
                    totalAmount += itemTotal;
                    bill.put(itemName, itemTotal);
                 //   System.out.println("Total price for " + itemName + ": $" + itemTotal);
                } else {
                    System.out.println("Item not found!");
                }
            }
        } while (!itemName.equalsIgnoreCase("exit"));

        // Apply discount to eligible items
        double discountedAmount=0;
        discountedAmount = applyDiscounts(totalAmount);

        System.out.println("----------------------------");
        Set s = bill.entrySet();
        for(Object o:s) {
        	 Entry entry = (Entry) o;
        	 String iteam =(String)entry.getKey();
        	 double price =(double)entry.getValue();
        	 System.out.println(iteam+"="+price);
        }
        System.out.println("you will get Spcial Discount on Wednesday");
        System.out.println("Total amount: INR" + totalAmount);
        System.out.println("Discounted amount: INR" + discountedAmount);
        
        System.out.println("Thank you for shopping with us!");
    }

    private static void initializeItemPrices() {
        // Initialize item prices
        itemPrices.put("apple", (double) 10);
        itemPrices.put("banana", (double) 5);
        itemPrices.put("orange", (double) 30);
        itemPrices.put("grapes", (double) 50);
       
        // Add more items and their prices as needed
    }

   

    private static double applyDiscounts(double totalAmount) {
        // Apply discounts based on eligible items
    	Date d=new java.util.Date();  
    	System.out.println(d);
    	
    	if(d.getDay()==3) {
    	
    	double	discountedAmount= 5.0;
           totalAmount -= discountedAmount;
           return totalAmount;
            
        }
        
    
       return 0;
    }
	 
	



}
