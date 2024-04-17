/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

import Tela.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author athai
 */
public class VendaDAO {
   private List<Venda> vendas;

    public VendaDAO() {
        this.vendas = new ArrayList<>();
    }

    // Método para adicionar uma venda ao banco de dados simulado
    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    // Método para obter todas as vendas do banco de dados simulado
    public List<Venda> obterTodasVendas() {
        return vendas;
    }

}
