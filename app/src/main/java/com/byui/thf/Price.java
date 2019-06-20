package com.byui.thf;

import android.support.annotation.Nullable;

import java.util.Date;

public class Price extends JsonConvertible{
    private Date start_date;
    private Date end_date;
    private int amount;
    private boolean active;
    public static int primaryId;

    Price(){
        this.id = primaryId;
        increment();
    }

    // getters

    public int getPrice_id(){return id;}

    public Date getEnd_date(){ return end_date; }

    public Date getStart_date(){return start_date;}

    public boolean getActive(){return this.active;}

    public int getAmount(){return amount;}

    public int getPrimaryId(){return primaryId;}
    // setters

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setEnd_date(@Nullable Date end_date) {
        this.end_date = end_date;
        if (this.end_date == null){
            this.active = true;
        }
        else {
            this.active = false;
        }
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }


    private void increment(){
        primaryId++;
    }

}
