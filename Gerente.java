package exerPOO;

public class Gerente extends Funcionario {
	
	private double bonus;
	
	public Gerente(String nome, double salario, String cargo, String nivel, String codFunc, double bonus) {
		super(nome, salario, cargo, nivel, codFunc);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void visualizar() {
		System.out.println("\nFuncionário: \t\t"+getNome()+"\nSalário: \t\t"+this.formatarMoeda()+
				"\nCargo: \t\t"+getCargo()+"\nNível: \t\t"+getNivel()+"\nCódigo do Funcionário: \t\t"+getCodFunc()
				+"\nValor do bonus por resultados: \t\t"+bonus);
	}

}
