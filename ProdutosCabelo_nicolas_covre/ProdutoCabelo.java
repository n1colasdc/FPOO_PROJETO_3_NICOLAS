package ProdutosCabelo_nicolas_covre;

import java.time.LocalDate;

public class ProdutoCabelo {
	
	private String nome;
	private double peso;
	private LocalDate dataF;
	private LocalDate dataV;
	private String marca;
	private double preco;
	
	
	public ProdutoCabelo() {
		
	}



	public ProdutoCabelo(String nome, double peso, LocalDate dataF, LocalDate dataV, String marca,double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.dataF = dataF;
		this.dataV = dataV;
		this.marca = marca;
		this.preco=preco;
	}
	




	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public LocalDate getDataF() {
		return dataF;
	}
	
	public void setDataF(LocalDate dataF) {
		this.dataF = dataF;
	} 
	
	public LocalDate getDataV() {
		return dataV;
	}
	
	public void setDataV(LocalDate dataV) {
		this.dataV = dataV;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void objetivo() {
		
	}
	
	
}
