package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.ProductSalesAnalysis;

class Sale {
    int productId;
    int quantity;
    int price;

    public Sale(int productId, int quantity, int price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
