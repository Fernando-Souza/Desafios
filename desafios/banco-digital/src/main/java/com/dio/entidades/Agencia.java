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
        this.clientes= new ArrayList<>();
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

    private void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }


    public IConta createContaCorrente(Cliente cliente,double depositoInicial){

        ContaCorrente cc = new ContaCorrente(cliente,depositoInicial);
        cc.setAgencia(this);
        contas.add(cc);
        addCliente(cliente);
        return cc;
    }

    public IConta createContaPoupanca(Cliente cliente,double depositoInicial){
        ContaPoupanca cp = new ContaPoupanca(cliente,depositoInicial);
        cp.setAgencia(this);
        contas.add(cp);
        addCliente(cliente);
        return cp;
    }





        
}
