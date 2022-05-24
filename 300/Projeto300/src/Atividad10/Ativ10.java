package Atividad10;

import java.util.Scanner;

public class Ativ10 {

	public static void main(String[] args) {
		
		int i = 0 ;
		double nota;
		
		Scanner Ler = new Scanner(System.in);
		while(i<=5) {
		System.out.println("Informe a nota: ");
		nota=Ler.nextDouble();
		
		
			
			if(nota == 1) {
				 System.out.println("péssima"); 
			}
			else if(nota == 2) {
				 System.out.println("ruim"); 
			}
			else if(nota == 3) {
				 System.out.println("regular"); 
			}
			else if(nota == 4) {
				 System.out.println(" boa"); 
			}
			else if (nota == 5) {
				 System.out.println("ótima "); 
			}
			else{
				 System.out.println("nota inválida"); 
			}
			
		}
		
		

	}

}
