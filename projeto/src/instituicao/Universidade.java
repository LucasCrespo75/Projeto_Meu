package instituicao;

import java.util.Scanner;

public class Universidade {
	private String nomeUniversidade;
	//private ArrayList<Pessoa> listaPessoa;

	public String getNomeUniversidade() {
		
				return nomeUniversidade;
	}

	public void setNomeUniversidade(String nome) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da universidade em que trabalhou: ");
		nomeUniversidade = sc.next();

		this.nomeUniversidade = nome;
	}


}
