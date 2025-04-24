/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robinzon.buscarsunat.controller;

import com.google.gson.Gson;
import com.robinzon.buscarsunat.modelo.Empresa;
import com.robinzon.buscarsunat.modelo.Persona;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author Matteo
 */
public class SunatController {
    
  public Empresa consultarRuc(String ruc) {
      Empresa empresa = null;

      try {
         URL url = new URL("https://api.apis.net.pe/v1/ruc?numero=" + ruc);
         HttpURLConnection conn = (HttpURLConnection)url.openConnection();
         conn.setRequestMethod("GET");
         conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
         if (conn.getResponseCode() != 200) {
            System.out.println(".:. ENTRO AL ERROR RUC .:.");
            JOptionPane.showMessageDialog((Component)null, "RUC invalido", "ERROR", 2);
         } else {
            InputStreamReader in = new InputStreamReader(conn.getInputStream(), "UTF-8");
            BufferedReader br = new BufferedReader(in);
            Gson gson = new Gson();
            empresa = (Empresa)gson.fromJson(br.readLine(), Empresa.class);
         }
      } catch (Exception var8) {
         System.out.println(var8.getMessage());
         var8.printStackTrace();
      }

      return empresa;
   }

   public Persona consultarDni(String dni) {
      Persona persona = null;

      try {
         URL url = new URL("https://api.apis.net.pe/v1/dni?numero=" + dni);
         HttpURLConnection conn = (HttpURLConnection)url.openConnection();
         conn.setRequestMethod("GET");
         conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
         if (conn.getResponseCode() != 200) {
            System.out.println(".::.ENTRO AL ERROR DNI.::.");
            JOptionPane.showMessageDialog((Component)null, "DNI invalido", "ERROR", 2);
         } else {
            InputStreamReader in = new InputStreamReader(conn.getInputStream(), "UTF-8");
            BufferedReader br = new BufferedReader(in);
            Gson gson = new Gson();
            persona = (Persona)gson.fromJson(br.readLine(), Persona.class);
         }
      } catch (Exception var8) {
         System.out.println(var8.getMessage());
         var8.printStackTrace();
      }

      return persona;
   }  
}
