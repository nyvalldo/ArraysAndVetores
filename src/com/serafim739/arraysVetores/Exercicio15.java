/*15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0;i < vetorA.length;i++) {
			System.out.print("Elementos do Vetor A " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		double impar = 0;
		for(int i = 0;i < vetorA.length;i++) {
			if(vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		double par = vetorA.length - impar;
		double percPar = (par * 100) / vetorA.length;
		double percImpar = 100 - percPar;
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0;i < vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Porcentagem Impares = " + percImpar + "%");
		System.out.println("Porcentagem Pares " + percPar + "%");
		

		
		scan.close();
		
	}

}
