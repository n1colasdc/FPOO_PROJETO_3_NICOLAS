package ProdutosCabelo_nicolas_covre;


public class Cliente  {

	private String nome;
	private int idade;
	
	public Cliente() {
		super();

	}

	public Cliente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void  carrinho(double p1,double p2) {
		
		double p3= p1+p2;
		
		System.out.println("o total é: "+p3);
				
		
	}
	
	
	
}
