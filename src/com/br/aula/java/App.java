package com.br.aula.java;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double renda = 0;
		int idade = 0;
		double valorPedido = 0;
		double totalPagar = 0;
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("informe sua idade:");
		idade = s.nextInt();
		
		
		
		if(idade >= 25 && idade <= 60) {
			
			System.out.println("informe sua renda mensal:");
			renda = s.nextDouble();
			
			if(renda >= 1500) {
				
				System.out.println("informe o valor desejado:");
				valorPedido = s.nextDouble();
				
				if(valorPedido >= 1000 && valorPedido <= (renda * 10) ) {
					
					System.out.println("Imprestimo de R$" + valorPedido + " aprovado");
					
					totalPagar = valorPedido + (((valorPedido * 3 )/ 100)*12);
					
					System.out.println("Valor a ser pago R$" + totalPagar);
					
				}else {
					System.out.println("valor pedido deve ser maior que 1000 e menor que 10 vezes sua renda");
				}
				
			}else {
				System.out.println("renda não atinge o minimo permitido");
			}
			
		}else {
			System.out.println("sua idade não permite fazer emprestimo");
		}
		
		
	}

}
