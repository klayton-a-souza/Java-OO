
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		System.out.println(minhaConta.getSaldo());
		
		minhaConta.titular = new Cliente();
		System.out.println(minhaConta.titular);
		
		minhaConta.titular.nome = "Klayton";
		System.out.println(minhaConta.titular.nome);
	}

}
