import java.util.ArrayList;

public class Banco implements IBanco {
	
	Pessoas Pessoa = new Pessoas();
	
	ArrayList<Pessoas> DadosCliente = new ArrayList<Pessoas>();
	
	public void cadastraCliente(String cpf, String nome) {
		Pessoa.setCPF(cpf);
		Pessoa.setNome(nome);
		DadosCliente.add(Pessoa);
	}
	
	public void setEndereco(String cpf, String nomeDaRua, int numero) {
		Pessoa.setCPF(cpf);
		Pessoa.setNomeRua(nomeDaRua);
		Pessoa.setNumero(numero);
		DadosCliente.add(Pessoa);
	}
	
	public void setConta(String cpf, TipoContas tipoContas) {
		Pessoa.setCPF(cpf);
		Pessoa.setTipoConta(tipoContas);
		DadosCliente.add(Pessoa);
	}
	
	public boolean sacar(String cpf, double valor) {
		return true;
	}
	
	public void depositar(String cpf, double valor) {
	}
	
	public void setChequeEspecial(String cpf, double valor) {
	}
	
	public void cobrarTaxas() {
	}
	
	public void imprimirRelatorio() {
	}
	
}
