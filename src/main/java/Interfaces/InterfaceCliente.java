/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author adminjunior
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}
