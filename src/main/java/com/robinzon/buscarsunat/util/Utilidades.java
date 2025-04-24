/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robinzon.buscarsunat.util;

import com.robinzon.buscarsunat.modelo.Oracle;

/**
 *
 * @author Matteo
 */
public final class Utilidades {
    
    public static Oracle getValoresConexion() {
       Oracle obj = new Oracle("LLE", "YVL", "Mat", 1521, "BDNX1");
       return obj;
    }
    
}
