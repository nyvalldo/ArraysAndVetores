/*18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length;i++) {
			System.out.print("Entre com a idade das pessaos " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] < menor) {
				menor = vetorA[i];
			}else if(vetorA[i] > maior) {
				maior = vetorA[i];
			}
		}
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("A menor idade = " + menor);
		System.out.println("A maior idade = " + maior);
		
		scan.close();

	}

}
