package agencias;

import java.io.Serializable;

public final class  Agencia implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroAg = 0;
	private String enderecoAg = "";
	
	public Agencia() {
	}
	
	public Agencia(int numero, String endereco) {
		super();
		this.numeroAg = numero;
		this.enderecoAg = endereco;
	}
	
	public String getEnderecoAg() {
		return enderecoAg;
	}
	public void setEnderecoAg(String endereco) {
		this.enderecoAg = endereco;
	}
	public int getNumeroAg() {
		return numeroAg;
	}
	public void setNumeroAg(int numero) {
		this.numeroAg = numero;
	}
	@Override
	public String toString() {
		return "Agencia [numeroAg=" + numeroAg + ", enderecoAg=" + enderecoAg + "]";
	}
	
	
}
