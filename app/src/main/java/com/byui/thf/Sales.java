package com.byui.thf;

import java.util.Date;

public class Sales extends JsonConvertible {

    // Default constructor
    Sales() {
        product_id = 0;
        price_id = 0;
        account_id = 0;
    }

    public int sale_id;

    // objects
    private int product_id;
    private int price_id;
    private int account_id;
    public Date date;
    public int amount;
    public boolean discount;
    // shipping fee (float)
    private float shippingCost;
    private int created_by;

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

    //TODO getter and setter for account_id, price_id and product_id.

}
