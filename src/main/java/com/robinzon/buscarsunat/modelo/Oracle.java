/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robinzon.buscarsunat.modelo;

/**
 *
 * @author Matteo
 */
public class Oracle {
   private String usuario;
   private String password;
   private String host;
   private int puerto;
   private String sid;

   public Oracle() {
   }

   public Oracle(String usuario, String password, String host, int puerto, String sid) {
      this.usuario = usuario;
      this.password = password;
      this.host = host;
      this.puerto = puerto;
      this.sid = sid;
   }

   public String getUsuario() {
      return this.usuario;
   }

   public void setUsuario(String usuario) {
      this.usuario = usuario;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getHost() {
      return this.host;
   }

   public void setHost(String host) {
      this.host = host;
   }

   public int getPuerto() {
      return this.puerto;
   }

   public void setPuerto(int puerto) {
      this.puerto = puerto;
   }

   public String getSid() {
      return this.sid;
   }

   public void setSid(String sid) {
      this.sid = sid;
   }

   public String tsname() {
      String cadena = this.getUsuario().trim() + "," + this.getPassword().trim() + "," + this.getHost().trim() + "," + String.valueOf(this.getPuerto()).trim() + "," + this.getSid().trim();
      return cadena;
   }  
}
