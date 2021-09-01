package br.com.generation.decisao;

import java.util.Scanner;

public class Exercicio01 {

// Exercício 1 Autor: Abner Werley data: 01/09/2021

	// 1 - Faça um programa que receba três números inteiros e diga qual deles é
	// maior."

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3, numeroMaior;

		System.out.println("Digite 3 números e direi qual é o maior:");
		numero1 = leia.nextInt();
		numeroMaior = numero1;

		numero2 = leia.nextInt();

		if (numero2 > numeroMaior) {
			numeroMaior = numero2;
		}
		
		numero3 = leia.nextInt();
		
		if (numero3 > numeroMaior) {
			numeroMaior = numero3;
		}

		System.out.println("O maior número é o " + numeroMaior + ".");

		leia.close();
	}
}
