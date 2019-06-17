package com.byui.thf;

import java.util.Date;

public class Sales {

    // Defalt constructor
    Sales() {
        product_id = new Product_id();
        price_id = new Price_id();
        account_id = new Account_id(null);
    }

    public int sale_id;

    // objects
    public Product_id product_id;
    public Price_id price_id;
    public Account_id account_id;

    public Date date;
    public int amount;
    public boolean discount;
    // shipping fee (float)
    public float shippingCost;
    public int created_by;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean getDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public float getshippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

}
