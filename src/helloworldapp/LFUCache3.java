/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author v-xuzhon
 */
public class LFUCache3 {
    private class CacheEntry {
      public CacheEntry prev;
      public CacheEntry next;
      public int key;
      public int value;
      public int frequence;
      
      public CacheEntry(int key, int value) {
        this.key = key;
        this.value = value;
        this.frequence = 0;
      }
    }
    
    private class Entry {
      public CacheEntry head;
      public CacheEntry tail;
      public int size;
      
      public Entry(CacheEntry head, CacheEntry tail) {
        this.head = head;
        this.tail = tail;
        this.size = 0;
      }
    }
    
    private Map<Integer, CacheEntry> cache;
    private ArrayList<Entry> list;
    private int capacity;
    private int size;
    private int maxFrequence;
    // @param capacity, an integer
    public LFUCache3(int capacity) {
        // Write your code here
        this.capacity = capacity;
        this.cache = new HashMap<Integer, CacheEntry>();
        this.list = new ArrayList<Entry>(this.capacity * 2);
        this.maxFrequence = 0;
        this.size = 0;
        
        for (int i = 0; i < this.capacity * 2; i++) {
          CacheEntry head = new CacheEntry(-1, -1);
          CacheEntry tail = new CacheEntry(-1, -1);
          head.next = tail;
          tail.prev = head;
          this.list.add(new Entry(head, tail));
        }
    }

    // @param key, an integer
    // @param value, an integer
    // @return nothing
    public void set(int key, int value) {
        // Write your code here
        if (this.get(key) == -1){
          CacheEntry entry = new CacheEntry(key, value);
          size++;
          if (size > this.capacity) {
            // delete lease used one
            for (int i = 0; i < this.maxFrequence; i++) {
              if (this.list.get(i).size > 0) {
                Entry en = this.list.get(i);
                CacheEntry remove = en.head.next;
                this.cache.remove(remove.key);
                en.head.next = en.head.next.next;
                en.head.next.prev = en.head;
                en.size = en.size - 1;
                break;
              }
            }
          }
          
          updateFrequence(entry);
          
          this.cache.put(key, entry);
          return;
        }
        
        CacheEntry entry = this.cache.get(key);
        entry.value = value;
    }

    public int get(int key) {
        // Write your code here
        if (!cache.containsKey(key)) {
          return -1;
        }
        
        CacheEntry entry = cache.get(key);
        entry.frequence = entry.frequence + 1;
        
        updateFrequence(entry);
        
        return entry.value;
    }
    
    private void updateFrequence(CacheEntry entry) {
      int frequence = entry.frequence;
      
      if (frequence == this.capacity) {
        return;
      }
      // remove from current list
      Entry en = this.list.get(frequence);
      if (en.size != 0) {
        entry.prev.next = entry.next;
        entry.next.prev = entry.prev;
        en.size = en.size - 1;
      }
      // add to new list
      frequence++;
      en = this.list.get(frequence);
      en.tail.prev.next = entry;
      entry.prev = en.tail.prev;
      entry.next = en.tail;
      en.tail.prev = entry;
      en.size = en.size + 1;
      
      this.maxFrequence = Math.max(this.maxFrequence, frequence);
    }  
}
