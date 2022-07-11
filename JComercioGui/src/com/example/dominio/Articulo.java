/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dominio;

/**
 *
 * @author marti
 */
public class Articulo {
    private String codigo;
    private String nombre;
    private float precio;
    private boolean oferta;
    private int stock;
    private String ubicacion;

    public Articulo() {
    }

    public Articulo(String codigo, String nombre, float precio, boolean oferta, int stock, String ubi) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.oferta = oferta;
        this.stock = stock;
        this.ubicacion = ubi;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    @Override
    public String toString(){
        return codigo + "|" + nombre + "(" + stock + ")";
    }

}
