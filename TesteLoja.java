package Trabalho1.src;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteLoja {
    public static void menuPrincipal() {
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

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();

        boolean sair = false;
        while (!sair) {
            menuPrincipal();
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto(teclado, loja);
                    break;
                case 2:
                    cadastrarCliente(teclado, loja);
                    break;
                case 3:
                    cadastrarVendedor(teclado, loja);
                    break;
                case 4:
                    loja.listarClientes();
                    break;
                case 5:
                    loja.listarProdutos();
                    break;
                case 6:
                    loja.listarVendedores();
                    break;
                case 7:
                    loja.listarPedidos();
                    break;
                case 8:
                    Pedido pedido = new Pedido();
                    loja.adicionarPedido(Pedido pedido);
                    break;
                case 9:
                    System.out.println("Total Bruto de Vendas: R$" + loja.calcularTotalBrutoVendas());
                    break;
                case 10:
                    System.out.println("Total Líquido de Vendas: R$" + loja.calcularTotalLiquidoVendas());
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

    }

    private static void cadastrarProduto(Scanner teclado, Loja loja) {
        System.out.println("Cadastro de Produtos:");
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = teclado.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valorProduto = teclado.nextDouble();
        System.out.print("Digite a quantidade máxima do produto: ");
        int quantidadeMaximaProduto = teclado.nextInt();
        teclado.nextLine();
        Produto produto = new Produto(nomeProduto, valorProduto, quantidadeMaximaProduto);
        loja.cadastrarProduto(produto);
    }

    private static void cadastrarCliente(Scanner teclado, Loja loja) {
        System.out.println("Cadastro de Clientes:");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = teclado.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String enderecoCliente = teclado.nextLine();
        Cliente cliente = new Cliente(nomeCliente, enderecoCliente);
        loja.cadastrarCliente(cliente);
    }

    private static void cadastrarVendedor(Scanner teclado, Loja loja) {
        System.out.println("Cadastro de Vendedores:");
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = teclado.nextLine();
        System.out.print("Digite a comissão do vendedor (em decimal): ");
        double percentualComissao = teclado.nextDouble();
        teclado.nextLine();
        String matricula = "";
        String cpfVendedor = "";
        LocalDate dtAdmissao = null;
        Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, matricula, percentualComissao, dtAdmissao);
        loja.cadastrarVendedor(vendedor);
    }
}