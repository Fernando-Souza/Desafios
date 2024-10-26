package com.dio.entidades;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private int numero;
    private String endereco;
    private String telefone;
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Agencia (int numero){

        this.numero=numero;
        this.contas= new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Cliente> getClientes() {

        return this.clientes;
        
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }


    public void createContaCorrente(Cliente cliente){

        contas.add(new ContaCorrente(cliente));
        addCliente(cliente);
    }

    public void createContaPoupanca(Cliente cliente){

        contas.add(new ContaPoupanca(cliente));
        addCliente(cliente);
    }





        
}
