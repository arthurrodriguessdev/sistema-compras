package SistemaDeComprasVendas;

import java.util.Scanner;

public class Produto { //Classe molde produto
	
	Scanner sc = new Scanner(System.in);
	
	//Atributos
	private String nome, categoria;
	private int quantidadeCarrinho;
	private double precoProduto;
	
	//Definição de construtores
	public Produto(String nome, String categoria, int quantidadeCarrinho, double precoProduto) {
		this.nome = nome;
		this.categoria = categoria;
		this.quantidadeCarrinho = quantidadeCarrinho;
		this.precoProduto = precoProduto;
	}
	
	//Definição de métodos
	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Categoria: " + categoria);
		System.out.println("Quantidade no estoque: " + quantidadeCarrinho);
		System.out.printf("Preço: R$%.2f", precoProduto);
	}
	
	public double alterarPreco(double precoProduto) {
		if(precoProduto >= 0) {
			System.out.print("Digite o novo preço: ");
			precoProduto = sc.nextDouble();
			this.precoProduto = precoProduto;
		} else {
			System.out.println("Preço inválido!");
		}
		
		return precoProduto;
	}
	
	//Definição de GET e SET, acesso e modificador de dados
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public int getQuantidadeCarrinho() {
		return quantidadeCarrinho;
	}
	
	public double getPrecoProduto() {
		return precoProduto;
	}
	

}
