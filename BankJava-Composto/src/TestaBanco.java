
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Fulano da Silva";
		cliente.cpf = "11122233344";
		cliente.profissao = "programdor";
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.titular = cliente;
		System.out.println(conta.titular.nome);
				
	}
}
