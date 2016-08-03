/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author v-xuzhon
 */
public class InvertedIndex {

    /**
     * @param docs a list of documents
     * @return an inverted index
     */
    public Map<String, List<Integer>> invertedIndex(List<Document> docs) {
        // Write your code here
        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        for (Document doc : docs) {
            String[] split = doc.content.split(" ");
            for (String s : split) {
                if (s.isEmpty()) {
                    continue;
                }
                
                if (!map.containsKey(s)) {
                    map.put(s, new ArrayList<Integer>());
                }

                if (!map.get(s).contains(doc.id)) {
                    map.get(s).add(doc.id);
                }
            }
        }

        return map;
    }

    private void T() {
        Document d1 = new Document();
        d1.id = 1;
        d1.content = "This is  the content of document1";

        Document d2 = new Document();
        d2.id = 2;
        d2.content = "This is the       content of document3";
        List<Document> docs = new ArrayList<Document>();
        docs.add(d1);
        docs.add(d2);
        Map<String, List<Integer>> r = invertedIndex(docs);
        System.out.println(r);
    }

    public static void Test() {
        InvertedIndex i = new InvertedIndex();
        i.T();
    }
}
