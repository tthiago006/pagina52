package exercicios_pagina36while;

import java.util.Scanner;

public class exercicio2_pagina36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
	    double numero;
	   
	    System.out.println (" escreva o valor de um n�mero: ");
	    numero = leitura.nextDouble();
	    if (numero==0) {
	    	System.out.println ( "n�mero neutro! ");
	    }else if (numero>0) {
	    	System.out.println (" n�mero positivo! ");
	    }else {
	    	System.out.println (" n�mero negativo! ");
	    }
	    
	    leitura.close();

	}

}
