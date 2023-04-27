package exerPOO;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Ana", "001", "Rua Amarelo, 107", 1, 12000);
		
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Rosa", "002", "Rua Laranja, 21", 2, 8576.97);
		
		cliente2.visualizar();
		
		PessoaFisica cli1 = new PessoaFisica("Ana", "001", "Rua Amarelo, 107", 1, 12000,"123.456.789-00");
		
		cli1.visualizar();
		
		PessoaFisica cli2 = new PessoaFisica("Rosa", "002", "Rua Laranja, 21", 2, 8576.97,"987.654.321-00");
		
		cli2.visualizar();
		
		PessoaJuridica empresa1 = new PessoaJuridica("Estrela EPP", "1234", "Rua Roxo, 300", 10, 50435.76, "12.345.678/0001-32");
		
		empresa1.visualizar();
		
		PessoaJuridica empresa2 = new PessoaJuridica("Meteoro SA", "4321", "Rua Roxo, 1007", 15, 150582.28, "87.654.321/0001-87");
		
		empresa2.visualizar();

	}

}
