package com.longtien.model;

public class Counter {
    private int count;

    public Counter(){
    }

    public Counter(int count){
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int incrementCount(){
        return count++;
    }
}
