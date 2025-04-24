/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robinzon.buscarsunat.factory;

import com.robinzon.buscarsunat.modelo.Oracle;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author Matteo
 */
public class ConexionOracle {
   public static Connection conectar(Oracle oracle) throws SQLException {
      Connection conexion = null;

      try {
         DriverManager.registerDriver(new OracleDriver());
         conexion = DriverManager.getConnection("jdbc:oracle:thin:@" + oracle.getHost() + ":" + oracle.getPuerto() + ":" + oracle.getSid(), oracle.getUsuario(), oracle.getPassword());
      } catch (SQLException var3) {
         System.err.println("Error conexión : " + var3.getMessage());
         JOptionPane.showMessageDialog((Component)null, "Conexión Fallida debido al codigo de error : " + var3.getErrorCode(), "ERROR", 0);
      }

      return conexion;
   }

   public void test(Oracle oracle) {
      try {
         if (conectar(oracle) != null) {
            System.out.println("Conexion exitosa!");
            JOptionPane.showMessageDialog((Component)null, "Conexión exitosa !!!..", "Exito", 0);
         } else {
            JOptionPane.showMessageDialog((Component)null, "Conexión Fallida !!!..", "ERROR", 0);
            System.out.println("Conexion fallida!");
         }
      } catch (SQLException var3) {
         System.err.println("Error conexión test : " + var3.getMessage());
         JOptionPane.showMessageDialog((Component)null, "Conexión Fallida debido al codigo de error : " + var3.getErrorCode(), "ERROR", 0);
      }

   }  
}
