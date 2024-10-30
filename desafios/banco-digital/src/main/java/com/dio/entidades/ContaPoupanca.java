package com.dio.entidades;


public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente,double depositoInicial) {
		super(cliente,TipoConta.CONTA_POUPANCA,depositoInicial);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
