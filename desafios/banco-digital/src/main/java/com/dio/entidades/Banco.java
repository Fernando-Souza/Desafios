package com.dio.entidades;

import java.util.HashMap;
import java.util.Map;

public class Banco {

	private String nome;
	private Map<Integer,Agencia> agencias;

	

	public Banco(String nome){
          
		this.agencias=new HashMap<>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<Integer,Agencia> listAgencias() {
		return agencias;
	}

	
	public Agencia createAgencia(int numero){

		Agencia agencia = new Agencia(numero);

		agencias.put(numero, agencia);

		return agencia;

	}

	public Agencia buscaAgencia (int numero){

		return agencias.get(numero);
	}

	

}
