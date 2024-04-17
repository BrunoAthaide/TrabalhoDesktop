/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Produto;

import Tela.Cliente;
import java.util.List;

/**
 *
 * @author athai
 */
public interface ProdutoInterface {
    Produto save (Produto produto);
    Produto upadate( Produto produto);
    Boolean delate (Produto produto);
    Produto findByID(int id);
    List<Cliente> findAll();
    
    
}
