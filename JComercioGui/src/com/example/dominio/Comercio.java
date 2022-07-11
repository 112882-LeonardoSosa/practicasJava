/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marti
 */
public class Comercio {
    private ArrayList<Articulo> articulos;

    public Comercio() {
        articulos = new ArrayList<>();
//        articulos.add(new Articulo("33","Lapicera"));
    }
    
    public void addArticulo(Articulo articulo){
        if(articulo != null)
            articulos.add(articulo);
    }
    
    public ArrayList<Articulo> obtenerTodos(){
        return articulos;
    }
    
    public void eliminarArticulo(int indice){
        
        articulos.remove(indice);
    }
    
    public Articulo getAticuloByIndex(int indice){
        return articulos.get(indice);
        
    }
}
