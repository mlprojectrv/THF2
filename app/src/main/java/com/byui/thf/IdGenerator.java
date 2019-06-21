package com.byui.thf;

public class IdGenerator {
    private int id;

    IdGenerator(){id = 0;}

    private void setId(int id){
        this.id = id;
    }

    private void increment(int increment){
        setId(id + increment);
    }

    public int getId(){return id;}

    public int generateID(){
        increment(1);
        return getId();
    }
}
