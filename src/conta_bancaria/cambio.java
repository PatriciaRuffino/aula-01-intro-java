package conta_bancaria;

import java.util.Scanner;

public class cambio {
	
	public static void main(String[] args) {
		final double CAMBIO_ATUAL = 4.99;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual é o valor em dolar?");
		
		double valorEmDolar = s.nextDouble();
		double valorEmReal = valorEmDolar * CAMBIO_ATUAL;
		
		System.out.println("O Valor em real: " + valorEmReal);
		
		
	}

}
