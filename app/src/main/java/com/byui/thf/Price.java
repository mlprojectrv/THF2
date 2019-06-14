package com.byui.thf;

import java.util.Date;

public class Price {
    private Date start_date;
    private Date end_date;
    private int amount;
    private int Price_id;

    public void setPrice_id(int price_id) {
        Price_id = price_id;
    }

    public int getPrice_id() {
        return Price_id;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
}
