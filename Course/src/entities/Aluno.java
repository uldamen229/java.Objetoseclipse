package entities;

public class Aluno {

	
	public String name, statusAprovação = "";
	public Double N1, N2, N3, missingPoints; 
	
	
	public double total() {
		return N1 + N2 + N3;
	}
	
	public String toString() {
		return 
				"Nome do Aluno: " + this.name +  "\n" +
	            "Nota total: " + this.total() + "\n" +
				"Status de aprovação: " + this.statusAprovação + "\n"  + 
	            "Pontos faltando: " +  this.missingPoints;
	}
	
}
