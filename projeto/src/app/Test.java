package app;

import java.util.Scanner;

import instituicao.Pessoa;

public class Test {
	public static void main(String args[] ) {
		
		Pessoa p = new Pessoa();
		p.nomeUni();
		p.setNomePessoa(p.getNomePessoa());
		
		System.out.println(p.getNomeUniversidade()+ p.getListaUniversidade());
	}
	

}
