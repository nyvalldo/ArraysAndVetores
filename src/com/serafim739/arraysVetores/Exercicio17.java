/*17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int pessoas = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Elementos vetor A " + i + ": " );
			vetorA[i] = scan.nextInt();			
		}
		
		System.out.println();
		
		for(int i = 0; i < vetorA.length;i++) {
			if(vetorA[i] >= 35) {
				pessoas++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0;i < vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de pessoas acima de 35 anos = " + pessoas);
		
		
		scan.close();

	}

}
