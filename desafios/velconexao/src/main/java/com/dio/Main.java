package com.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada
        // hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int) velocidadeMedia + " Mbps");

        scanner.close();
    }

    /**
     * @param velocidades
     * @return
     */
    public static double calcularVelocidadeMedia(String[] velocidades) {
        
       

        List<Integer> valores=  new ArrayList<>();

        for(String val: velocidades){

            valores.add(Integer.parseInt(val));
        }

        return valores.stream().mapToInt(x->x).average().getAsDouble();

        
    }
}