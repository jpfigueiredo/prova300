package exercicio;

public class empresa {

	String nome_empresa;
	String cnpj;
	int qte_de_funcionario=0;
	
	
	
	private funcionario[] funcionarios;
	
	public empresa(String nome_empresa, String cnpj, int qte_de_funcionario) {
		super();
		this.nome_empresa = nome_empresa;
		this.cnpj = cnpj;
		this.qte_de_funcionario = qte_de_funcionario;
		funcionarios = new funcionario[qte_de_funcionario];
	}
	
	public empresa (String nome, String cnpj) {
		
		this.qte_de_funcionario=100;
		funcionarios = new funcionario[100];
		this.nome_empresa = nome_empresa;
		this.cnpj = cnpj;
		
	}

	
	
	
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getQte_de_funcionario() {
		return qte_de_funcionario;
	}
	public void setQte_de_funcionario(int qte_de_funcionario) {
		this.qte_de_funcionario = qte_de_funcionario;
	}
	
	
		

	

	
}
