package com.kb.manager.entity;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderDate;
    private int orderNumber;
    private String shipName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String shipDate;
    private int shipPhoneNumber;
    private double unitPrice;
    private int quantity ;
    private int discount;
    private int saleTax;
    private double lineTotal;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Products products;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Services services;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Employee employee;



    public Orders() {
    }

    public Orders(String orderDate, int orderNumber, String shipName, String address, String city, String state, int zip, String shipDate, int shipPhoneNumber, double unitPrice, int quantity, int discount, int saleTax, double lineTotal, Products products, Services services, Customer customer, Employee employee) {
        this.orderDate = orderDate;
        this.orderNumber = orderNumber;
        this.shipName = shipName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.shipDate = shipDate;
        this.shipPhoneNumber = shipPhoneNumber;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.saleTax = saleTax;
        this.lineTotal = lineTotal;
        this.products = products;
        this.services = services;
        this.customer = customer;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public int getShipPhoneNumber() {
        return shipPhoneNumber;
    }

    public void setShipPhoneNumber(int shipPhoneNumber) {
        this.shipPhoneNumber = shipPhoneNumber;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(int saleTax) {
        this.saleTax = saleTax;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderDate='" + orderDate + '\'' +
                ", orderNumber=" + orderNumber +
                ", shipName='" + shipName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", shipDate='" + shipDate + '\'' +
                ", shipPhoneNumber=" + shipPhoneNumber +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", saleTax=" + saleTax +
                ", lineTotal=" + lineTotal +
                '}';
    }
}


