/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public abstract class OutputCollector<K, V> {
    public abstract void collect(K key, V value); // Adds a key/value pair to the output buffer
}
