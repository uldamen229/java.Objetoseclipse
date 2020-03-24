package apliccation;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
	Aluno Aluno = new Aluno();
		Scanner sc = new Scanner (System.in);	
	
		System.out.println("Digite o nome do aluno");
		Aluno.name = sc.nextLine();
		
		System.out.println("Digite as notas dos 3 trimestres na ordem: ");
		
		 Aluno.N1 = sc.nextDouble();
         while(Aluno.N1 >30) {
	     System.out.println("Digite novamente");
	     Aluno.N1 = sc.nextDouble();
}

	
         Aluno.N2 = sc.nextDouble();
         while(Aluno.N2 >35) {
	     System.out.println("Digite novamente");
	     Aluno.N2 = sc.nextDouble();
}
	
         Aluno.N3 = sc.nextDouble();
         while(Aluno.N3 >35) {
	     System.out.println("Digite novamente");
	     Aluno.N3 = sc.nextDouble();
}
	
         if(Aluno.total() < 60) {
        	 Aluno.statusAprovação = "FAILED";
        	 Aluno.missingPoints = 60 - Aluno.total();
        	 System.out.println("fALTAM: " + Aluno.missingPoints);
         }else {
        	 Aluno.statusAprovação = "APROVED";
        	 Aluno.missingPoints = 0.0;
         }
         
         
         
        System.out.println(Aluno); 
		
		
	sc.close();
	}

}
