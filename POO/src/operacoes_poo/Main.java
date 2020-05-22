package operacoes_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		Operações Op =  new Operações();
		
		System.out.println("Digite os valores");
		
		System.out.println("1º Valor (Inteiro): ");
		int num1 = scanf.nextInt();
	
		System.out.println("2º Valor (Float): ");
		float num2 = scanf.nextFloat(); 
			
		System.out.println("\nOperações\n");
            
		Op.setNum1(num1);
		Op.setNum2(num2);
		Op.Somar();
		Op.Subtração();
		Op.Divisão();
		Op.Multiplicação();
		Op.Fatorial();
			
	}

}
