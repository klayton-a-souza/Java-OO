package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 100;
		minhaConta.deposita(200);
		System.out.println(minhaConta.saldo);

		Conta contaDestino = new Conta();
		contaDestino.deposita(1000);

		if (minhaConta.trasferir(50, contaDestino)) {
			System.out.println("Transferencia executada com sucesso");
		} else {
			System.out.println("N�o foi possivel finalizar a transferencia");
		}
		System.out.println("Saldo da minha conta" + minhaConta.saldo);

	}

}