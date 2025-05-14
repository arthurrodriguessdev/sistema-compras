package SistemaDeComprasVendas;

import java.util.Scanner;

public class Produto { //Classe molde produto
	Scanner sc = new Scanner(System.in);

	//Definição de atributos
	private String nome, categoria;
	private int quantidadeCarrinho, servicoProdutos;
	private double precoProduto;
	private Pagamento pagamento; //Atributo para guardar o objeto Pagamento associado a este produto
	private Cliente cliente; //Atributo para guardar o objeto PCliente associado a este produto

	//Definição de construtores
	public Produto(String nome, String categoria, int quantidadeCarrinho, double precoProduto) {
		this.nome = nome;
		this.categoria = categoria;
		this.quantidadeCarrinho = quantidadeCarrinho;
		this.precoProduto = precoProduto;
	}

	//Método responsável por associar um objeto Pagamento a esse produto
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	//Método responsável por associar um objeto Cliente a esse produto
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//Definição de métodos
	public void meusProdutos() {
		System.out.println("=== SEÇÃO DE PRODUTOS ===");
		System.out.println("1 - Alterar preço do produto");
		System.out.println("2 - Alterar quantidade do produto");
		System.out.println("3 - Exibir detalhes do produto");
		System.out.println("4 - Seção de pagamento");
		System.out.println("5 - Mostrar dados cliente");
		System.out.println();
		System.out.print("Digite o número do serviço que deseja acessar: ");
		servicoProdutos = sc.nextInt();
		sc.nextLine();

		if(servicoProdutos == 1) {
			alterarPreco(precoProduto);
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoProdutos = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoProdutos == 1) {
				meusProdutos();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoProdutos == 2) {
			alterarQuantidade(quantidadeCarrinho);
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoProdutos = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoProdutos == 1) {
				meusProdutos();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoProdutos == 3) {
			exibirDetalhes();
			System.out.println();
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoProdutos = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoProdutos == 1) {
				meusProdutos();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoProdutos == 4) {
			pagamento.pagamento();
			System.out.println();
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoProdutos = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoProdutos == 1) {
				meusProdutos();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoProdutos == 5) {
			cliente.exibirDetalhesCliente();
			System.out.println();
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoProdutos = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoProdutos == 1) {
				meusProdutos();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else {
			System.out.println("Opção inválida!");
		}
	}

	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Categoria: " + categoria);
		System.out.println("Quantidade no estoque: " + quantidadeCarrinho);
		System.out.printf("Preço: R$%.2f", precoProduto);
	}

	public double alterarPreco(double precoProduto) {
		System.out.print("Digite o novo preço: ");
		precoProduto = sc.nextDouble();
		sc.nextLine();

		if(precoProduto >= 0) {
			this.precoProduto = precoProduto;
			System.out.println("Preço do produto alterado!");
		} else {
			System.out.println("Preço inválido!");
		}

		return precoProduto;
	}

	public int alterarQuantidade(int quantidadeCarrinho) {
		System.out.print("Digite a nova quantidade no carrinho: ");
		quantidadeCarrinho = sc.nextInt();
		sc.nextLine();
		this.quantidadeCarrinho = quantidadeCarrinho;
		System.out.println("Quantidade do produto alterada!");

		return quantidadeCarrinho;
	}

	//Definição de GET e SET
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
