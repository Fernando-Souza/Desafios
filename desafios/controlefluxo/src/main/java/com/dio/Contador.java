package com.dio;

import java.util.Scanner;

/**
 * Contador
 */
public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
        terminal.nextLine();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.nextLine();
        terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage()) ;//
		}
		
        
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if(parametroUm>parametroDois){

            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        }
		
		int contagem = parametroDois - parametroUm;

        for(int i=1;i<=contagem;i++){

            System.out.println("Imprimingo o número "+i);


        }
		

    
	}
}