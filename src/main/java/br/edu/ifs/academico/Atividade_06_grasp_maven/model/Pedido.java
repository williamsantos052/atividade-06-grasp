package br.edu.ifs.academico.Atividade_06_grasp_maven.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void atualizarEstoque() {
        // Lógica para atualizar o estoque
    }

    public void gerarNotaFiscal() {
        // Lógica para gerar nota fiscal
    }
}