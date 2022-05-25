package exercicio;

public class funcionario {

	String nome_funcionario;
	String departamento_funcionario;
	double salario; 
	String data_entrada;
	String rg;
	boolean ponto;
	
	
	
	
	public funcionario(String nome_funcionario, String departamento_funcionario, double salario, String data_entrada,
			String rg, boolean ponto) {
		super();
		this.nome_funcionario = nome_funcionario;
		this.departamento_funcionario = departamento_funcionario;
		this.salario = salario;
		this.data_entrada = data_entrada;
		this.rg = rg;
		this.ponto = ponto;
	}
	
	
	public funcionario () {
		
	}
	
	
	
	
	
	
	
	
	
	
	public String getNome_funcionario() {
		return nome_funcionario;
	}
	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}
	public String getDepartamento_funcionario() {
		return departamento_funcionario;
	}
	public void setDepartamento_funcionario(String departamento_funcionario) {
		this.departamento_funcionario = departamento_funcionario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isPonto() {
		return ponto;
	}
	public void setPonto(boolean ponto) {
		this.ponto = ponto;
	}
	
	
	
	
}
