package com.dio.entidades;

import java.util.InputMismatchException;

public abstract class Conta implements IConta {
	
	//private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected Agencia agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	private TipoConta tipoConta;

	public Conta(Cliente cliente, TipoConta tipoConta) {		
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
	}

	@Override
	public void sacar(double valor) {

		if(saldo > valor){
		saldo -= valor;
		}
		else{
			throw new InputMismatchException( "Saldo Insuficiente!");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
