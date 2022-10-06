
public class TestaBanco {
	public static void main(String[] args) {

		//Criando e populando cliente klayton
		
		Cliente klayton = new Cliente();
		klayton.nome = "Klayton Souza";
		klayton.cpf = "777.777.777-77";
		klayton.profissao = "Full Stack Java";
		
		Conta contaDoKlayton = new Conta();
		contaDoKlayton.deposita(1000);
		
		contaDoKlayton.titular = klayton;
		System.out.println(contaDoKlayton.titular);
		System.out.println(contaDoKlayton.titular.nome);		
	}
}
