package Atividade2;
 
import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner Ent = new Scanner(System.in)) {
			int Mess;
			String [] Mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
			
			System.out.println("Digite um numero entre 1 à 12: ");
			Mess=Ent.nextInt();
			System.out.println(Mes[Mess-1]);
		}
		

	}

}
