public interface IBanco{
	
	public enum TipoContas{MINIMA, STANDARD, UM_PORCENTO};
	
	public void cadastraCliente(String cpf, String nome);
	
	public void setEndereco(String cpf, String nomeDaRua, int numero);
	
	public void setConta(String cpf, TipoContas tipoContas);
	
	public boolean sacar(String cpf, double valor);
	
	public void depositar(String cpf, double valor);
	
	public void setChequeEspecial(String cpf, double valor);
	
	public void cobrarTaxas();
	
	public void imprimirRelatorio();

}