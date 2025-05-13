package SistemaDeComprasVendas;

public class Pagamento { //Classe molde do pagamento
	
	//Definição de atributos
	private double valorTotal;
	private String statusPagamento;
	
	//Definição de métodos
	public String realizarPagamento(String statusPagamento) {
		statusPagamento = "Pago";
		return "Pagamento realizado com sucesso!";
	}
	
	public String cancelarPagamento() {
		statusPagamento = "Pagamento pendente";
		return statusPagamento;
	}
	
	public void exibirStatusPagamento() {
		System.out.println(statusPagamento);
	}
	
	public void exibirValorTotal() {
		System.out.println(valorTotal);
	}
	
	//Definição de GET e SET
	public String getExibirStatusPagamento() {
		return statusPagamento;
	}
	
	public double getExibirValorTotal() {
		return valorTotal;
	}

}
