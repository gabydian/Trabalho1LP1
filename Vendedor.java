package Trabalho1.src;

import java.time.LocalDate;
public class Vendedor extends Pessoa implements Comparable<Vendedor> {
    private String matricula;
    private double percentualComissao;
    private LocalDate dtAdmissao;

    public Vendedor(String nome,String cpf, String matricula, double percentualComissao, LocalDate dtAdmissao) {
        super(nome, cpf);
        this.matricula = matricula;
        this.percentualComissao = percentualComissao;
        this.dtAdmissao = dtAdmissao;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setDtAdmissao(LocalDate dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public LocalDate getDtAdmissao() {
        return dtAdmissao;
    }

    @Override
    public int compareTo(Vendedor outroVendedor) {
        return outroVendedor.getNome().compareTo(this.nome);

    }

}
