/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster;

import java.util.Date;
import java.util.Locale.Category;

/**
 *
 * @author pc
 */
public class movie {
    private int id;
    
    private String titulo;
    
    private Category category;
    
    private Date fecha_lanzamiento;
    
    private int unit_available;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public int getUnit_available() {
        return unit_available;
    }

    public void setUnit_available(int unit_available) {
        this.unit_available = unit_available;
    }

    public void setCategory(tec.bd.blockbuster.Category category) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

