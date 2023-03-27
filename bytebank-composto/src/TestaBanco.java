
public class TestaBanco {
	public static void main(String[] args) {
		Cliente lais = new Cliente();
		lais.nome = "Laís Fernanda Canabarro Araujo";
		lais.cpf = "000.000.000-00";
		lais.profissao = "estudante";
		
		Conta contaDaLais = new Conta();
		contaDaLais.deposita(300);
		
		contaDaLais.titular = lais;
		
		System.out.println(contaDaLais.titular.nome);
		System.out.println(contaDaLais.titular.cpf);
		System.out.println(contaDaLais.titular.profissao);
	}
}
