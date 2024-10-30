package com.dio;

import com.dio.entidades.Agencia;
import com.dio.entidades.Banco;
import com.dio.entidades.Cliente;
import com.dio.entidades.IConta;

public class Main {

	public static void main(String[] args) {

		Banco banco =  new Banco("Aqui você treme");
		Agencia minhaAgencia = banco.createAgencia(44578);

		IConta contaCorrente =minhaAgencia.createContaCorrente(new Cliente("Venilton", "56897413"),50);
		IConta contaPoupanca = minhaAgencia.createContaPoupanca(new Cliente("Venilton", "56897413"),20);

		/**Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);*/

		contaCorrente.depositar(10);

		try{
		contaCorrente.transferir(100, contaPoupanca);
		}catch(Exception e){

			System.err.println("Saldo Insuficiente!");
			return;
		}

		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
