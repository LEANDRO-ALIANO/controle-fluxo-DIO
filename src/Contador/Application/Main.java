package Contador.Application;

import java.util.Scanner;

import Contador.Exception.ExceptionContador;

public class Main {

	public static void main(String[] args) throws ExceptionContador {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o numero 1: ");
		int number1=sc.nextInt();
		System.out.println("Digite o numero 2: ");
		int number2=sc.nextInt();
		try {
		contar(number1, number2);
		}catch(ExceptionContador e) {
			System.out.println(e.getMessage());
		}
		
	
	}
	
	

		 static void contar(int number1, int number2) throws ExceptionContador{
				if(number2 < number1) {
					
					throw new ExceptionContador("O primeiro numero não pode ser maior que o segundo!!!");
				}else{
				
				int contagem = number2 - number1;
				
				for(int i= 0; i <= contagem; i++) {
					System.out.println("imprimindo o numero "+i);
					}
				}
				
		}

	}
	
