import java.util.List;

public class Produto {
    private String nome;
    private double valor;
    private List quantidadeMaximas;
    private int codigo;

    public Produto(String nome, double valor, List quantidadeMaximas, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }
}
