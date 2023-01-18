package Relacoes;

public class Pessoas {

	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoas(String nome, int idade, String sexo) {
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
	}
	
	public void atual() {
		System.out.println(this.nome +" está com " +this.idade+ " anos");
	}
	
	public void fazerAniv() {
		this.idade = this.idade+1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
