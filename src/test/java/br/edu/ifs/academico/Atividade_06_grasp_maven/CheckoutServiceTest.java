package br.edu.ifs.academico.Atividade_06_grasp_maven;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import br.edu.ifs.academico.Atividade_06_grasp_maven.model.*;
import br.edu.ifs.academico.Atividade_06_grasp_maven.notification.*;
import br.edu.ifs.academico.Atividade_06_grasp_maven.payment.*;
import br.edu.ifs.academico.Atividade_06_grasp_maven.service.*;

public class CheckoutServiceTest {

    @Test
    public void testProcessarCheckout() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(new Livro("Java", "Programming", 50.0), 1));

        Pagamento pagamento = mock(Pagamento.class);
        Notificacao notificacao = mock(Notificacao.class);

        CheckoutService checkoutService = new CheckoutService(notificacao);
        checkoutService.processarCheckout(pedido, pagamento);

        verify(pagamento).processarPagamento(50.0);
        verify(notificacao).enviarNotificacao("Pedido processado com sucesso.");
    }
}
