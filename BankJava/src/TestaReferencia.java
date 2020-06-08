
public class TestaReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.err.println("O saldo da primeira conta é " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("O saldo da segunda conta é " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.err.println("O saldo da segunda conta agora é " + segundaConta.saldo);
	}
}
