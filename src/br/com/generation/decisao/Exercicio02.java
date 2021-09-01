package br.com.generation.decisao;

import java.util.Scanner;

public class Exercicio02 {

// Exercício 1 Autor: Abner Werley data: 01/09/2021
	
	// 2- "Faça um programa que entre com três números e coloque em ordem crescente"

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double a, b, c, mostra1 = 0.0, mostra2 = 0.0, mostra3 = 0.0;

		System.out.println("Entre com 3 números que vou escrevê-los em ordem crescente");
		a = leia.nextDouble();

		b = leia.nextDouble();

		c = leia.nextDouble();

		/*
		 * existem 6 possibilidades: c sendo o maior de todos, seguido por b, e a a<b<c
		 * (maiores na direita)) c sendo o maior, mas seguido por a, e b b<a<c b sendo o
		 * maior, seguido por a e c c<a<b b sendo o maior, mas seguido por c e a a<c<b a
		 * sendo o maior, seguido por c e b b<c<a a sendo o maior, mas seguido por b e c
		 * c<b<a
		 * 
		 * pensando nisso...
		 */

		if (a < b && b < c) { // a<b<c
			mostra1 = a;
			mostra2 = b;
			mostra3 = c;
		}
		if (b < a && a < c) { // b<a<c
			mostra1 = b;
			mostra2 = a;
			mostra3 = c;
		}

		if (c < a && a < b) { // c<a<b
			mostra1 = c;
			mostra2 = a;
			mostra3 = b;
		}
		if (a < c && c < b) { // a<c<b
			mostra1 = a;
			mostra2 = c;
			mostra3 = b;
		}

		if (b < c && c < a) { // b<c<a
			mostra1 = b;
			mostra2 = c;
			mostra3 = a;
		}

		if (c < b && b < a) { // c<b<a
			mostra1 = c;
			mostra2 = b;
			mostra3 = a;
		}

		System.out.print(mostra1);
		System.out.print(", " + mostra2);
		System.out.print(", " + mostra3);

		leia.close();
	}
}
