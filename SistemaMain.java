package SistemaDeComprasVendas;

import java.util.Locale;
import java.util.Scanner;

public class SistemaMain {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int servico;

		//Realização de cadastro do produto
		System.out.println("=== CADASTRO DO PRODUTO ===");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Categoria: ");
		String categoria = sc.nextLine();
		System.out.print("Quantidade no carrinho: ");
		int quantidadeCarrinho = sc.nextInt();
		System.out.print("Preço do produto: ");
		double precoProduto = sc.nextDouble();
		sc.nextLine();
		System.out.println();

		//Realização do cadastro do cliente
		System.out.println("=== CADASTRO DO CLIENTE ===");
		System.out.print("Nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("E-mail do cliente: ");
		String emailCliente = sc.nextLine();
		System.out.print("Endereço do cliente: ");
		String enderecoCliente = sc.nextLine();
		System.out.println();

		Produto produto1 = new Produto(nome, categoria, quantidadeCarrinho, precoProduto); //Criando objeto produto1 com os dados que o usuário informou, dados de entrada
		Pagamento pagamento1 = new Pagamento(produto1); //Criando o objeto pagamento1 e passando o objeto produto1 como parâmetro para realizar cálculos na classe pagamento
		produto1.setPagamento(pagamento1); //Objeto pagamento1 está sendo associado com o objeto produto1, para que produto tenha informações sobre pagamento
		Cliente cliente1 = new Cliente(nomeCliente, emailCliente, enderecoCliente); //Criando objeto cliente1 com os dados que o usuário informou, dados de entrada
		produto1.setCliente(cliente1); //Objeto cliente1 está sendo associado ao produto1
		pagamento1.setCliente(cliente1); //Objeto cliente1 está sendo associado ao pagamento1

		//Criação do menu
		System.out.println("1 - Meus produtos");
		System.out.println("2 - Pagamento");
		System.out.println("3 - Mostrar dados cliente");
		System.out.print("Digite o número do serviço que deseja acessar: ");
		servico = sc.nextInt();
		System.out.println();

		if(servico == 1) {
			produto1.meusProdutos();

		} else if(servico == 2) {
			pagamento1.pagamento();

		} else if(servico == 3) {
			cliente1.exibirDetalhesCliente();
		}


		sc.close();
	}

}
