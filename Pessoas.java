public class Pessoas {

	String CPF;
	String Nome;
	String NomeRua;
	int Numero;
	IBanco.TipoContas TipoConta;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	public String getNomeRua() {
		return NomeRua;
	}
	public void setNomeRua(String nomeRua) {
		NomeRua = nomeRua;
	}
	
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	
	
	public IBanco.TipoContas getTipoConta() {
		return TipoConta;
	}
	
	public void setTipoConta(IBanco.TipoContas tipoConta) {
		TipoConta = tipoConta;
	}
	
}
