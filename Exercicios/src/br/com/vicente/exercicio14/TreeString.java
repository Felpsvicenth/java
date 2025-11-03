package br.com.vicente.exercicio14;

import java.util.TreeSet;

public class TreeString {

	public static void main(String[] args) {
		
		TreeSet<String> nomes = new TreeSet<>();
		
		nomes.add("Filipe");
		nomes.add("Leticia");
		nomes.add("Pedro");
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Joao");
		
		System.out.println("Lista completa:");
		System.out.println(nomes);
		System.out.println();
		
		
		System.out.println("Imprimir o primeiro nome: " + nomes.first());
		System.out.println();
		
		System.out.println("Imprimir o último nome: " + nomes.last());
		System.out.println();
		
		System.out.println("O próximo depois de Maria: " + nomes.higher("Maria"));
		System.out.println();
		
		System.out.println("O anterior de Joao: " + nomes.lower("Joao"));
		System.out.println();
		
		
		
		

	}

}
