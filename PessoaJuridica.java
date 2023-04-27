package exerPOO;

public class PessoaJuridica extends Cliente{
	private String cnpj;

	public PessoaJuridica(String nome, String codCLiente, String endereco, int numeroDaConta, double saldo,
			String cnpj) {
		super(nome, codCLiente, endereco, numeroDaConta, saldo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("\nCliente: \t\t"+getNome()+"\nCódigo: \t\t"+getCodCliente()+"\nEndereço: \t\t"+getEndereco()
				+"\nNúmero da conta: \t\t"+getNumeroDaConta()+"\nSaldo: \t\t"+this.formatarMoeda()+"\nCNPJ: \t\t"
				+cnpj);
	}

}
