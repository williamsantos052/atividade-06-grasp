package br.edu.ifs.academico.Atividade_06_grasp_maven.service;

import br.edu.ifs.academico.Atividade_06_grasp_maven.model.*;
import br.edu.ifs.academico.Atividade_06_grasp_maven.notification.*;
import br.edu.ifs.academico.Atividade_06_grasp_maven.payment.*;

public class CheckoutService {
    private Notificacao notificacao;

    public CheckoutService(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void processarCheckout(Pedido pedido, Pagamento pagamento) {
        double total = pedido.calcularTotal();
        pagamento.processarPagamento(total);
        pedido.atualizarEstoque();
        pedido.gerarNotaFiscal();
        notificacao.enviarNotificacao("Pedido processado com sucesso.");
    }
}
