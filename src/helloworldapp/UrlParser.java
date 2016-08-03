/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author v-xuzhon
 */
public class UrlParser {

    private static final String HTML_HREF_TAG_PATTERN = "\\s*(?i)href\\s*=\\s*\"?'?([^\"'>\\s]*)"; //"<\\s*a\\s+.*?href\\s*=\\s*\"(\\S*?)\".*?>"
    /**
    /**
     * @param content source code
     * @return a list of links
     */
    public List<String> parseUrls(String content) {
        // Write your code here
        List<String> res = new ArrayList<String>();

        Pattern p = Pattern.compile(HTML_HREF_TAG_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(content);
        while (m.find()) {
            String s = m.group(1);
            if (s.length()== 0 || s.startsWith("#"))
            {
                continue;
            }
            res.add(m.group(1));
        }

        return res;
    }

    private void T() throws IOException {
        String content = readFile("D:\\Projects\\LintCodeLadder\\HelloWorldApp\\src\\helloworldapp\\data\\newhtml.html", Charset.defaultCharset());
        List<String> r = parseUrls(content);
        System.out.println(r);
    }

    private static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void Test() throws IOException {
        UrlParser u = new UrlParser();
        u.T();
    }
}
