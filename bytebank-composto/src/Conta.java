public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(Conta contaDestino, double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	
}