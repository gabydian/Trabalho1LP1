package Trabalho1.src;

public class TesteLoja {

    public static void menuPricipal () {
        System.out.println("Escolha uma das opcoes abaixo: ");
        System.out.println("1. Cadastro de Produtos\n");
        System.out.println("2. Cadastro de Cliente\n");
        System.out.println("3. Cadastro de Vendedores\n");
        System.out.println("4. Listar Clientes\n");
        System.out.println("5. Listar Produtos\n");
        System.out.println("6. Listar Vendedores\n");
        System.out.println("7. Listar Pedidos\n");
        System.out.println("8. Adicionar Pedido\n");
        System.out.println("9. Total Bruto de Vendas\n");
        System.out.println("10. Total Liquido de Vendas\n");
        System.out.println("0. Sair");

    }
}

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//
//        // Criando uma loja
//        Loja loja = new Loja() {
//
//
//            // Cadastro de produtos
//        System.out.println("Cadastro de Produtos:");
//        System.out.println("Digite o nome do produto: ");
//            String nomeProduto = teclado.nextLine();
//        System.out.println("Digite o valor do produto: ");
//            double valorProduto = teclado.nextDouble();
//        System.out.println("Digite a quantidade máxima do produto: ");
//            int quantidadeMaximaProduto = teclado.nextInt();
//        teclado.nextInt();
//            Produto produto = new Produto(nomeProduto, valorProduto, quantidadeMaximaProduto);
//       cadastrarProduto.add(produto);
//
//            // Cadastro de clientes
//        System.out.println("\nCadastro de Clientes:");
//        System.out.println("Digite o nome do cliente: ");
//            String nomeCliente = teclado.nextLine();
//        System.out.println("Digite o endereço do cliente: ");
//            String enderecoCliente = teclado.nextLine();
//            Cliente cliente = new Cliente(nomeCliente, enderecoCliente);
//        loja.cadastrarCliente(cliente);
//
//            // Cadastro de vendedores
//        System.out.println("\nCadastro de Vendedores:");
//        System.out.print("Digite o nome do vendedor: ");
//            String nomeVendedor = teclado.nextLine();
//        System.out.print("Digite a comissão do vendedor (em decimal): ");
//            double percentualComissao = teclado.nextDouble();
//            String matricula = "";
//            LocalDate dtAdmissao = null;
//            String cpfVendedor = null;
//            Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, matricula, percentualComissao, dtAdmissao);
//        loja.cadastrarVendedor(vendedor);
//
//            Pedido pedido = new Pedido();
//        System.out.println("\nAdicionar itens ao pedido:");
//
//            // Adicionando o pedido à loja
//        loja.adicionarPedido(pedido);
//
//
//        System.out.println("\nListagem de produtos:");
//        loja.listarProdutos();
//
//        System.out.println("\nListagem de clientes:");
//        loja.listarClientes();
//
//        System.out.println("\nListagem de vendedores:");
//        loja.listarVendedores();
//
//        System.out.println("\nTotal bruto de vendas: R$" + loja.calcularTotalBrutoVendas());
//        System.out.println("Total líquido de vendas: R$" + loja.calcularTotalLiquidoVendas());
//        }
//
//    }
