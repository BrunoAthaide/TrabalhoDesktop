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
public class VendaService {
    private VendaDAO vendasDAO;

    public VendaService(VendaDAO vendasDAO) {
        this.vendasDAO = vendasDAO;
    }

    // Método para adicionar uma venda
    public void adicionarVenda(Venda venda) {
        vendasDAO.adicionarVenda(venda);
    }

    // Método para recuperar todas as vendas
    public List<Venda> obterTodasVendas() {
        return vendasDAO.obterTodasVendas();
    }
}


