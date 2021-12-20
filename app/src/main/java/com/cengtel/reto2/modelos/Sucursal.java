package com.cengtel.reto2.modelos;

public class Sucursal {

    private int id;
    private String name;
    private String description;
    private String location;
    private String favorite;
    private byte[] image;

    public Sucursal(int id, String name, String description, String location, String favorite, byte[] image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.favorite = favorite;
        this.image = image;
    }

    public Sucursal() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public byte[] getImage() {
        return image;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
