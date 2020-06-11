/*11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0;i < vetorA.length;i++) {
			System.out.println("Elementos do Vetor A " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		int par = 0;
		for(int i = 0;i < vetorA.length;i++) {
			if(vetorA[i] % 2 == 0) {
				par++;
			}
		}
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0;i < vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Qtd de numeros pares = " + par );
		
		scan.close();
	}

}
