/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

/**
 *
 * @author athai
 */
public class Venda {
       private int id;
    private String produto;
    private double precoUnitario;
    private double desconto;
    private double precoTotal;

    public Venda(int id, String produto, double precoUnitario, double desconto) {
        this.id = id;
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.desconto = desconto;
        calcularPrecoTotal();
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
        calcularPrecoTotal();
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
        calcularPrecoTotal();
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    // Método para calcular o preço total com base no preço unitário e no desconto
    private void calcularPrecoTotal() {
        this.precoTotal = precoUnitario * (1 - desconto);
    }
}
