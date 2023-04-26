package exerPOO;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Ana", 3500, "Desenvolvedor Java", "Júnior", "05672");
		
		func1.visualizar();
		
		Funcionario func2 = new Funcionario("Rosa", 5000, "Desenvolvedor Java", "Pleno", "005673");
		
		func2.visualizar();

	}

}
