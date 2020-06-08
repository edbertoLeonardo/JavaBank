
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoFulano = new Conta();
		contaDoFulano.saldo = 100;
		contaDoFulano.deposita(50);
		System.out.println(contaDoFulano.saldo);
		
		contaDoFulano.saca(20);
		System.out.println(contaDoFulano.saldo);
		
		Conta contaDoLeo = new Conta();
		contaDoLeo.deposita(1000);
		
		//contaDoLeo.transfere(500, contaDoFulano);
		if (contaDoLeo.transfere(500, contaDoFulano)) {
			System.out.println("Transferência feita com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDoLeo.saldo);
		System.out.println(contaDoFulano.saldo);
	}
}
