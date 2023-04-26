package exerPOO;

import java.text.NumberFormat;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cargo;
	private String nivel;
	private String codFunc;
	
	public Funcionario(String nome, double salario, String cargo, String nivel, String codFunc) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.nivel = nivel;
		this.codFunc = codFunc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCodFunc() {
		return codFunc;
	}

	public void setCodFunc(String codFunc) {
		this.codFunc = codFunc;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void visualizar() {
		System.out.println("\nFuncionário: \t\t"+nome+"\nSalário: \t\t"+this.formatarMoeda()+
				"\nCargo: \t\t"+cargo+"\nNível: \t\t"+nivel+"\nCódigo do Funcionário: \t\t"+codFunc);
	}
	
	
}
