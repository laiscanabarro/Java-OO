
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		boolean retirou = conta.saca(20);
		
		System.out.println(retirou);
		System.out.println(conta.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(200);
		
		if(conta2.transfere(conta, 50)) {
			System.out.println("transferencia feita com sucesso");
		}
		
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "Lais Fernanda Canabarro Araujo";
		
		System.out.println(conta.titular);
	}

}
