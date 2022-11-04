package com.example.trabajo1ud;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Muebles implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private Integer id;
    String nombre;
    String Descripción;
    int altura;
    int anchura;

    String Url;

   /* public Muebles(String nombre, String descripción, String url) {
        this.nombre = nombre;
        Descripción = descripción;
        Url = url;
    }*/
   public Integer getId() {
       return id;
   }

    public void setId(Integer id) {
        this.id = id;
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        Descripción = descripción;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "nombre='" + nombre + '\'' +
                ", Descripción='" + Descripción + '\'' +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", Url='" + Url + '\'' +
                '}';
    }
}
