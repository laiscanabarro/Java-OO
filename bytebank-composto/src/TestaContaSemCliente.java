
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		
		novaConta.titular = new Cliente();
		novaConta.titular.nome = "Artur";
		
		System.out.println(novaConta.titular.nome);
		//novaConta.titular.nome = "Artur";
		//System.out.println(novaConta.titular.nome);
	}

}
