package com.marinagaisina;

import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {
    private UUID key;

    public Key() {
        key = UUID.randomUUID();
    }
    //copy
    public Key(Key original) {
        key = original.key;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Object clone() {
        return new Key(this);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Key o) {
        return key.compareTo(o.key);
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
        door.isLocked() = false;
        //door.unlock(true, )
    }
}
