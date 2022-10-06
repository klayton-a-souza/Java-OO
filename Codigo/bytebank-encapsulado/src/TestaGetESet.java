
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.setNumero(200);
		System.out.println(conta.getNumero());

		conta.setAgencia(777);
		System.out.println(conta.getAgencia());

		Cliente klayton = new Cliente();
		klayton.setNome("Klayton Souza");

		conta.setTitular(klayton);
		klayton.setProfissao("Desenvolvedor Full Stack");
		
		System.out.println(conta.getTitular().getNome());

	}

}
