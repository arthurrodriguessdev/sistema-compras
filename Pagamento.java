package SistemaDeComprasVendas;

import java.util.Scanner;

public class Pagamento { //Classe molde do pagamento
	Scanner sc = new Scanner(System.in);
	
	
	//Definição de atributos
	private double valorTotal;
	private String statusPagamento;
	private int servicoPagamento;
	private Produto produto;
	
	public Pagamento(Produto produto1) {
		this.produto = produto1;
	}
	
	//Definição de métodos
	public void pagamento(int servicoPagamento) {
		System.out.println("=== SEÇÃO DE PAGAMENTO ===");
		System.out.println("1 - Realizar pagamento");
		System.out.println("2 - Cancelar pagamento");
		System.out.println("3 - Exibir valor total");
		System.out.print("Digite o número do serviço que deseja acessar: ");
		servicoPagamento = sc.nextInt();
		
		if(servicoPagamento == 1) {
			realizarPagamento();
			System.out.println("Pagamento realizado com sucesso!");
		} else if(servicoPagamento == 2) {
			cancelarPagamento();
			System.out.println("Pagamento cancelado com sucesso!");
		} else if(servicoPagamento == 3) {
			calcularValorTotal();
			exibirValorTotal();
			
		} else {
			System.out.println("Opção inválida!");
		}
	}
	public void realizarPagamento() {
		statusPagamento = "Pago";
	}
	
	public void cancelarPagamento() {
		statusPagamento = "Pagamento pendente";
	}
	
	public double calcularValorTotal() {
		return produto.getPrecoProduto() * produto.getQuantidadeCarrinho();
	}
	public void exibirValorTotal() {
		System.out.printf("R$: %.2f", calcularValorTotal());
	}
	
	//Definição de GET e SET
	public String getExibirStatusPagamento() {
		return statusPagamento;
	}
	
	public double getExibirValorTotal() {
		return valorTotal;
	}
	
	public int getServicoCarrinho() {
		return servicoPagamento;
	}

}
