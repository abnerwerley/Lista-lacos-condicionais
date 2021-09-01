package br.com.generation.decisao;

import java.util.Scanner;

public class Exercício04 {
//Exercicio 04 Author: Abner Werley Date:01/09/2021

	/*
	 * 4- "Faça um programa que permita a entrada de um número qualquer e exiba se
	 * este número é par ou impar. Se for par, exiba também a raíz quadrada do
	 * mesmo; Se for ímpar, exiba o número elevado ao quadrado. "
	 */
	
	public static void main(String[] args) {

		String tipo;
		Scanner leia = new Scanner(System.in);
		double numero, raiz, potencia;

		System.out.println("Insira um número:");
		numero = leia.nextDouble();

		if (numero % 2 == 0) {
			tipo = "par";
			
			raiz = Math.sqrt(numero);

			System.out.println(numero + " é " + tipo + " e sua raíz é :" + raiz);
		
		} else if (numero % 2 == 1) {
			tipo = "ímpar";
		
			potencia = Math.pow(numero, 2);
			
			System.out.println(numero + " é " + tipo + " e elevado ao quadrado é: " + potencia);
		}

		leia.close();
	}
}
