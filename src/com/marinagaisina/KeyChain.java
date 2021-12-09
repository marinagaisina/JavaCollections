package com.marinagaisina;

import java.util.*;

public class KeyChain {
    //private Set<Key> keys = new TreeSet<Key>();
    private HashMap<KeyShape, ArrayList<Key>> keys = new HashMap<>();

    public KeyChain() {}

    public KeyChain(Collection<Key> keys) {
        for (Key k : keys) {
            addKey(k);
        }
    }

    public boolean addKey(Key key) {
        if(!keys.containsKey(key.shape())) keys.put(key.shape(), new ArrayList<Key>());
        keys.get(key.shape()).add(key);
        return true;
    }
    public boolean removeKey(Key key) {
        if(keys.containsKey(key.shape())) {
            return keys.get(key.shape()).remove(key);
        }
        return false;
    }
    public int keyCount() {
        int keyCount = 0;
        for (KeyShape keyShape : keys.keySet()) {
            keyCount += keys.get(keyShape).size();
        }
        return keyCount;
    }
    public boolean lock(Door door) {
        if(door.isLocked()) {
            return true;
        }
        if(!door.hasKey()) return false; // door can not be locked
        if (!keys.containsKey(door.key().shape())) return false; // don't have a key
        for (Key k : keys.get(door.key().shape())) {
            if (door.lock(k)) {
                return true;
            }
        }
        return false; // no key that locks this door
    }
    public boolean unlock(Door door) {
        if(!door.isLocked()) {
            return true;
        }
        if(!door.hasKey()) return true; // Door is already unlocked
        if(!keys.containsKey(door.key().shape())) return false; // don't have a key
        for (Key k : keys.get(door.key().shape())) {
            if(door.unlock(k)) {
                return true;
            }
        }
        return false;// no key that unlocks this door
    }
}
