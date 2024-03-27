import Trabalho1.src.Pedido;
import Trabalho1.src.Produto;
import Trabalho1.src.Cliente;
import Trabalho1.src.Vendedor;
import java.util.ArrayList;
import java.util.List;
public class Loja {
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

}
