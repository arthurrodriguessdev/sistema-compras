package SistemaDeComprasVendas;

import java.util.Locale;
import java.util.Scanner;

public class SistemaMain {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		String verificar;
		int servico;
		
		System.out.println("=== CADASTRO DO PRODUTO 01 ===");
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
		
		//Criando objeto 01
		Produto produto1 = new Produto(nome, categoria, quantidadeCarrinho, precoProduto);
		Pagamento pagamento1 = new Pagamento(produto1);
		
		System.out.print("Deseja visualizar os produtos cadastrados? [SIM/NÃO]: ");
		verificar = sc.next().toUpperCase();
		if(verificar.equals("SIM")) {
			produto1.exibirDetalhes();
			System.out.println();
			System.out.println();
		}
		
		System.out.print("Deseja alterar o preço do produto? [SIM/NÃO]: ");
		verificar = sc.next().toUpperCase();
		if(verificar.equals("SIM")) {
			produto1.alterarPreco(precoProduto);
			System.out.println();
		}
		
		System.out.println("1 - Meu carrinho");
		System.out.println("2 - Pagamento");
		System.out.println("3 - Cliente");
		System.out.print("Digite o número do serviço que deseja acessar: ");
		servico = sc.nextInt();
		System.out.println();
		if(servico == 1) {
			
		} else if(servico == 2) {
			pagamento1.pagamento(servico);
			
		}
		
		
		
		sc.close();
	}

}
