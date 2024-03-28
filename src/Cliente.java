package Trabalho1.src;
import java.time.LocalDate;

public class Cliente implements Comparable<Cliente> {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public int compareTo(Cliente outroCliente) {
        return this.nome.compareTo(outroCliente.getNome());
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}

