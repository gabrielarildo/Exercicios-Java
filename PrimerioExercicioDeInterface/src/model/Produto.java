/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabri
 */
public class Produto {

    private int codigo;
    private String descricao;
    private String marca;
    private int qntEstoque;
    private double valor;

    public Produto() {
    }

    public Produto(int codigo, String descricao, String marca, int qntEstoque, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.qntEstoque = qntEstoque;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
