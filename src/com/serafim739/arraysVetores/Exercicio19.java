/*19. Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.786.471.691-15*/

package com.serafim739.arraysVetores;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] result = new double[nota1.length];
		String[] alunos = new String[] {"Ana", "Paulo", "Hugo", "Hellen", "Nivaldo", "Davi", "Viviane", "Demir", "Lu", "Gessica"};
		
		for(int i = 0; i < nota1.length;i++) {
			
			System.out.print("Primeira Nota = " + (i + 1) + ": ");
			nota1[i] = scan.nextDouble();
			
			System.out.print("Segunda Nota = " + (i + 1) + ": ");
			nota2[i] = scan.nextDouble();
			
			result[i] = (nota1[i] + nota2[i]) / 2;
		}
		System.out.print("Nota 1 = ");
		for(int i = 0; i < nota1.length;i++) {
			System.out.println(nota1[i] + " ");
		}
		System.out.println();
		
		System.out.print("Nota 2 = ");
		for(int i = 0; i < nota2.length;i++) {
			System.out.println(nota2[i] + " ");
		}
		System.out.println();
		
		System.out.println("Resultado:");
		for(int i = 0; i < result.length;i++) {
			
			if(result[i] >= 7) {
				System.out.println("O aluno, " + alunos[i] + " Tiro a nota = " + result[i] + " - APROVADO!");
			}else {
				System.out.println("O aluno, " + alunos[i] + " Tiro a nota = " + result[i] + " - REPROVADO!");
			}
		}
		
		
		
		
		scan.close();
	}

}
