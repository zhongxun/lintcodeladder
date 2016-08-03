/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.io.IOException;

/**
 *
 * @author v-xuzhon
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //System.out.println("test");         
        StandardBloomFilter.Test();
        RateLimiterJiuzhang.Test();
        RateLimiter.Test();
        WebLogger.Test();
        TinyUrl2.Test();
        TinyUrl.Test();
        WebpageCrawler.Test();
        TrieSerialization.Test();
        Trie.Test();
        UrlParser.Test();
        InvertedIndex.Test();
        LFUCache2.Test();
        MiniCassandra.Test();
        ConsistentHashingII.Test2();
        ConsistentHashingII.Test();
        ConsistentHashingII1.Test();
        Memcache.Test();
        ConsistentHashing.Test();
        MiniTwitter3 m = new MiniTwitter3();
        m.Test();
        /*      Tweet t = m.postTweet(1, "LintCode is Good!!!");
         System.out.println(t.text);
         List<Tweet> l = m.getNewsFeed(1);
         System.out.println("m.getNewsFeed(1):" + l.size());
         //_4Sum18.Test();
         List<Tweet> timeline = m.getTimeline(1);
         System.out.println("getTimeline(1);" + timeline.size());
         m.follow(2, 1);
         System.out.println("follow");
         l = m.getNewsFeed(2);
         System.out.println(" m.getNewsFeed(2);" + l.size());
         m.unfollow(2, 1);
         System.out.println("unfollow");
         l = m.getNewsFeed(2);
         System.out.println("getNewsFeed(2);"+l.size());
         */
    }
}
