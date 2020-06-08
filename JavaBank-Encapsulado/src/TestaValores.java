
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(123, 55668);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(123,55447);
		Conta conta3 = new Conta(147, 87956);
		
		System.out.println(Conta.getTotal());
	}
}
