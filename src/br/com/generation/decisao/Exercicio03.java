package br.com.generation.decisao;

import java.util.Scanner;

public class Exercicio03 {
//Exercicio 03 Author: Abner Werley Date:01/09/2021
	
	/*  
	 * 3- "Fa�a um programa que
	 * receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se
	 * encontra:
	 * 10-14 Infantil
	 * 15-17 junevil
	 * 18-25 adulto"
	 */
	public static void main(String[] args) {

		int idade;
		Scanner leia = new Scanner(System.in);
		String categoria = "Categoria inv�lida.";
		
		System.out.println("Insira sua idade:");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			categoria = "Infantil";
			System.out.println("A sua categoria � a: " + categoria);
			
		} else if(idade>=15 && idade<=17) {
			categoria = "Juvenil";
			System.out.println("A sua categoria � a: " + categoria);
		
		}else if(idade>=18 && idade<=25) {
			categoria = "Adulta";
			System.out.println("A sua categoria � a: " + categoria);
			
		} else {
			System.out.println(categoria);
		}
		
		leia.close();
	}
}
