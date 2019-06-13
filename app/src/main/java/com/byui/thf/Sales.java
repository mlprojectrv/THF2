package com.byui.thf;

import java.util.Date;

public class Sales {

    // Defalt constructor
    Sales() {
        product_id = new Product_id();
        price_id = new Price_id();
        account_id = new Account_id();
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
    public float calShippingCost;
    public int created_by;
}
