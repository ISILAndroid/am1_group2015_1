package com.isil.lesson8.applesson8.model.entity;

import java.io.Serializable;

/**
 * Created by Profesor on 06/06/2015.
 */
public class ProductEntity implements Serializable {

    private int id;
    private String name;
    private float price;


    public ProductEntity(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
