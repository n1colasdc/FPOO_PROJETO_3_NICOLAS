package ProdutosCabelo_nicolas_covre;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProdutoDeBeleza {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// add dados
		
		System.out.println("nome da mascara de reconstrucao: ");
		String n1= entrada.next();
		
		System.out.println("peso: ");
		double p1= entrada.nextDouble();
		
		System.out.println("marca: ");
		String m1= entrada.next();
		
		entrada.nextLine();//zerar buffer
		
		LocalDate v1;
		LocalDate f1;
		
		System.out.println("data de validade: ");
		String dataV = entrada.next();
		v1= LocalDate.parse(dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println("data de fabricacao: ");
		String dataV1 = entrada.next();
		f1= LocalDate.parse(dataV1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println("Digite o preco: ");
		double pr1 = entrada.nextDouble();
		
		//fim de add dados
		
		//criando o primeiro produto reconstrucao
		
		Reconstrucao r1 = new Reconstrucao(n1, p1, f1, v1, m1,pr1);
		
	// add dados
		
		System.out.println("mascara de hidratacao: ");
		String n2= entrada.next();
		
		System.out.println("peso: ");
		double p2= entrada.nextDouble();
		
		System.out.println("marca: ");
		String m2= entrada.next();
		
		entrada.nextLine();//zerar buffer
		
		LocalDate v2;
		LocalDate f2;
		
		System.out.println("data de validade: ");
		String dataV2 = entrada.next();
		v2= LocalDate.parse(dataV2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println("data de fabricacao: ");
		String dataV3 = entrada.next();
		f2= LocalDate.parse(dataV3, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println("Digite o preco: ");
		double pr2 = entrada.nextDouble();
		//fim de add dados
		
		// Criando segundo produto
		Hidratacao h1 = new Hidratacao(n2, p2, f2, v2, m2,pr2);
		
		
		// add dados
		
		System.out.println("mascara de nutricao: ");
		String n3= entrada.next();
		
		System.out.println(" peso: ");
		double p3= entrada.nextDouble();
		
		System.out.println(" marca: ");
		String m3= entrada.next();
		
		entrada.nextLine();//zerar buffer
		
		LocalDate v3;
		LocalDate f3;
		
		System.out.println("data de validade: ");
		String dataV4 = entrada.next();
		v3= LocalDate.parse(dataV4, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println("data de fabricacao: ");
		String dataV5 = entrada.next();
		f3= LocalDate.parse(dataV5, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println("Digite o preco: ");
		double pr3 = entrada.nextDouble();
		
		//fim de add dados
		
		
		//Criando o terceiro produto
		
		Nutricao N1 = new Nutricao(n3, p3, f3, v3, m3,pr3);
		
		
	
		//criando lista vazia
		
		List<ProdutoCabelo> list_produto = new ArrayList<ProdutoCabelo>();
		//add produtos a lista vazia
		list_produto.add(r1);
		list_produto.add(h1);
		list_produto.add(r1);
		
		for (ProdutoCabelo pc : list_produto) {
			System.out.println("Nome: "+ pc.getNome() +" peso: "+ pc.getPeso() +" data de fabricacao: "+ pc.getDataF() +" data de validade: "+ pc.getDataV() +" marca: "+ pc.getMarca());
		}
		
		
		//criando o setor de beleza
		SetorBeleza S1 = new SetorBeleza(list_produto);
		
		
		//dando nome ao mercado
		String nm = entrada.next();
		
		//criando o mercado
		Mercado mer1 = new Mercado(S1, nm);
		
		//metodo do mercado
		mer1.exibir();
		
		Cliente c1 = new Cliente();
		
		c1.carrinho(pr1, pr2);
		
		
	}

}
