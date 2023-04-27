package exerPOO;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Ana", 3500, "Desenvolvedor Java", "Júnior", "05672");
		
		func1.visualizar();
		
		Funcionario func2 = new Funcionario("Rosa", 5000, "Desenvolvedor Java", "Pleno", "005673");
		
		func2.visualizar();
		
		Gerente gen1 = new Gerente("Ana", 3500, "Desenvolvedor Java", "Júnior", "05672", 4532.22);
		
		gen1.visualizar();
		
		Gerente gen2 = new Gerente("Ana", 3500, "Desenvolvedor Java", "Júnior", "05672", 3242.67);
		
		gen2.visualizar();
		
		Vendedor ven1 = new Vendedor("Ana", 3500, "Desenvolvedor Java", "Júnior", "05672", 1000.00);
		
		ven1.visualizar();
		
		Vendedor ven2 = new Vendedor("Ana", 3500, "Desenvolvedor Java", "Júnior", "05672", 873.79);
		
		ven2.visualizar();

	}

}
