package instituicao;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa extends Universidade {
	
	private String nomePessoa;
	private ArrayList<Universidade> listaUniversidade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nomePessoa) {
		super();
		this.nomePessoa = nomePessoa;
	}
	
	
	
	public void nomeUni() {
		Universidade univer = new Universidade();
		univer.setNomeUniversidade(univer.getNomeUniversidade());
	}
	
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		Universidade uni = new Universidade();
		Scanner scPessoa = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nomePessoa = scPessoa.next();
		this.nomePessoa = nomePessoa;
	}

	public ArrayList<Universidade> getListaUniversidade() {
		return listaUniversidade;
	}

	public void setListaUniversidade(ArrayList<Universidade> listaUniversidade) {
		this.listaUniversidade = listaUniversidade;
	}
	
	
	

}
