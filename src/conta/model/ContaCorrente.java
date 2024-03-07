package conta.model;

// ContaCorrente herda de Conta
public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		
		// super -> Método Construtor da Super Classe
		// Conta(numero, agencia, tipo, titular, saldo)
		super(numero, agencia, tipo, titular, saldo);
		
		this.limite = limite;
		
	}

	// Métodos de acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	// Métodos específicos
	
	@Override // Override = Sobrescrever
	public void visualizar() {
		// chamada da superclasse -> Conta.visualizar();
		super.visualizar();
		System.out.println("Limite de crédito: " + this.limite);
	}
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

}
