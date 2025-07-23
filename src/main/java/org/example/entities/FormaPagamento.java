
package org.example.entities;

import jakarta.persistence.*;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String tipo;
    private Integer numeroParcelas;
    private Integer diasEntreParcelas;
    private Boolean permiteTroco;
    private Double taxaPercentual;
    private Boolean ativo;

    public FormaPagamento() {
    }

    public FormaPagamento(Long id, String descricao, String tipo, Integer numeroParcelas, Integer diasEntreParcelas, Boolean permiteTroco, Double taxaPercentual, Boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.numeroParcelas = numeroParcelas;
        this.diasEntreParcelas = diasEntreParcelas;
        this.permiteTroco = permiteTroco;
        this.taxaPercentual = taxaPercentual;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Integer getDiasEntreParcelas() {
        return diasEntreParcelas;
    }

    public void setDiasEntreParcelas(Integer diasEntreParcelas) {
        this.diasEntreParcelas = diasEntreParcelas;
    }

    public Boolean getPermiteTroco() {
        return permiteTroco;
    }

    public void setPermiteTroco(Boolean permiteTroco) {
        this.permiteTroco = permiteTroco;
    }

    public Double getTaxaPercentual() {
        return taxaPercentual;
    }

    public void setTaxaPercentual(Double taxaPercentual) {
        this.taxaPercentual = taxaPercentual;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
