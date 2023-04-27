package exerPOO;

public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nome, String codCLiente, String endereco, int numeroDaConta, double saldo, String cpf) {
		super(nome, codCLiente, endereco, numeroDaConta, saldo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("\nCliente: \t\t"+getNome()+"\nCódigo: \t\t"+getCodCliente()+"\nEndereço: \t\t"+getEndereco()
				+"\nNúmero da conta: \t\t"+getNumeroDaConta()+"\nSaldo: \t\t"+this.formatarMoeda()+"\nCPF: \t\t"
				+cpf);
	}
}
