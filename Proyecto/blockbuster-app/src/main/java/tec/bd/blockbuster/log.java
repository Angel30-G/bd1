/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.blockbuster;

import java.util.Date;

/**
 *
 * @author pc
 */
public class log {
    private int id;
    
    private String table_names;
    
    private Date created_on;
    
    private String entry_text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTable_names() {
        return table_names;
    }

    public void setTable_names(String table_names) {
        this.table_names = table_names;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public String getEntry_text() {
        return entry_text;
    }

    public void setEntry_text(String entry_text) {
        this.entry_text = entry_text;
    }

}
