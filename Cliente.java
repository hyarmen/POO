package exerPOO;

import java.text.NumberFormat;

public class Cliente {
	
	private String nome;
	private String codCliente;
	private String endereco;
	private int numeroDaConta;
	private double saldo;
	
	public Cliente(String nome, String codCLiente, String endereco, int numeroDaConta, double saldo) {
		super();
		this.nome = nome;
		this.codCliente = codCLiente;
		this.endereco = endereco;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodCLiente() {
		return codCliente;
	}

	public void setCodCLiente(String codCLiente) {
		this.codCliente = codCLiente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(saldo);
		return formatoMoeda;
	}
	
	public void visualizar() {
		System.out.println("\nCliente: \t\t"+nome+"\nCódigo: \t\t"+codCliente+"\nEndereço: \t\t"+endereco
				+"\nNúmero da conta: \t\t"+numeroDaConta+"\nSaldo: \t\t"+this.formatarMoeda());
	}
	
}
