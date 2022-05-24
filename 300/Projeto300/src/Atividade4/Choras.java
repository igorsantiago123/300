package Atividade4;

public class Choras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Segundos = 46521, H, M, S;
		
		H= Segundos / 3600;
		M = (Segundos % 3600)/60;
		S = (Segundos % 3600)%60;
		
		System.out.println( H + " Horas, " + M + " Minutos " + " e " + S + " Segundos");
	}

}
