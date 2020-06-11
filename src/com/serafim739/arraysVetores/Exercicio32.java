/*32. Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Elementos vetor A " + i + ": ");
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Tabuada de ");
			
			for (int j = 1; j <= vetorA.length; j++) {
				System.out.println(j + " * " + vetorA[i] + " = " + (j * vetorA[i]));
			}
		}
		System.out.println();
		
		sc.close();

	}

}
