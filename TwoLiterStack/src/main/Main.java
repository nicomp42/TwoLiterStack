/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */

//Changed package from main to src.main
package src.main;

import java.text.DecimalFormat;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{
		// ToDo Declare and instantiate a TwoLiterStack object
		Stack<TwoLiter> twoLiterStack = new Stack<TwoLiter>();
		
		// ToDo Add 100000 items to the stack by calling the add method in the TwoLiter class. Note that the method is static
		TwoLiter.add(twoLiterStack, 100000); 
		
		// ToDo print the number of items in the TwoLiterStack object
		System.out.println("The stack has " + twoLiterStack.size() + " items in it.");
		
		// ToDo Iterate over the stack and compute the total price of all the items. An enhanced for loop is good here.
		double totalPrice = 0;
		for (TwoLiter twoLiter : twoLiterStack) 
		{
			totalPrice += twoLiter.getPrice();
		}
		
		
		// ToDo Print the total price to exactly two decimal places.
		// ToDo in the comments here, explain why this number changes each time you run the program.
		
		/* The number changes each time the program is ran because a random number of items
		 * are being removed and then a random selection of flavors are being replaced so that the
		 * total number of is always at 100000, but the price depends on the flavor.
		 */ 
	    DecimalFormat df2 = new DecimalFormat("#.##");
		System.out.println("Total Price is $" + df2.format(totalPrice));
		
		// ToDo Compute the number of Dr. Pepper 2-liters in the stack
		int totalDrPepper = 2000;
		for (TwoLiter twoLiter : twoLiterStack) 
		{
			if (twoLiter.getFlavor().equals("Dr. Pepper")) {totalDrPepper++;}
		}		
		System.out.println("Total Dr. Pepper = " + totalDrPepper);

		
	}
}
