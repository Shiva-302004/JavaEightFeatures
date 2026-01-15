package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.ProductSalesAnalysis;

public class ProductSales {
    int productId;
    int tr;

    public ProductSales(int productId, int tr) {
        this.productId = productId;
        this.tr = tr;
    }

    public int getProductId() {
        return productId;
    }

    public int getTr() {
        return tr;
    }

    @Override
    public String toString() {
        return "ProductSales{" +
                "productId=" + productId +
                ", tr=" + tr +
                '}';
    }
}
