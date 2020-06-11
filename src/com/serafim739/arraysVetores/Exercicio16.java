/*16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: 
a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
c) a média dos elementos armazenados no vetor que são superiores a 15.*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0;i < vetorA.length;i++) {
			System.out.print("Elementos do Vetor A " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		int menor = 0;
		int igual15 = 0;
		double maior = 0;
		double maior15 = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] < 15) {
				menor += vetorA[i];
			}else if(vetorA[i] == 15) {
				igual15++;
			}else {
				maior++;
				maior15 += vetorA[i];
			}
		}
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("A soma dos elementos < 15 = " + menor);
		System.out.println("Quantidade de elementos == 15 " + igual15);
		System.out.println("A média dos elementos > 15 = " + (maior15 / maior));
		
		scan.close();

	}

}
