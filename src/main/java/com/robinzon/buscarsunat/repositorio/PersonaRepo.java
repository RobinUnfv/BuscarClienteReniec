/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robinzon.buscarsunat.repositorio;

import com.robinzon.buscarsunat.factory.ConexionOracle;
import com.robinzon.buscarsunat.util.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matteo
 */
public class PersonaRepo {
    private boolean retorno = false;

   public boolean crearPersona(String cia, String noCliente, String tipoPersona, String tipoDocumento, String nuDocumento, String ruc, String nombre, String direccion, String ubigeo, String depa, String prov, String dist) {
      String query = "INSERT INTO CXC.ARCCMC(NO_CIA,NO_CLIENTE,ACTIVO,TIPO_PERSONA,EXTRANJERO,TIPO_DOCUMENTO,NU_DOCUMENTO,RUC,NOMBRE,DIRECCION,UBIGEO,CODI_DEPA,CODI_PROV,CODI_DIST,CLASE,COD_PAIS,COD_VEN_COB,TIPO_FPAGO,COD_FPAGO,TIPO_CLIENTE,GRUPO,MONEDA,LIMITE_CREDI_N,EXCENTO_IMP,USUARIO,IND_VAL,IND_TIENDAS,COD_CLASIF,COD_CATEG,IND_AGEN_RET,IND_BUEN_CON,IND_SIST_DEFR,COD_CALI,IND_RENOVACION,ORIGEN,IND_PROVE,TIPO_ENTI,COD_SUC,STATUS,CHEQUE_DIFERIDO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      String query2 = "INSERT INTO CXC.ARCCTDA(NO_CIA,NO_CLIENTE,COD_TIENDA,NOMBRE,DIRECCION,CODI_DEPA,CODI_PROV,CODI_DIST,TIPO_DIR,ACTIVO,COD_SUC,ESTAB_SUNAT) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

      try {
         Connection conexion = ConexionOracle.conectar( Utilidades.getValoresConexion() );
         PreparedStatement stmt = conexion.prepareStatement(query);
         stmt.setString(1, cia);
         stmt.setString(2, noCliente);
         stmt.setString(3, "S");
         stmt.setString(4, tipoPersona);
         stmt.setString(5, "N");
         stmt.setString(6, tipoDocumento);
         stmt.setString(7, nuDocumento);
         stmt.setString(8, ruc);
         stmt.setString(9, nombre);
         stmt.setString(10, direccion);
         stmt.setString(11, ubigeo);
         stmt.setString(12, depa);
         stmt.setString(13, prov);
         stmt.setString(14, dist);
         stmt.setString(15, "020");
         stmt.setString(16, "001");
         stmt.setString(17, "001");
         stmt.setString(18, "20");
         stmt.setString(19, "01");
         stmt.setString(20, "B");
         stmt.setString(21, "00");
         stmt.setString(22, "SOL");
         stmt.setString(23, "0");
         stmt.setString(24, "N");
         stmt.setString(25, "LLE");
         stmt.setString(26, "L");
         stmt.setString(27, "N");
         stmt.setString(28, "A");
         stmt.setString(29, "A");
         stmt.setString(30, "N");
         stmt.setString(31, "N");
         stmt.setString(32, "N");
         stmt.setString(33, "1");
         stmt.setString(34, "N");
         stmt.setString(35, "01");
         stmt.setString(36, "N");
         stmt.setString(37, "C");
         stmt.setString(38, "001");
         stmt.setString(39, "1");
         stmt.setString(40, "N");
         int p = stmt.executeUpdate();
 
         stmt.close();
         PreparedStatement stmt2 = conexion.prepareStatement(query2);
         stmt2.setString(1, cia);
         stmt2.setString(2, noCliente);
         stmt2.setString(3, "001");
         stmt2.setString(4, "LEGAL");
         stmt2.setString(5, direccion);
         stmt2.setString(6, depa);
         stmt2.setString(7, prov);
         stmt2.setString(8, dist);
         stmt2.setString(9, "LEG");
         stmt2.setString(10, "S");
         stmt2.setString(11, "001");
         stmt2.setString(12, "0000");
         int p2 = stmt2.executeUpdate();
         System.out.println("Estado de creación de direccón persona = " + p2);
         stmt2.close();
         this.retorno = true;
      } catch (SQLException var21) {
         System.out.println("Error de consulta si existe el cliente : " + var21.getMessage());        
      }

      return this.retorno;
   }
}
