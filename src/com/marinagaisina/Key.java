package com.marinagaisina;

import java.util.Objects;
import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {
    // private int key;
    private UUID key;
    private KeyShape shape = KeyShape.unknown;

    public Key() {
        key = UUID.randomUUID();
    }
    public Key(KeyShape shape) {
        this();
        this.shape = shape;
    }
    //copy
    public Key(Key original) {
        key = original.key;
        shape = original.shape;
    }
    public KeyShape shape() {
        return shape;
    }



    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

// clone

    @Override
    public Object clone() {
        return new Key(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {

            return false;
        }
        Key key1 = (Key) obj;
        return key.equals(key1.key);
    }

    @Override
    public int compareTo(Key o) {
        return key.compareTo(o.key);
    }

    @Override
    public String toString() {
        return key.toString();
    }

    public static void main(String[] args) {
        //default constructor that makes a random key
        Key key = new Key();
        System.out.println(key);
        //makes a copy of an original
        Key spareKey = new Key(key);
        System.out.println(spareKey);
        //clones the original
        Key otherSpare = (Key)key.clone();
        Door door = new Door(key);
        //door.isLocked() = false;
        //door.unlock(true, )
    }
}
