package com.codegym.reactjss3.model.lego;

import javax.persistence.*;

@Entity
public class Lego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String price;

    private String releaseYear;

    private String numberOfPieces;

    private Integer saleOff;

    private Integer quantity;

    @Column(columnDefinition = "text")
    private String imageUrl;

    @Column(columnDefinition = "text")
    private String imageBox;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    public Lego() {
    }

    public Lego(Integer id, String name, String price, String releaseYear, String numberOfPieces, Integer saleOff, Integer quantity, String imageUrl, String imageBox, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.releaseYear = releaseYear;
        this.numberOfPieces = numberOfPieces;
        this.saleOff = saleOff;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
        this.imageBox = imageBox;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(String numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    public Integer getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(Integer saleOff) {
        this.saleOff = saleOff;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageBox() {
        return imageBox;
    }

    public void setImageBox(String imageBox) {
        this.imageBox = imageBox;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
