package funcionario;

import java.io.Serializable;

public class Funcionario implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private String nome;
    private int idade;
    private transient String cpf;
    private double salario;
    private String pis;
    
    
    
    public Funcionario(String nome, int idade, double salario, String pis) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.pis = pis;
	}
    
    
    



	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public int getIdade() {
		return idade;
	}






	public void setIdade(int idade) {
		this.idade = idade;
	}





	public double getSalario() {
		return salario;
	}






	public void setSalario(double salario) {
		this.salario = salario;
	}






	public String getPis() {
		return pis;
	}






	public void setPis(String pis) {
		this.pis = pis;
	}






	public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade  + ", salario = " + salario + ", PIS = "  + pis + "]";
    }
}