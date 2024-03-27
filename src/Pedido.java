package Trabalho1.src;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<PedidoItem> itens = new ArrayList<>();
    public void adicionarItem(PedidoItem item) throws ItemDuplicadoException {
        for (PedidoItem item : itens) {
            if (item.getProduto().equals(item.getProduto())) {
                throw new ItemDuplicadoException("Item duplicado: " + item.getProduto().getNome());
            }
        }
        itens.add(item);
    }
}
