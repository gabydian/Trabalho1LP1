package Trabalho1.src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Loja {
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private final List<Vendedor> vendedores = new ArrayList<>();
    private final List<Pedido> pedidos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void listarClientes() {
        Collections.sort(clientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

    public void listarProdutos() {
        Collections.sort(produtos);
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$" + produto.getValor());
        }
    }

    public double calcularTotalBrutoVendas() {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
            for (PedidoItem item : pedido.getItens()) {
                total += item.getProduto().getValor() * item.getQuantidade();
            }
        }
        return total;
    }

    public double calcularTotalLiquidoVendas() {
        double totalLiquido = calcularTotalBrutoVendas();
        for (Vendedor vendedor : vendedores) {
            double comissaoTotalVendedor = 0.0;
            for (Pedido pedido : pedidos) {
                for (PedidoItem item : pedido.getItens()) {
                    if (item.getProduto().getVendedor().equals(vendedor)) {
                        comissaoTotalVendedor += item.getProduto().getValor() * item.getQuantidade() * vendedor.getPercentualComissao();
                    }
                }
            }
            totalLiquido -= comissaoTotalVendedor;
        }
        return totalLiquido;
    }


    public void listarVendedores() {
        Collections.sort(vendedores);
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.getNome());
        }
    }

    public void main() {
    }

    public void adicionarPedido(Pedido pedido) {

    }
}