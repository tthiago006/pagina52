package exercicios_pagina36while;

import java.util.Scanner;

public class exercicio1_pagina36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		double salario;
		
		System.out.println (" escreva o valor do seu salario: ");
		salario = leitura.nextDouble();
		if (salario>954.00) {
			System.out.println (" valor acima do sal�rio m�nimo! ");
		}else {
			System.out.println (" valor abaixo do sal�rio m�nimo!");
		}
		
		leitura.close();

	}

}
