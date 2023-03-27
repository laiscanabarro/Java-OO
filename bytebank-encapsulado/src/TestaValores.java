
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 444);
		Conta novaConta = new Conta(123, 555);
		
		//conta.setAgencia(-9);
		//conta.setNumero(-23);
		//System.out.println(conta.getAgencia());
		//System.out.println(conta.getNumero());
		
		System.out.println(Conta.getTotal());
	}

}
