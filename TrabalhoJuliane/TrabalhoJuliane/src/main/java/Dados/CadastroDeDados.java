/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author athai
 */
public class CadastroDeDados {
    public boolean validarUsuarios(String Cliente , String ID){
        if (Cliente.equals("San1")&& ID.equals(12345678)){
            return true;
        } else {
            return false;
        }
    }
}
