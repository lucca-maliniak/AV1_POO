package br.consulta;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Paciente {
    private Integer id;
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private String DataNascimento;
    private String profissao;
    private List<Exame> exames = new LinkedList<>();

    public Paciente() {
    }

    ;

    public Paciente(Integer id, String nome, String rg, String endereco, String telefone, String dataNascimento, String profissao) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.DataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", DataNascimento=" + DataNascimento +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(nome, paciente.nome) && Objects.equals(rg, paciente.rg) && Objects.equals(endereco, paciente.endereco) && Objects.equals(telefone, paciente.telefone) && Objects.equals(profissao, paciente.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, rg, endereco, telefone, profissao);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.DataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public Exame adicionarExame(Integer id, String descricao, String data, Double preco) {
        var ex = new Exame(id, descricao, data, preco);
        exames.add(ex);
        return ex;
    }

}
