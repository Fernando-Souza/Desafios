package com.dio.entidades;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(double valor){

        super("Saldo Insuficiente para sacar o valor: " + valor);

    }

    
}
