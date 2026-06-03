import java.util.Scanner;
import java.util.Arrays;

public class CheckoutSystem{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String[] products = new String[100];
	int[] quantities = new int[100];
	double[] prices = new double[100];
	double[] totals = new double[100];
	int count = 0;
		
	System.out.println("What is the customer's name?"); 	
	String customerName = input.nextLine();

	String addMore = "yes";

	while(addMore.equalsIgnoreCase("yes")){
		System.out.println("What did the user buy?");
		products[count] = input.nextLine();
		
		System.out.println("How many pieces?");
		quantities[count] = input.nextInt();

		System.out.println("How much per unit?");
		prices[count] = input.nextDouble();
		input.nextLine();

		totals[count] = quantities[count] * prices[count];
		
		System.out.println("Add more?");

		addMore = input.nextLine();

		count++;
		
}

	System.out.println("What is your name?");
	String cashierName = input.nextLine();

	System.out.println("How much discount will he get?");
	double discount = input.nextDouble();
	while(discount < 0){
    		System.out.println("Discount can't be negative");
    		discount = input.nextDouble();
}
		
	input.nextLine();


	System.out.println("============================================");
	System.out.println("\n             SEMI-COLON STORES              ");
	System.out.println("\n============================================");
	System.out.println("\n\nMAIN BRANCH");
	System.out.println("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("\nTEL: 03293828343");
	System.out.println("Date: 18-Dec-22 8:48:11 pm");
	System.out.println("Cashier: " + " " + cashierName);
	System.out.println("Customer name: " + " " + customerName);
	System.out.println("==============================================================");
	System.out.println("ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)");
	System.out.println("--------------------------------------------------------------");


	for(int index = 0; index < count; index++){

		System.out.printf("%-15s %-8d %-12.2f %-12.2f%n",
    			products[index],
    			quantities[index],
    			prices[index],
    			totals[index]);
}

	System.out.println("\n--------------------------------------------------------------");

	double subTotal = 0;

	for(int totalCount = 0; totalCount < count; totalCount++){
		subTotal+= totals[totalCount];
}

	double vat = ((17.5/100) * subTotal);
	double finalDiscount = (discount/100) * subTotal;

	System.out.printf("%21s %12.2f%n", "Sub Total:", subTotal);
	System.out.printf("%20s %12.2f%n", "Discount:", discount);
	System.out.printf("%18s %12.2f%n", "VAT @ 17.50%:", vat);	

	double billTotal = (subTotal - finalDiscount) + vat;
	
	System.out.println("\n==============================================================");
	System.out.printf("%20s %12.2f%n", "Bill Total:", billTotal);
	System.out.println("\n==============================================================");
	System.out.println("\nHow much did the customer give to you?");
	double amountPaid = input.nextDouble();
	input.nextLine();
	

	

	System.out.println("============================================");
	System.out.println("\n             SEMI-COLON STORES              ");
	System.out.println("\n============================================");
	System.out.println("\n\nMAIN BRANCH");
	System.out.println("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("\nTEL: 03293828343");
	System.out.println("Date: 18-Dec-22 8:48:11 pm");
	System.out.println("Cashier: " + " " + cashierName);
	System.out.println("Customer name: " + " " + customerName);
	System.out.println("==============================================================");
	System.out.println("ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)");
	System.out.println("--------------------------------------------------------------");


	for(int index = 0; index < count; index++){

		System.out.printf("%-15s %-8d %-12.2f %-12.2f%n", products[index], quantities[index],prices[index], totals[index]);
}

	System.out.println("\n--------------------------------------------------------------");

	System.out.printf("%21s %12.2f%n", "Sub Total:", subTotal);
	System.out.printf("%20s %12.2f%n", "Discount:", discount);
	System.out.printf("%18s %12.2f%n", "VAT @ 17.50%:", vat);	

	
	System.out.println("\n==============================================================");
	System.out.printf("%20s %12.2f%n", "Bill Total:", billTotal);
	System.out.printf("%20s %12.2f%n", "Amount Paid:", amountPaid);
	double balance = amountPaid - billTotal;
	System.out.printf("%20s %12.2f%n", "Balance:", balance);
	System.out.println("\n==============================================================");
	System.out.println("                  Thank you for your patronage                 ");
	System.out.println("\n==============================================================");




	
	



}
}