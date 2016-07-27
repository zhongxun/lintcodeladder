package helloworldapp;

/**
 * Definition of Tweet: public class Tweet { public int id; public int user_id;
 * public String text; public static Tweet create(int user_id, String
 * tweet_text) { // This will create a new tweet object, // and auto fill id } }
 */
import java.util.*;

public class MiniTwitter3 {

    private List<Tweet> tweets = new ArrayList<Tweet>();
    private List<Integer[]> friends = new ArrayList<>();

    public MiniTwitter3() {

        // initialize your data structure here.
    }

    // @param user_id an integer
    // @param tweet a string
    // return a tweet
    public Tweet postTweet(int user_id, String tweet_text) {
        //  Write your code here
        Tweet tweet = Tweet.create(user_id, tweet_text);
        tweets.add(tweet);
        return tweet;
    }

    // @param user_id an integer
    // return a list of 10 new feeds recently
    // and sort by timeline
    public List<Tweet> getNewsFeed(int user_id) {
        // Write your code here        

        int cnt = 10;
        List<Tweet> res = new ArrayList<Tweet>();
        for (int i = tweets.size() - 1; i >= 0; i--) {
            Tweet t = tweets.get(i);
            //for (Integer u : users) {
            res.add(t);
            cnt--;
            if (cnt == 0) {
                return res;
            }
            //}
        }
        /*  for (Tweet t : tweets) {
         for (Integer u : users) {
         if (u == t.user_id) {
         res.add(t);
         }
         }
         }
         */
        return res;
    }

    // @param user_id an integer
    // return a list of 10 new posts recently
    // and sort by timeline
    public List<Tweet> getTimeline(int user_id) {
        // Write your code here
        List<Tweet> res = new ArrayList<Tweet>();

        HashSet<Integer> users = new HashSet<>();
        users.add(user_id);
        for (Integer[] user : this.friends) {
            if (user[0] == user_id) {
                users.add(user[1]);
            }
        }

        int cnt = 10;
        for (int i = tweets.size() - 1; i >= 0; i--) {
            Tweet t = tweets.get(i);
            for (Integer u : users) {
                if (t.user_id == u) {
                    res.add(t);
                    cnt--;
                    if (cnt == 0) {
                        return res;
                    }
                }
            }
        }

        /*   List<Tweet> r = getNewsFeed(user_id);
         Tweet[] tmp = new Tweet[r.size()];
         r.toArray(tmp);

         int i = 10;
         for (int j = tmp.length - 1; j >= 0; j--) {
         res.add(tmp[j]);
         i--;
         if (i == 0) {
         break;
         }
         }
         return r;*/
        return res;
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id follows to_user_id
    public void follow(int from_user_id, int to_user_id) {
        // Write your code here 
        Integer[] item = {from_user_id, to_user_id};
        this.friends.add(item);
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id unfollows to_user_id
    public void unfollow(int from_user_id, int to_user_id) {
        // Write your code here
        Integer[] remove = null;
        for (Integer[] item : this.friends) {
            if (item[0] == from_user_id && item[1] == to_user_id) {
                remove = item;
                break;
            }
        }

        if (remove != null) {
            friends.remove(remove);
        }
    }

    public void Test() {
        postTweet(1, "LintCode is Good!!!");
        getNewsFeed(1);
        getTimeline(1);
        follow(2, 1);
        follow(2, 3);
        postTweet(3, "LintCode is Cool!!!");
        postTweet(3, "How to do A + B problem?");
        postTweet(3, "I have accepted A + B problem.");
        postTweet(3, "I favorite A + B problem.");
        postTweet(1, "I favorite A + B problem too.");
        postTweet(2, "Nani?");
        postTweet(2, "I want to solve this problem now.");
        postTweet(3, "I want to solve this problem now.");
        postTweet(3, "The problem is so easy.");
        postTweet(1, "hehe.");
        postTweet(2, "Let's to do it together.");
        postTweet(2, "haha");
        List<Tweet> res = getNewsFeed(2);
        for (Tweet a : res) {
            System.out.println(a.id);
        }
        getTimeline(2);
        getNewsFeed(1);
        follow(1, 2);
        getNewsFeed(1);
        follow(1, 3);
        getNewsFeed(1);
        unfollow(2, 1);
        getNewsFeed(2);

    }
}
