package SistemaDeComprasVendas;

import java.util.Scanner;

public class Pagamento { //Classe molde do pagamento
	Scanner sc = new Scanner(System.in);

	//Definição de atributos
	private double valorTotal;
	private String statusPagamento;
	private int servicoPagamento;
	private Produto produto; //Atributo para armazenar o objeto Produto associado a este pagamento
	private Cliente cliente; //Atributo para armazenar o objeto Cliente associado a este pagamento

	//Criando construtor para armazenar o objeto produto1
	public Pagamento(Produto produto1) {
		this.produto = produto1;
	}

	//Método responsável por associar um objeto Cliente a esse pagamento
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//Definição de métodos
	public void pagamento() {
		System.out.println("=== SEÇÃO DE PAGAMENTO ===");
		System.out.println("1 - Realizar pagamento");
		System.out.println("2 - Cancelar pagamento");
		System.out.println("3 - Exibir valor total");
		System.out.println("4 - Seção de Produto");
		System.out.println("5 - Mostrar dados cliente");
		System.out.println();
		System.out.print("Digite o número do serviço que deseja acessar: ");
		servicoPagamento = sc.nextInt();
		sc.nextLine();

		if(servicoPagamento == 1) {
			realizarPagamento();
			System.out.println("Pagamento realizado com sucesso!");
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoPagamento = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoPagamento == 1) {
				pagamento();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoPagamento == 2) {
			cancelarPagamento();
			System.out.println("Pagamento cancelado com sucesso!");
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoPagamento = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoPagamento == 1) {
				pagamento();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoPagamento == 3) {
			calcularValorTotal();
			exibirValorTotal();
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoPagamento = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoPagamento == 1) {
				pagamento();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoPagamento == 4) {
			produto.meusProdutos();
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoPagamento = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoPagamento == 1) {
				pagamento();
			} else {
				System.out.println("Seção encerrada!");
			}

		} else if(servicoPagamento == 5) {
			cliente.exibirDetalhesCliente();
			System.out.println();
			System.out.println("1 - Voltar para a seção anterior");
			System.out.println("2 - Sair");
			System.out.println();
			System.out.print("Digite o número do serviço que deseja acessar: ");
			servicoPagamento = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if(servicoPagamento == 1) {
				pagamento();
			} else {
				System.out.println("Seção encerrada!");
			}
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

	public void setPagamento() {

	}

}
