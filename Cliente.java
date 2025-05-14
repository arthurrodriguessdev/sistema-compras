package SistemaDeComprasVendas;

import java.util.Scanner;

public class Cliente { //Classe molde cliente
	Scanner sc = new Scanner(System.in);

	//Definição de atributos
	private String nomeCliente, emailCliente, enderecoCliente;
	private int servicoCliente;

	//Definição de construtores
	public Cliente(String nomeCliente, String emailCliente, String enderecoCliente) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
	}

	//Definição de métodos
	public void exibirDetalhesCliente() {
		System.out.println("=== INFORMAÇÕES DO CLIENTE ===");
		System.out.println("Nome do cliente: " + nomeCliente);
		System.out.println("E-mail do cliente: " + emailCliente);
		System.out.println("Endereço do cliente: " + enderecoCliente);
		System.out.println();
		System.out.println("1 - Exibir informações novamente");
		System.out.println("2 - Sair");
		System.out.println();
		System.out.print("Digite o número do serviço que deseja acessar: ");
		servicoCliente = sc.nextInt();
		sc.nextLine();
		System.out.println();

		if(servicoCliente == 1) {
			exibirDetalhesCliente();
		} else {
			System.out.println("Seção encerrada!");
		}
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public int getServicoCarrinho() {
		return servicoCliente;
	}

}
