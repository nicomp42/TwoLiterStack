/*
 * Professor Bill Nicholsons code, Edited by Joshua Ciulla.
 * ciullaja@mail.uc.edu	
 * Assignment #: 10
 * IT 2045C Spring Semester
 * This is Professor Bill Nicholsons code, I am just editing the code. I will be fixing the Dr. Pepper problem.
 */

package src.main;

import java.util.Random;
import java.util.Stack;

/**
 * Model a 2-liter of soda in a grocery store
 * @author nicomp
 *
 */
public class TwoLiter {
	private static String[] flavors = {"Coke Classic", "Diet Coke",      "Coke Zero",      "Dr. Pepper",       "Cherry Coke",     "Caffeine Free Coke", "New Coke"};
	private static String[] UPCs =    {"049000050103", "00049000050110", "00049000050141", "00078000082463", " 00049000050165", "00049000006131",     "0"};
	// I switched the New Coke that did not have any value to the the back because Dr. Pepper was cut out. So I changed the position of new coke with Dr.Pepper for it to work.
	private String UPC;
	private String flavor;
	private double price;
	/**
	 * Constructor
	 * @param UPC  The Universal Product Code that uniquely identifies this type of product
	 * @param flavor The flavor of the soda in the 2-liter
	 * @param price The selling price of the 2-liter
	 */
	public TwoLiter(String UPC, String flavor, double price) {
		setUPC(UPC);
		setFlavor(flavor);
		setPrice(price);
	}
	/**
	 * Copy Constructor
	 * @param twoLiter  The object to be copied
	 */
	public TwoLiter(TwoLiter twoLiter) {
		setUPC(twoLiter.getUPC());
		setFlavor(twoLiter.getFlavor());
		setPrice(twoLiter.getPrice());
	}
	/**
	 * Add TwoLiter objects to a Stack
	 * @param twoLiterStack The Stack
	 * @param count The number of TwoLiter objects to add
	 */
	public static void add(Stack<TwoLiter> twoLiterStack, int count ) {
		Random r = new Random(42);
		Random r1 = new Random();
		for (int i = 0; i < count; i++) {
			twoLiterStack.add(new TwoLiter(UPCs[r1.nextInt(UPCs.length - 1)], 
					                       flavors[r1.nextInt(flavors.length - 1)], 
					                       1.00 + r1.nextFloat()));
		
		}
	}
	/**
	 * Get the UPC (Universal Product Code) for the object
	 * @return The UPC
	 */
 	public String getUPC() {
		return UPC;
	}
 	/***
 	 * Define the UPC for the object
 	 * @param UPC The new UPC
 	 */
	public void setUPC(String UPC) {
		this.UPC = UPC;
	}
	/***
	 * Get the Flavor of the pop in the 2-liter
	 * @return The Flavor
	 */
	public String getFlavor() {
		return flavor;
	}
	/***
	 * Define the flavor of the pop in the 2-liter
	 * @param flavor The new flavor
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	/***
	 * Get the price of the 2-liter
	 * @return The current price of the 2-liter
	 */
	public double getPrice() {
		return price;
	}
	/***
	 * Define the price of the 2-liter
	 * @param price The new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Create a string representation of the object
	 * @return the string representation of the object
	 */
	public String toString() {
		return UPC + ", " + flavor + ", " + price;
	}
}

// I edited the code and I switched "New Coke" with no value to Dr.Pepper that has value and now I get output for Dr.Pepper to be added to the stack. I also added a parameter to the class as well to ensure that Dr.Pepper is added to the stack.
