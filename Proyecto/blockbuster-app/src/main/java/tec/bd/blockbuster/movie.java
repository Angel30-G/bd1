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
    private int movieId;
    
    private String title;
    
     private int category;
    
    private Date release_date;
    
    private int unit_available;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
    
  

    public int getId() {
        return movieId;
    }

    public void setId(int id) {
        this.movieId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public int getUnit_available() {
        return unit_available;
    }

    public void setUnit_available(int unit_available) {
        this.unit_available = unit_available;
    }
    

    

}

