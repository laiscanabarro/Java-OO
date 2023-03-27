
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 444);
		//conta.numero = 123;
		conta.setNumero(123);
		System.out.println(conta.getNumero());
		
		Cliente lais = new Cliente();
		
		lais.setNome("Laís Fernanda Canabarro Araujo");
		//System.out.println(lais.getNome());
		
		conta.setTitular(lais);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("estudante de ciência da computação");
		System.out.println(conta.getTitular().getProfissao());
		
	}

}
