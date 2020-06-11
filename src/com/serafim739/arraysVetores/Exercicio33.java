/*33. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int[] vetorA = new int[5];
		 
		 for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Elementos do Vetor A " + i + ": ");
			vetorA[i] = sc.nextInt();
		}
		 
		 boolean primo;
		 String msg;
		 
		 for (int i = 0; i < vetorA.length; i++) {
			 
			 primo = true;
			 for (int j = 2; j < vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					primo = false;
					break;				
				}
			}
			 msg = "";
			 if(primo) {
				 msg = " Primo";
			}else {
				msg = " Não é primo";
			}
			 System.out.println(vetorA[i] + msg);
		 }
		
		sc.close();
	}

}
