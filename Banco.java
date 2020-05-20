import java.util.ArrayList;
import java.util.LinkedList;

public class Banco implements IBanco {

	Pessoas Pessoa = new Pessoas();
	LinkedList<Pessoas> DadosCliente = new LinkedList<Pessoas>();
	
	public void cadastraCliente(String cpf, String nome) {
		
		Pessoa.setCPF(cpf);
        Pessoa.setNome(nome);
        System.out.println("Bem vindo(a) " + Pessoa.getNome());
        DadosCliente.add(Pessoa);
        Pessoa.setSaldoConta(0.0);
        System.out.println("Hello, " + Pessoa.getNome() + ".");
        System.out.println(DadosCliente.get(0).getNome());
	
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
		
		Double PegaSaldo = Pessoa.getSaldoConta();
		System.out.println("O CPF " + Pessoa.getCPF() + " está efetuando saque.");
        
		if(valor <= PegaSaldo){
            PegaSaldo -= valor;
            return true;
        }
		
		else{
            System.out.println("A operacao nao pode ser realizada, voce n pode sacar um valor maior que seu saldo");
            DadosCliente.add(Pessoa);
            return false;
        }

    }
	
	public void depositar(String cpf, double valor) {
		
		Double PegaSaldo = Pessoa.getSaldoConta();
		Pessoa.setSaldoConta(PegaSaldo + valor);
        System.out.println("O valor de " + valor + " está sendo depositado.");
        System.out.println(" " + Pessoa.getNome() + " seu saldo atual é de: " + Pessoa.getSaldoConta());
        DadosCliente.add(Pessoa);
	
	}
	
	public void setChequeEspecial(String cpf, double valor) {
		
	}
	
	public void cobrarTaxas() {
		
		String PegaConta = Pessoa.getTipoConta().toString();
		
		if(PegaConta.equals("MINIMA") == true) {
			
		}
		
		else if(PegaConta.equals("STANDARD") == true) {
			Double PegaSaldo = Pessoa.getSaldoConta();
			Double JurosFinal = PegaSaldo - 7;
			
			if(JurosFinal > 0) {
				
			}
			
			else {
				Double JurosFinalFinal = JurosFinal * 0.09;
			}
			
		}
		
		else {
			Double PegaSaldo = Pessoa.getSaldoConta();
			
			Double JurosFinal = PegaSaldo - 30;
			
			if(JurosFinal > 0) {
				Double Acressimo = (JurosFinal * 0.01);
				Pessoa.setSaldoConta(JurosFinal - Acressimo);
			}
			
			else {
				Double Acressimo = (JurosFinal * 0.01);
				Pessoa.setSaldoConta(JurosFinal + Acressimo);
			}
		}
		
	}
	
	public void imprimirRelatorio() {
		
		System.out.println(DadosCliente.get(0).getNome());
		
	}
	
}
