package program;

import java.util.Scanner;

import entities.funcionario;

public class Programa {

	public static void main(String[] args) {
		funcionario funcionario = new funcionario();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("digite o salario bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Digite o valor do imposto: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Empregado" + funcionario);
		
		System.out.println("Digite o aumento: ");
double percentage = sc.nextDouble();
funcionario.increaseSalary(percentage);
System.out.println();

System.out.println("Salario atualizado: " + funcionario);
		
		sc.close();
	}

}
