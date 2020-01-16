package entities;

public class Pessoa {
	private String nome;
	private String codigo;
	private String idade;
	private String endereco;
	
	
	
	public void Pessoa() {
		
	}
	public String toSave() {
		return codigo +","+nome+","+endereco+","+idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
