/*6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a soma dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] + B[i].*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[10];
		
		for(int i = 0; i < vetorA.length;i++) {
			System.out.println("Elementos vetorA " + i + ": ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0; i< vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i< vetorB.length;i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i< vetorC.length;i++) {
			System.out.print(vetorC[i] + " ");
		}	
		
		scan.close();
	}

}
