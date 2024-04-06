package Trabalho1.src;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pedido> pedidos = new ArrayList<>();
    private List<PedidoItem> itens = new ArrayList<>();
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void adicionarItem(PedidoItem item) throws ItemDuplicadoException, QuantidadeNaoPermitadaException {
        for (PedidoItem it : itens) {
            if (it.getProduto().equals(item.getProduto())) {
                throw new ItemDuplicadoException("Item duplicado: " + item.getProduto().getNome());
            }
        }

        if (item.getQuantidade() > item.getProduto().getQuantidadeMaximas()) {
            throw new QuantidadeNaoPermitadaException("Quantidade não permitida para esse produto: " + item.getProduto().getNome());
        }
        itens.add(item);
    }


    public PedidoItem[] getItens() {
        return itens.toArray(new PedidoItem[0]);
    }

    public Produto getVendedor() {
        return null;
    }

    public Produto getCliente() {
        return null;
    }

    public int getId() {
        int id = 0;
        return id;
    }

    public Pedido(List<Pedido> pedidos, List<PedidoItem> itens) {
        this.pedidos = pedidos;
        this.itens = itens;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }
}
