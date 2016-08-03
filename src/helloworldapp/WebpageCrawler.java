/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Thread;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class CrawlerThread extends Thread {

    private static BlockingQueue<String> queue = new LinkedBlockingQueue<String>();

    private static HashMap<String, Boolean> mp = new HashMap<String, Boolean>();
    private static List<String> results = new ArrayList<String>();

    public static void setFirstUrl(String url) {
        try {
            queue.put(url);
        } catch (InterruptedException e) {
            // e.printStackTrace(); 
        }
    }

    public static List<String> getResults() {
        return results;
    }

    @Override
    public void run() {
        while (true) {
            String url = "";
            try {
                url = queue.take();
            } catch (Exception e) {
                // e.printStackTrace(); 
                break;
            }

            String domain = "";
            try {
                URL netUrl = new URL(url);
                domain = netUrl.getHost();
            } catch (MalformedURLException e) {
                // e.printStackTrace(); 
            }
            if (!mp.containsKey(url) && domain.endsWith("wikipedia.org")) {
                mp.put(url, true);
                results.add(url);
                List<String> urls = HtmlHelper.parseUrls(url);
                for (String u : urls) {
                    try {
                        queue.put(u);
                    } catch (InterruptedException e) {
                        // e.printStackTrace(); 
                    }
                }
            }
        }
    }
}

/**
 *
 * @author v-xuzhon
 */
public class WebpageCrawler {

    /**
     * @param url a url of root page
     * @return all urls
     */
    public List<String> crawler(String url) {
        // Write your code here
        CrawlerThread.setFirstUrl(url);
        CrawlerThread[] thread_pools = new CrawlerThread[7];
        for (int i = 0; i < 7; ++i) {
            thread_pools[i] = new CrawlerThread();
            thread_pools[i].start();
        }

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }

        for (int i = 0; i < 7; ++i) {
            //thread_pools[i].interrupt();
            thread_pools[i].stop();
        }

        List<String> results = CrawlerThread.getResults();
        return results;
    }

    private void T() {
        String url = "\"http://www.wikipedia.org/\": [\"http://www.wikipedia.org/help/\"]\n"
                + "\"http://www.wikipedia.org/help/\": []";
        List<String> r = crawler(url);
        System.out.println(r);
    }

    public static void Test() {
        WebpageCrawler w = new WebpageCrawler();
        w.T();
    }
}
