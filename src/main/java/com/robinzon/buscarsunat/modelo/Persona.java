/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robinzon.buscarsunat.modelo;

/**
 *
 * @author Matteo
 */
public class Persona {
   private String nombre;
   private String tipoDocumento;
   private String numeroDocumento;
   private String estado;
   private String condicion;
   private String direccion;
   private String ubigeo;
   private String viaTipo;
   private String viaNombre;
   private String zonaCodigo;
   private String zonaTipo;
   private String numero;
   private String interior;
   private String lote;
   private String dpto;
   private String manzana;
   private String kilometro;
   private String distrito;
   private String provincia;
   private String departamento;
   private String apellidoPaterno;
   private String apellidoMaterno;
   private String nombres;

   public String toString() {
      return "Nombre=" + this.nombre + "\n tipoDocumento=" + this.tipoDocumento + "\n DNI=" + this.numeroDocumento + "\n estado=" + this.estado + "\n condicion=" + this.condicion + "\n direccion=" + this.direccion + "\n ubigeo=" + this.ubigeo + "\n apellidoPaterno=" + this.apellidoPaterno + "\n apellidoMaterno=" + this.apellidoMaterno + "\n nombres=" + this.nombres;
   }

   public Persona() {
   }

   public Persona(String nombre, String tipoDocumento, String numeroDocumento, String estado, String condicion, String direccion, String ubigeo, String viaTipo, String viaNombre, String zonaCodigo, String zonaTipo, String numero, String interior, String lote, String dpto, String manzana, String kilometro, String distrito, String provincia, String departamento, String apellidoPaterno, String apellidoMaterno, String nombres) {
      this.nombre = nombre;
      this.tipoDocumento = tipoDocumento;
      this.numeroDocumento = numeroDocumento;
      this.estado = estado;
      this.condicion = condicion;
      this.direccion = direccion;
      this.ubigeo = ubigeo;
      this.viaTipo = viaTipo;
      this.viaNombre = viaNombre;
      this.zonaCodigo = zonaCodigo;
      this.zonaTipo = zonaTipo;
      this.numero = numero;
      this.interior = interior;
      this.lote = lote;
      this.dpto = dpto;
      this.manzana = manzana;
      this.kilometro = kilometro;
      this.distrito = distrito;
      this.provincia = provincia;
      this.departamento = departamento;
      this.apellidoPaterno = apellidoPaterno;
      this.apellidoMaterno = apellidoMaterno;
      this.nombres = nombres;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getTipoDocumento() {
      return this.tipoDocumento;
   }

   public void setTipoDocumento(String tipoDocumento) {
      this.tipoDocumento = tipoDocumento;
   }

   public String getNumeroDocumento() {
      return this.numeroDocumento;
   }

   public void setNumeroDocumento(String numeroDocumento) {
      this.numeroDocumento = numeroDocumento;
   }

   public String getEstado() {
      return this.estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

   public String getCondicion() {
      return this.condicion;
   }

   public void setCondicion(String condicion) {
      this.condicion = condicion;
   }

   public String getDireccion() {
      return this.direccion;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   public String getUbigeo() {
      return this.ubigeo;
   }

   public void setUbigeo(String ubigeo) {
      this.ubigeo = ubigeo;
   }

   public String getViaTipo() {
      return this.viaTipo;
   }

   public void setViaTipo(String viaTipo) {
      this.viaTipo = viaTipo;
   }

   public String getViaNombre() {
      return this.viaNombre;
   }

   public void setViaNombre(String viaNombre) {
      this.viaNombre = viaNombre;
   }

   public String getZonaCodigo() {
      return this.zonaCodigo;
   }

   public void setZonaCodigo(String zonaCodigo) {
      this.zonaCodigo = zonaCodigo;
   }

   public String getZonaTipo() {
      return this.zonaTipo;
   }

   public void setZonaTipo(String zonaTipo) {
      this.zonaTipo = zonaTipo;
   }

   public String getNumero() {
      return this.numero;
   }

   public void setNumero(String numero) {
      this.numero = numero;
   }

   public String getInterior() {
      return this.interior;
   }

   public void setInterior(String interior) {
      this.interior = interior;
   }

   public String getLote() {
      return this.lote;
   }

   public void setLote(String lote) {
      this.lote = lote;
   }

   public String getDpto() {
      return this.dpto;
   }

   public void setDpto(String dpto) {
      this.dpto = dpto;
   }

   public String getManzana() {
      return this.manzana;
   }

   public void setManzana(String manzana) {
      this.manzana = manzana;
   }

   public String getKilometro() {
      return this.kilometro;
   }

   public void setKilometro(String kilometro) {
      this.kilometro = kilometro;
   }

   public String getDistrito() {
      return this.distrito;
   }

   public void setDistrito(String distrito) {
      this.distrito = distrito;
   }

   public String getProvincia() {
      return this.provincia;
   }

   public void setProvincia(String provincia) {
      this.provincia = provincia;
   }

   public String getDepartamento() {
      return this.departamento;
   }

   public void setDepartamento(String departamento) {
      this.departamento = departamento;
   }

   public String getApellidoPaterno() {
      return this.apellidoPaterno;
   }

   public void setApellidoPaterno(String apellidoPaterno) {
      this.apellidoPaterno = apellidoPaterno;
   }

   public String getApellidoMaterno() {
      return this.apellidoMaterno;
   }

   public void setApellidoMaterno(String apellidoMaterno) {
      this.apellidoMaterno = apellidoMaterno;
   }

   public String getNombres() {
      return this.nombres;
   }

   public void setNombres(String nombres) {
      this.nombres = nombres;
   }  
}
