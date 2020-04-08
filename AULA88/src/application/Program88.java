package application;

import java.util.Scanner;

import entities.Product;

public class Program88 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i =0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		double avg = soma / vect.length;
		
		System.out.printf("media =: %.2f%n", avg);
		
		
		
		
		
		sc.close();
	}

}
