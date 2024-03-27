package Trabalho1.src;
import java.time.LocalDate;
public class Vendedor extends Pessoa {
    private String matricula;
    private double percentualComissao;
    private LocalDate dtAdmissao;

    public Vendedor(String matricula, double percentualComissao, LocalDate dtAdmissao) {
        this.matricula = matricula;
        this.percentualComissao = percentualComissao;
        this.dtAdmissao = dtAdmissao;
    }

    public Vendedor(String nome, String cpf, String matricula, double percentualComissao, LocalDate dtAdmissao) {
        super(nome, cpf);
        this.matricula = matricula;
        this.percentualComissao = percentualComissao;
        this.dtAdmissao = dtAdmissao;
    }
}
