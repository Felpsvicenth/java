package br.com.vicente.exercicio12;

import java.util.HashSet;

public class Emails {

	HashSet<String> email = new HashSet<>();
	
	public void adicionarEmail(String endereco) {
		email.add(endereco);
		System.out.println("Email " + endereco + " cadastrado com sucesso");
	}
	
	
	public void verificarEmail(String nome) {
		for (String endereco : email) {
			if (endereco.contains(nome)) {
				System.out.println("Email já cadastrado!");
			}else {
				System.out.println("Email ainda não cadastrado");
			}
		}
	}
	
	
}
