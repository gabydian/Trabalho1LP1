package Trabalho1.src;

import java.util.ArrayList;
import java.util.List;

public class PedidoItem{
    private Trabalho1.src.Produto produto;
    private int quantidade;
    private List<PedidoItem> itens = new ArrayList<>();


    public PedidoItem(Trabalho1.src.Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Trabalho1.src.Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
