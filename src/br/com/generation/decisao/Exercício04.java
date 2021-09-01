package br.com.generation.decisao;

import java.util.Scanner;

public class Exerc�cio04 {
//Exercicio 04 Author: Abner Werley Date:01/09/2021

	/*
	 * 4- "Fa�a um programa que permita a entrada de um n�mero qualquer e exiba se
	 * este n�mero � par ou impar. Se for par, exiba tamb�m a ra�z quadrada do
	 * mesmo; Se for �mpar, exiba o n�mero elevado ao quadrado. "
	 */
	
	public static void main(String[] args) {

		String tipo;
		Scanner leia = new Scanner(System.in);
		double numero, raiz, potencia;

		System.out.println("Insira um n�mero:");
		numero = leia.nextDouble();

		if (numero % 2 == 0) {
			tipo = "par";
			
			raiz = Math.sqrt(numero);

			System.out.println(numero + " � " + tipo + " e sua ra�z � :" + raiz);
		
		} else if (numero % 2 == 1) {
			tipo = "�mpar";
		
			potencia = Math.pow(numero, 2);
			
			System.out.println(numero + " � " + tipo + " e elevado ao quadrado �: " + potencia);
		}

		leia.close();
	}
}
