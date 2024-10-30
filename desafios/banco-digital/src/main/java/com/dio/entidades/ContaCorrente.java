package com.dio.entidades;


public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente,double depositoInicial) {
		super(cliente, TipoConta.CONTA_CORRENTE,depositoInicial);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
