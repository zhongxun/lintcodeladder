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
public class TinyUrl {

    private static final String URL_PREFIX = "http://tiny.url/";
    private HashMap<Long, String> map = new HashMap<Long, String>();
    private HashMap<String, Long> mapUrl = new HashMap<String, Long>();
    private static final char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private Long cnt = 0L;

    /**
     * @param url a long url
     * @return a short url starts with http://tiny.url/
     */
    public String longToShort(String url) {
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
        Long pos = 0L;
        for (char c : url.toCharArray()) {
            pos = pos * 62 + getPos(c);
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
        String r = shortToLong(longToShort("http://www.lintcode.com/faq/?id=10"));
        System.out.println(r);
    }

    public static void Test() {
        TinyUrl t = new TinyUrl();
        t.T();
    }
}
