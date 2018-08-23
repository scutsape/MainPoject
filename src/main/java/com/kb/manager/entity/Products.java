package com.kb.manager.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String productModel;
    private String productDescription;
    private String serialNumber;
    private double unitPrice;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Categories categories;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Supplier supplier;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "products")
    private List<Orders> orders = new ArrayList<Orders>()  ;

    public Products() {
    }

    public Products(String brand,String productModel, String productDescription, String serialNumber, double unitPrice, Categories categories, Supplier supplier) {
        this.brand = brand;
        this.productModel = productModel;
        this.productDescription = productDescription;
        this.serialNumber = serialNumber;
        this.unitPrice = unitPrice;
        this.categories = categories;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", unitPrice=" + unitPrice +
                ", categories=" + categories +
                ", supplier=" + supplier +
                '}';
    }
}
