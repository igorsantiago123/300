package Ativadade7;

public class Triangilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ladoA = 5, ladoB = 8 , ladoC = 8;
		
		if(ladoA + ladoB >= ladoC && ladoA + ladoC >= ladoB && ladoB + ladoC >= ladoA) {
			System.out.println("Triangulo");
		}
		else
			System.out.println(" Não e um Triangulo ");

	}

}
