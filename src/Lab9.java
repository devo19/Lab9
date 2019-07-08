import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Lab9 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userDecision = "";
		String userChoice = "";		

		ArrayList<String> itemsOrdered = new ArrayList<>();
		ArrayList<Double> itemPrices = new ArrayList<>();

		Map<String, Double> menuOfItems = new HashMap<>();

		menuOfItems.put("apple", 0.99);
		menuOfItems.put("banana", 0.59);
		menuOfItems.put("cauliflower", 1.59);
		menuOfItems.put("dragonfruit", 2.19);
		menuOfItems.put("Elderberry", 1.79);
		menuOfItems.put("figs", 2.09);
		menuOfItems.put("grapefruit", 1.99);
		menuOfItems.put("honeydew", 3.49);		
        
		do {
			
		System.out.println("Welcome to Guenther's Market!");
		System.out.println();
		System.out.println("Item\t\tPrice");
		System.out.println("========================");

		for (Map.Entry<String, Double> me : menuOfItems.entrySet()) {
			System.out.println(String.format("%-15s %s", me.getKey(), me.getValue()));
		}
		System.out.println();
		System.out.println("What item would you like to order?");
		userChoice = scnr.nextLine();

		if (userChoice.equalsIgnoreCase("apple")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(0.99);
			System.out.println("Adding apple to cart at 0.99");
			
			

		} else if (userChoice.equalsIgnoreCase("figs")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(2.09);
			System.out.println("Adding figs to cart at 2.09");
			
			

		} else if (userChoice.equalsIgnoreCase("cauliflower")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(1.59);
			System.out.println("Adding cauliflower to cart at 1.59");
			
			

		} else if (userChoice.equalsIgnoreCase("banana")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(0.59);
			System.out.println("Adding banana to cart at 0.59");
			
			

		} else if (userChoice.equalsIgnoreCase("dragonfruit")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(2.19);
			System.out.println("Adding dragonfruit to cart at 2.19");
			
			

		} else if (userChoice.equalsIgnoreCase("Elderberry")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(1.79);
			System.out.println("Adding Elderberry to cart at 1.79");
			
			

		} else if (userChoice.equalsIgnoreCase("grapefruit")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(1.99);
			System.out.println("Adding grapefruit to cart at 1.99");
			
			
		} else if (userChoice.equalsIgnoreCase("honeydew")) {
			itemsOrdered.add(userChoice);
			itemPrices.add(3.49);
			System.out.println("Adding honeydew to cart at 3.49");

		} else {
			System.out.println("Sorry, we don't have those. Please try again");
		    
		}
			
		System.out.println();
		System.out.println("Would you like to order anything else (y/n)?");
		userDecision = scnr.nextLine();
		
		if(userDecision.equalsIgnoreCase("n")){
			break;
		}
		}while(userDecision.equalsIgnoreCase("y"));
		

		System.out.println("Thanks for your order!");
		System.out.println("Here's what you got:");
		
		// loop below gets the items ordered and their corresponding prices
		for( int i = 0 ; i < itemsOrdered.size() && i < itemPrices.size() ; i++  ){
			System.out.println(String.format("%-15s %s", itemsOrdered.get(i), itemPrices.get(i)));
		}
		
		averagePrice(itemPrices); // calling method to find out average price of each item 
		System.out.println();
		
		highestIndex(itemPrices); // calling method to find out highest index price item		
		System.out.println();
		
		lowestIndex(itemPrices);  // calling method to find out lowest index price item
		System.out.println();		
		
		mostExpensiveItem(itemsOrdered); // calling method to fond out most expensive method ordered
		
		scnr.close();
		
	}
		
	public static void averagePrice(ArrayList<Double> itemPrices){    // method to find out total price of all items
		double totalPrices = 0.0;
		
		for (int i = 0;  i < itemPrices.size(); i++){
			
			totalPrices += itemPrices.get(i); // storing the total in variable totalPrices
		}
		System.out.println("Total price for all items: $" + totalPrices); //  added an additional line for total price of all items
		System.out.println("Average price per item in order was $" + totalPrices/itemPrices.size());
		
	}
	
    public static double highestIndex(ArrayList<Double> itemPrices){
    	double max=itemPrices.get(0); // to find out the index of the highest cost item
		
		for (double x : itemPrices)
			if (x>max)
				max=x;
		System.out.println("Index of the highest cost item : " + itemPrices.indexOf(max));
		return max;
		
	}
	
	public static double lowestIndex(ArrayList<Double> itemPrices){
		double min=itemPrices.get(0); // to find out the index of the lowest cost item
		
		for (double y : itemPrices)
			if (y<min)
				min=y;
		System.out.println("Index of the lowest cost item : " + itemPrices.indexOf(min));
		return min;
	}
	
	public static void mostExpensiveItem(ArrayList<String> itemsOrdered){ // method to find out the most expensive item
		int maxIndex = itemsOrdered.indexOf(Collections.max(itemsOrdered));
		System.out.println("Most expensive item ordered: " + itemsOrdered.get(maxIndex));
		
	}
	
}
	
	

		
		
		
		
	
		
		
		
		
		
		
		
		
		
	
	
	
	
	
		
		
	    
		
	
		


