package Trabalho1.src;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double valor;
    private int quantidadeMaximas;
    private int codigo;

    private List<Produto> produtos = new ArrayList<>();


    public Produto(String nome, double valor, int quantidadeMaximas) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.quantidadeMaximas = quantidadeMaximas;
    }


    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeMaximas() {
        return quantidadeMaximas;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.nome.compareTo(outroProduto.getNome());
    }

    public Object getVendedor() {
        return null;
    }



}
