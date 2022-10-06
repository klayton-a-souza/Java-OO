
public class Conta {
	private double saldo;
	public int agencia;
	public int numero;
	public Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean trasferir(double valor, Conta contaDestino) {
		if (this.saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	

}
