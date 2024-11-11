/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.invoice.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author julio.molina
 */
@Setter
@Getter
public class UsuarioPojo implements Serializable {

    private String empresa;
    private String usuario;
    private String nombre;
}
