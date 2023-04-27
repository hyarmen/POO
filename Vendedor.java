package exerPOO;

public class Vendedor extends Funcionario {
	
	private double comissao;

	public Vendedor(String nome, double salario, String cargo, String nivel, String codFunc, double comissao) {
		super(nome, salario, cargo, nivel, codFunc);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void visualizar() {
		System.out.println("\nFuncionário: \t\t"+getNome()+"\nSalário: \t\t"+this.formatarMoeda()+
				"\nCargo: \t\t"+getCargo()+"\nNível: \t\t"+getNivel()+"\nCódigo do Funcionário: \t\t"+getCodFunc()
				+"\nValor da comissao de vendas: \t\t"+comissao);
	}

}
