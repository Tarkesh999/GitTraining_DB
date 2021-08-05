package com.p1;

public class Product {

    private String productName;
    private String productId;
    private int noOfProduct;

    public Product(String productName, String productId, int noOfProduct) {
        this.productName = productName;
        this.productId = productId;
        this.noOfProduct = noOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getNoOfProduct() {
        return noOfProduct;
    }

    public void setNoOfProduct(int noOfProduct) {
        this.noOfProduct = noOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", noOfProduct=" + noOfProduct +
                '}';
    }
}
