package com.tnz.app.domain;

import java.io.Serializable;

/**
 * Created by Admin on 3/10/16.
 */

public class Writer implements Serializable{

    private String material;

    public Writer(String material){
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Writer writer = (Writer) o;

        return material != null ? material.equals(writer.material) : writer.material == null;

    }

    @Override
    public int hashCode() {
        return material != null ? material.hashCode() : 0;
    }

    @Override
    public String toString(){
        return "Matrial Type: " + material;
    }
}
