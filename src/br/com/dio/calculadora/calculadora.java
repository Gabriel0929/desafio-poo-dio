package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a,b;
		
		System.out.println("pon 1er num");
		a = scan.nextInt();
		System.out.println("pon 2er num");
		b = scan.nextInt();
		
		int soma = soma (a,b);
		int subtracao = subtracao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
	}
	public static int soma(int a, int b) {
		return a+b;
	}

    public static int subtracao(int a, int b) {
    	return a-b;
    }
}
