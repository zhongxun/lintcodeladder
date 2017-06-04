/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;

/**
 *
 * @author v-xuzhon
 */
public class SimplifyPath {

  public String simplifyPath(String path) {
    StringBuilder sb = new StringBuilder();
    sb.append("/");
    String[] stubs = path.split("/");
    ArrayList<String> paths = new ArrayList<String>();
    
    for (String s : stubs) {
      if (s.equals("..")) {
        if (paths.size() > 0) {
          paths.remove(paths.size() - 1);
        }
      } else if (!s.equals(".") && !s.equals("")) {
        paths.add(s);
      }
    }
    
     for (String s : paths) {
      sb.append(s + "/");
    }

    if (sb.length() > 1) {
      sb.deleteCharAt(sb.length() - 1);
    }
    return sb.toString();
  }
}
