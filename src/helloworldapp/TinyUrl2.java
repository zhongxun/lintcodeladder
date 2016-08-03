/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author v-xuzhon
 */
public class TinyUrl2 {

    private static final String URL_PREFIX = "http://tiny.url/";
    private HashMap<Long, String> map = new HashMap<Long, String>();
    private HashMap<String, Long> mapUrl = new HashMap<String, Long>();
    private HashMap<String, String> mapCusLS = new HashMap<String, String>();
    private HashMap<String, String> mapCusSL = new HashMap<String, String>();
    private static final char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private Long cnt = 0L;

    /**
     * @param long_url a long url
     * @param a short key
     * @return a short url starts with http://tiny.url/
     */
    String createCustom(String long_url, String short_key) {
        // Write your code here
        if (mapCusLS.containsKey(long_url) && mapCusSL.containsKey(short_key)) {
            return URL_PREFIX + mapCusLS.get(long_url);
        }

        if (!mapCusLS.containsKey(long_url) && !mapCusSL.containsKey(short_key)) {
            mapCusLS.put(long_url, short_key);
            mapCusSL.put(short_key, long_url);
            return URL_PREFIX + short_key;
        } else {
            return "error";
        }
    }

    /**
     * @param url a long url
     * @return a short url starts with http://tiny.url/
     */
    public String longToShort(String url) {

        if (mapCusLS.containsKey(url)) {
            return URL_PREFIX + mapCusLS.get(url);
        }

        // Write your code here
        if (!mapUrl.containsKey(url)) {
            this.cnt++;
            mapUrl.put(url, this.cnt);
            map.put(this.cnt, url);
        }

        Long cnt = mapUrl.get(url);
        String s = "";
        while (cnt > 0) {
            int pos = (int) (cnt % 62);
            s = chars[pos] + s;
            cnt = cnt / 62;
        }

        for (int i = s.length(); i < 6; i++) {
            s = 'a' + s;
        }

        return URL_PREFIX + s;
    }

    /**
     * @param url a short url starts with http://tiny.url/
     * @return a long url
     */
    public String shortToLong(String url) {
        // Write your code here
        url = url.replace(URL_PREFIX, "");

        if (mapCusSL.containsKey(url)) {
            return mapCusSL.get(url);
        }

        Long pos = 0L;
        for (char c : url.toCharArray()) {
            pos = pos * 62L + getPos(c);
        }

        if (map.containsKey(pos)) {
            return map.get(pos);
        }

        return "wrong";
    }

    private int getPos(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0' + 52;
        } else if (c >= 'a' && c <= 'z') {
            return c - 'a';

        } else if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 26;
        } else {
            return -1;
        }
    }

    private void T() {
        String r = createCustom("http://www.lintcode.com/", "lccode");
        System.out.println(r);
        r = longToShort("http://www.lintcode.com/problem/");
        System.out.println(r);
        r = shortToLong("http://tiny.url/lccode");
        System.out.println(r);
        r = createCustom("http://www.lintcode.com/", "lc");
        System.out.println(r);
        r = createCustom("http://www.lintcode.com/en/ladder/", "lccode");
        System.out.println(r);
//        String r = shortToLong(longToShort("http://www.lintcode.com/faq/?id=10"));
//        System.out.println(r);
    }

    public static void Test() {
        TinyUrl2 t = new TinyUrl2();
        t.T();
    }
}
