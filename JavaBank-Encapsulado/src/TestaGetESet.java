
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(123);
		System.out.println(conta.getNumero());
		
		Cliente leo = new Cliente();
		leo.setNome("Leo");
		conta.setTitular(leo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(leo);
		System.out.println(conta.getTitular());
	}
}
