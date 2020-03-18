package Programa;

import java.util.Scanner;

import entities.retangulo;


public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		retangulo retangulo = new retangulo();
		
		System.out.println("Enter rectangle widht and height");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		System.out.println("updated data: " + retangulo);
		
		
		sc.close();
	}

}
