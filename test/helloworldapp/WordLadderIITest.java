/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sam
 */
public class WordLadderIITest {
    
    public WordLadderIITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testFindLadders() {
        System.out.println("findLadders");
        String start = "hit";
        String end = "cog";
        Set<String> dict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"));
        WordLadderII instance = new WordLadderII();
        List<List<String>> expResult =  new ArrayList<List<String>>();
        expResult.add(Arrays.asList("hit","hot","dot","dog","cog"));
        expResult.add(Arrays.asList("hit","hot","lot","log","cog"));

        List<List<String>> result = instance.findLadders(start, end, dict);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testDfs() {
        System.out.println("dfs");
        List<List<String>> ladders = null;
        List<String> path = null;
        String crt = "";
        String start = "";
        Map<String, Integer> distance = null;
        Map<String, List<String>> map = null;
        WordLadderII instance = new WordLadderII();
        instance.dfs(ladders, path, crt, start, distance, map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testBfs() {
        System.out.println("bfs");
        Map<String, List<String>> map = null;
        Map<String, Integer> distance = null;
        String start = "";
        String end = "";
        Set<String> dict = null;
        WordLadderII instance = new WordLadderII();
        instance.bfs(map, distance, start, end, dict);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testExpand() {
        System.out.println("expand");
        String crt = "";
        Set<String> dict = null;
        WordLadderII instance = new WordLadderII();
        List<String> expResult = null;
        List<String> result = instance.expand(crt, dict);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
