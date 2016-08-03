/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.awt.PageAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class MiniCassandra {

    private HashMap<String, HashMap<Integer, String>> map;

    public MiniCassandra() {
        // initialize your data structure here.
        this.map = new HashMap<>();        
    }

    /**
     * @param raw_key a string
     * @param column_start an integer
     * @param column_end an integer
     * @return void
     */
    public void insert(String raw_key, int column_key, String column_value) {
        // Write your code here
        if (!map.containsKey(raw_key)) {
            map.put(raw_key, new HashMap<Integer, String>());
        }

        map.get(raw_key).put(column_key, column_value);        
    }

    /**
     * @param raw_key a string
     * @param column_start an integer
     * @param column_end an integer
     * @return a list of Columns
     */
    public List<Column> query(String raw_key, int column_start, int column_end) {
        // Write your code here
        List<Column> res = new ArrayList<Column>();
        if (map.containsKey(raw_key)) {
            HashMap<Integer, String> c = map.get(raw_key);
            
            for (Integer i : c.keySet()) {
                if (i >= column_start && i <= column_end) {
                    res.add(new Column(i, c.get(i)));
                }
            }
        }

        Collections.sort(res, new Comparator<Column>() {
            public int compare(Column c1, Column c2) {
                return c1.key - c2.key;
            }
        });

        return res;
    }

    private void T() {
        insert("google", 1, "haha");
        insert("lintcode", 1, "Good");
        insert("google", 2, "hehe");
        List<Column> r = query("google", 0, 1);
        r = query("google", 0, 2);
        r = query("go", 0, 1);
        r = query("lintcode", 0, 10);
//        insert("google", 1, "haha");
//        List<Column> r = query("google", 0, 1);
//        System.out.println(r);
    }

    public static void Test() {
        MiniCassandra m = new MiniCassandra();
        m.T();
    }
}
