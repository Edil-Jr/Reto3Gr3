/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author adminjunior
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
    
}
