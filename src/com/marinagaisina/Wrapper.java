package com.marinagaisina;

public class Wrapper<T> {
    private final T t;
    private int accessCount;

    public Wrapper(T t) {
        this.t = t;
    }
    public T getValue() {
        accessCount++;
        return t;
    }

    @Override
    public String toString() {
        return "Wrapper{"+
                "t="+t+
                " accessCount "+ accessCount+
                "}";
    }


}
