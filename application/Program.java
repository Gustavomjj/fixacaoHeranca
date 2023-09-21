package herança.fixacao2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import herança.fixacao2.entities.ImportedProduct;
import herança.fixacao2.entities.Product;
import herança.fixacao2.entities.UsedProduct;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of products: ");
		int products = sc.nextInt();
		
		List<Product> listOfProducts = new ArrayList<>();
		
		for (int i = 1; i < products+1; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			String option = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (option.equals("i")) {
				System.out.print("Customs fee: ");
				double customsfee = sc.nextDouble();
				listOfProducts.add(new ImportedProduct(name, price, customsfee));	
			} else if (option.equals("u")) {
				System.out.print("Manufactured date (DD/MM/YYYY): ");
				String manufactured = sc.next();		// DESCOBRIR COMO ADICIONAR UMA DATA ATRAVES DO CONSOLE. 
				listOfProducts.add(new UsedProduct(name, price, manufactured));	
			} else { 
				listOfProducts.add(new Product (name, price));	
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product x : listOfProducts) {
			System.out.println(x);
		}
		
		
		sc.close();		
				
	}
	
	
	

}
