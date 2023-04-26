package exerPOO;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Ana", "001", "Rua Amarelo", 1, 12000);
		
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Rosa", "002", "Rua Laranja", 2, 8576.97);
		
		cliente2.visualizar();

	}

}
