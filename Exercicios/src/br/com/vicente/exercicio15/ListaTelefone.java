package br.com.vicente.exercicio15;

import java.util.HashMap;
import java.util.Map;

public class ListaTelefone {

	public static void main(String[] args) {
	Map<String, String> lista = new HashMap<>();
	
	lista.put("Filipe", "6498432-2030");
	lista.put("Leticia", "646523-5069");
	lista.put("Joao", "698756-9865");
	lista.put("Maria", "326547-9832");
	lista.put("Alan", "986324-8569");
	
	System.out.println(lista);
	System.out.println();
	
	System.out.println("Buscando por chave: " + lista.get("Filipe"));
	System.out.println();
	
	System.out.println("Verificando se existe contato: " + lista.containsKey("Rodrigo"));
	
	}

}
