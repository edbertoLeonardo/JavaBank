
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaX = new Conta();
		System.out.println(contaX.getSaldo());
		
		contaX.titular = new Cliente();
		System.out.println(contaX.titular);
		
		contaX.titular.nome = "Zé";
		System.out.println(contaX.titular.nome);
	}
}
