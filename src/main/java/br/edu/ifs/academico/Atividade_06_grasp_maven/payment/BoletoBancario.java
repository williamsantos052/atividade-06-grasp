package br.edu.ifs.academico.Atividade_06_grasp_maven.payment;

public class BoletoBancario implements Pagamento {
    public void processarPagamento(double valor) {
        // Lógica para gerar boleto
        System.out.println("Boleto gerado no valor de R$ " + valor);
    }
}
