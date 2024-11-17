package com.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }

    public static String verificarQuedaConexao(String[] velocidades) {

        List<Integer> valores=  new ArrayList<>();

        for(String val: velocidades){

            valores.add(Integer.parseInt(val));
        }
        
         for(int val:valores){

            if(val==0){

                return "Queda de Conexao";

            }
         }

         return "Sem Quedas";
    }
}