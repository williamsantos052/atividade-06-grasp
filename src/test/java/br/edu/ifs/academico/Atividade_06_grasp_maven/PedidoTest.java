package br.edu.ifs.academico.Atividade_06_grasp_maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.edu.ifs.academico.Atividade_06_grasp_maven.model.*;

public class PedidoTest {
    
    @Test
    public void testCalcularTotal() {
        Produto livro = new Livro("Java for Beginners", "Learn Java", 50.0);
        Produto eletrodomestico = new Eletrodomestico("Blender", "Blender XYZ", 150.0);
        
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(livro, 2));
        pedido.adicionarItem(new ItemPedido(eletrodomestico, 1));
        
        double totalEsperado = (50.0 * 2) + (150.0);
        assertEquals(totalEsperado, pedido.calcularTotal(), 0.01);
    }
}
