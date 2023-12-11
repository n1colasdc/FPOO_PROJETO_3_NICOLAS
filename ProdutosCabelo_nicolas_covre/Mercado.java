package ProdutosCabelo_nicolas_covre;

public class Mercado {
	private SetorBeleza setorBeleza;
	private String nome;
	
	
	public Mercado() {
	
	
	}

	
	public Mercado(SetorBeleza setorBeleza, String nome) {
		
		this.setorBeleza = setorBeleza;
		this.nome = nome;
	}

	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public SetorBeleza getSetorBeleza() {
		return this.setorBeleza;
	}
	
	public void setSetorBeleza(SetorBeleza setorBeleza) {
		this.setorBeleza = setorBeleza;
	}
	
	public void exibir() {
		System.out.println(setorBeleza.getProCa());
	}
	
}
