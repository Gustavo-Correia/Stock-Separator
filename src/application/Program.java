package application;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		char repetition;
		System.out.print("Enter Product Data");
		System.out.println("\nName of Product: ");
		product.productName = sc.nextLine();
		System.out.println("Price of Product: ");
		product.productPrice = sc.nextDouble();
		System.out.println("Quantity of Product: ");
		product.productQuantity = sc.nextInt();
        
		do {
		System.out.println("Product Data:"+ product);

		System.out.println("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("\nUpdate data: " + product);
		
		System.out.println("\nEnter the number of products to be removed from stock: ");
		int quantity2 = sc.nextInt();
		product.removeProducts(quantity2);
		
		System.out.println("\nUpdate data: " + product);
		
		
		System.out.println("\nWould you like to update the stock again? yes or no");
		repetition = sc.next().charAt(0);
		
		}
		while (repetition == 'y'); {
			
			System.out.println("\nEnding Program..... ");
			
		}
		sc.close();
	}
	

}
