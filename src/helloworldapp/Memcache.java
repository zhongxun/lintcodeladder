/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;

/**
 *
 * @author v-xuzhon
 */
public class Memcache {

    class Resource {

        public Integer value;
        public Integer ttl;
        public Integer lastTime;

        public Resource(Integer value, Integer ttl, Integer lastTime) {
            this.value = value;
            this.ttl = ttl;
            this.lastTime = lastTime;
        }
    }
    private final HashMap<Integer, Resource> client = new HashMap<>();

    public Memcache() {
        // Initialize your data structure here.
    }

    public int get(int curtTime, int key) {
        // Write your code here
        if (isValid(curtTime, key)) {
            return client.get(key).value;
        }
        return Integer.MAX_VALUE;
    }

    public void set(int curtTime, int key, int value, int ttl) {
        // Write your code here
        client.put(key, new Resource(value, ttl, curtTime));
    }

    public void delete(int curtTime, int key) {
        // Write your code here
        if (client.containsKey(key)) {
            client.remove(key);
        }
    }

    public int incr(int curtTime, int key, int delta) {
        // Write your code here
        if (isValid(curtTime, key)) {
            client.get(key).value += delta;
            return get(curtTime, key);
        }
        return Integer.MAX_VALUE;
    }

    public int decr(int curtTime, int key, int delta) {
        // Write your code here
        if (isValid(curtTime, key)) {
            client.get(key).value -= delta;
            return get(curtTime, key);
        }
        return Integer.MAX_VALUE;
    }

    private boolean isValid(int curtTime, int key) {
        if (client.containsKey(key)) {
            Resource v = client.get(key);
            if (v.ttl == 0) {
                return true;
            } else {
                return v.ttl + v.lastTime - 1 >= curtTime;
            }
        }
        return false;
    }

    private void Test2() {
        Integer r = get(1, 0);
        System.out.println(r);
        set(2, 1, 1, 2);
        r = get(3, 1);
        System.out.println(r);
        r = get(4, 1);
        System.out.println(r);
        r = incr(5, 1, 1);
        System.out.println("incr 5,1 " + r);
        set(6, 1, 3, 0);
        r = incr(7, 1, 1);
        System.out.println(r);
        r = decr(8, 1, 1);
        System.out.println(r);
        r = get(9, 1);
        System.out.println(r);
        delete(10, 1);
        r = get(11, 1);
        System.out.println(r);
        r = incr(12, 1, 1);
        System.out.println(r);
    }

    public static void Test() {
        Memcache m = new Memcache();
        m.Test2();
//        Integer r = m.get(1, 0);
//        System.out.println(r);
//        m.set(2, 1, 1, 2);
//        r = m.get(3, 1);
//        System.out.println(r);
//        r = m.get(4, 1);
//        System.out.println(r);
//        r = m.incr(5, 1, 1);
//        System.out.println("incr 5,1 " + r);
//        m.set(6, 1, 3, 0);
//        r = m.incr(7, 1, 1);
//        System.out.println(r);
//        r = m.decr(8, 1, 1);
//        System.out.println(r);
//        r = m.get(9, 1);
//        System.out.println(r);
//        m.delete(10, 1);
//        r = m.get(11, 1);
//        System.out.println(r);
//        r = m.incr(12, 1, 1);
//        System.out.println(r);
    }
}
