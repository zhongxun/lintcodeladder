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
public class RestoreIPAddresses {

    public ArrayList<String> restoreIpAddresses(String s) {
        // Write your code here
        ArrayList<String> result = new ArrayList<String>();
        
        if (s == null || s.length() == 0) {
            return result;
        }
        
        helper(s, new ArrayList<String>(), result);
        
        return result;
    }
    
    private void helper(String s, ArrayList<String> ips, ArrayList<String> result) {
        if ( s.length() == 0 && ips.size() == 4) {
            result.add(getIp(ips));
            return;
        }
        
        for (int i = 1; i < 4 && i <= s.length(); i++) {
            String ip = s.substring(0, i);
            if (isValid(ip) && (4 - ips.size()) * 3 > s.length() - i + 1) {
                ips.add(ip);
                helper(s.substring(i), ips, result);
                ips.remove(ips.size() - 1);
            }
        }
    }
    
    private String getIp(ArrayList<String> ips) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ips.size(); i++) {
            if (i != 0) {
                sb.append('.');
            }
            sb.append(ips.get(i));
        }
        
        return sb.toString();
    }
    
    private boolean isValid(String ip) {
        if (ip.length() > 1 && ip.charAt(0) == '0') {
            return false;
        }
        
        int i = Integer.valueOf(ip);
        return i >= 0 && i <= 255;
    }
}
