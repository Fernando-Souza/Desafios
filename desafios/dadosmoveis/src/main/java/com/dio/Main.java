package com.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
        List<Integer> consumo = new ArrayList<>();

        for (String s : consumoSemanal) {
            consumo.add(Integer.parseInt(s));
        }
        total = consumo.stream().reduce(Integer::sum).get();

        return total;
    }

    // Função para calcular a média semanal de consumo de dados móveis
       public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return totalConsumo/numeroDeSemanas; // Calcule a média semanal de consumo de dados móveis
    }

    // Função para identificar a semana de maior consumo
    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;

        // Função para identificar a semana de maior consumo
        for (int i = 0; i < consumoSemanal.length; i++) {
            int consumo = Integer.parseInt(consumoSemanal[i].trim());
            if(consumo>maiorConsumo){
                maiorConsumo=consumo;
                semanaDeMaiorConsumo=i+1;
            }
        }
        return semanaDeMaiorConsumo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");

        // Calculando o consumo total de dados móveis no mês
        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        // Calculando a média semanal de consumo de dados móveis
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identificando a semana de maior consumo
        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);

        scanner.close();
    }
}