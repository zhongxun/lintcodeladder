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
public class GraphValidTree {
//   {{0,1},{0,2},{0,3},{1,4}}

  class UnionFind {

    HashMap<Integer, Integer> father = new HashMap<Integer, Integer>();

    public UnionFind(int n) {
      for (int i = 0; i < n; i++) {
        father.put(i, i);
      }
    }

    int compressed_find(int x) {
      int parent = father.get(x);
      while (parent != father.get(parent)) {
        parent = father.get(parent);
      }
      int temp = -1;
      int fa = father.get(x);
      while (fa != father.get(fa)) {
        temp = father.get(fa);
        father.put(fa, parent);
        fa = temp;
      }
      return parent;
    }

    void union(int x, int y) {
      int xSet = compressed_find(x);
      int ySet = compressed_find(y);
      if (xSet != ySet) {
        father.put(xSet, ySet);
      }
    }
  }

  public boolean validTree(int n, int[][] edges) {
    if (n - 1 != edges.length) {
      return false;
    }

    UnionFind uf = new UnionFind(n);

    for (int i = 0; i < edges.length; i++) {
      if (uf.compressed_find(edges[i][0]) == uf.compressed_find(edges[i][1])) {
        return false;
      }
      uf.union(edges[i][0], edges[i][1]);
    }

    return true;
  }
}
