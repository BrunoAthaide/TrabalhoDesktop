/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.List;

/**
 *
 * @author athai
 */
public class ClienteService {
   
    private ClienteDAO clienteDAO;

    public ClienteService() {
        clienteDAO = new ClienteDAO();
    }

    public void save(Cliente cliente) {
        clienteDAO.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    public Cliente findById(int id) {
        return clienteDAO.findById(id);
    }

    public void update(Cliente cliente) {
        clienteDAO.update(cliente);
    }

    public void delete(int id) {
        clienteDAO.delete(id);
    }
}

