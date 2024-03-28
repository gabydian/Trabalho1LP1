package Trabalho1.src;

    public class TesteLoja {
        public static void main(String[] args) throws ItemDuplicadoException, QuantidadeNaoPermitadaException {
            // Criando alguns produtos
            Produto p1 = new Produto("Televisão", 1500.0, 10);
            Produto p2 = new Produto("Smartphone", 1000.0, 20);

            // Criando alguns clientes
            Cliente c1 = new Cliente("João", "Rua A, 123");
            Cliente c2 = new Cliente("Maria", "Rua B, 456");

            // Criando alguns vendedores
            Vendedor v1 = new Vendedor("Pedro", 0.1);
            Vendedor v2 = new Vendedor("Ana", 0.08);

            // Criando uma loja
            Loja loja = new Loja();
            loja.cadastrarProduto(p1);
            loja.cadastrarProduto(p2);
            loja.cadastrarCliente(c1);
            loja.cadastrarCliente(c2);
            loja.cadastrarVendedor(v1);
            loja.cadastrarVendedor(v2);

            // Criando e adicionando alguns pedidos
            Pedido pedido1 = new Pedido();
            pedido1.adicionarItem(new PedidoItem(p1, 2));
            pedido1.adicionarItem(new PedidoItem(p2, 3));

            Pedido pedido2 = new Pedido();
            pedido2.adicionarItem(new PedidoItem(p2, 1));

            loja.adicionarPedido(pedido1);
            loja.adicionarPedido(pedido2);

            // Testando as listagens e cálculos
            System.out.println("Listagem de produtos:");
            loja.listarProdutos();

            System.out.println("\nListagem de clientes:");
            loja.listarClientes();

            System.out.println("\nListagem de vendedores:");
            loja.listarVendedores();

            System.out.println("\nTotal bruto de vendas: R$" + loja.calcularTotalBrutoVendas());
            System.out.println("Total líquido de vendas: R$" + loja.calcularTotalLiquidoVendas());
        }
    }
