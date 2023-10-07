package br.consulta;

import java.util.Objects;

public class Exame {
    private Integer id;
    private String descricao;
    private String data;
    private Double preco;

    public Exame(){}
    public Exame(Integer id, String descricao, String data, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "exame{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exame exame = (Exame) o;
        return Objects.equals(id, exame.id) && Objects.equals(descricao, exame.descricao) && Objects.equals(data, exame.data) && Objects.equals(preco, exame.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, data, preco);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
