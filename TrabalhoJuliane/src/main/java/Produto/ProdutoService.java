/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

import Tela.Cliente;
import Tela.Produto;
import java.util.List;

/**
 *
 * @author athai
 */
public class ProdutoService {
    private ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public void save(Produto produto) {
        produtoDAO.save(produto);
    }

    public List<Produto> findAll() {
        return produtoDAO.findAll();
    }

    public Produto findById(int id) {
        return produtoDAO.findById(id);
    }

    public void update(Produto produto) {
        produtoDAO.update(produto);
    }

    public void delete(int id) {
        produtoDAO.delete(id);
    }
}


