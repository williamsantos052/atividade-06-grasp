package br.edu.ifs.academico.Atividade_06_grasp_maven.payment;

public class CartaoCredito implements Pagamento {
    public void processarPagamento(double valor) {
        // Lógica para processar pagamento com cartão
        System.out.println("Pagamento com cartão de crédito de R$ " + valor + " processado.");
    }
}
