package SistemaDeComprasVendas;

public class Produto { //Classe molde produto
	
	//Atributos
	private String nome, categoria;
	private int quantidadeEstoque;
	private double precoProduto;
	
	//Definição de construtores
	public Produto(String nome, String categoria, int quantidadeEstoque, double precoProduto) {
		this.nome = nome;
		this.categoria = categoria;
		this.quantidadeEstoque = quantidadeEstoque;
		this.precoProduto = precoProduto;
	}
	
	//Definição de métodos
	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Categoria: " + categoria);
		System.out.println("Quantidade no estoque: " + quantidadeEstoque);
		System.out.printf("Preço: %.2f", precoProduto);
	}
	
	public double alterarPreco(double precoProduto) {
		if(precoProduto >= 0) {
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
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public double getPrecoProduto() {
		return precoProduto;
	}
	
	
	

}
