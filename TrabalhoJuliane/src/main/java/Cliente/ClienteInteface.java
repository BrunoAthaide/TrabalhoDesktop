/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cliente;

import java.util.List;

/**
 *
 * @author athai
 */
public interface ClienteInteface {
    Tela.Cliente save (Tela.Cliente cliente);
    Tela.Cliente upadate( Tela.Cliente cliente);
    Boolean delate (Tela.Cliente cliente);
    Tela.Cliente findByID(int id);
    List<Tela.Cliente> findAll();
    
    
}
