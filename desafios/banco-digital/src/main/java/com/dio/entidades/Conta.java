package com.dio.entidades;

public abstract class Conta implements IConta {

	// private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected Agencia agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	private TipoConta tipoConta;

	public Conta(Cliente cliente, TipoConta tipoConta, double depositoInicial) {
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
		this.saldo = depositoInicial;
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {

		if (this.saldo >= valor) {
			this.saldo -= valor;

		} else {
			
			throw new SaldoInsuficienteException(valor);

		}

	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws SaldoInsuficienteException {
		
			this.sacar(valor);
			contaDestino.depositar(valor);
		
		
		
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
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
		System.out.println(String.format("Agencia: %d", this.agencia.getNumero()));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
