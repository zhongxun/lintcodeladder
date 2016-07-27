package helloworldapp;

import java.time.ZonedDateTime;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author v-xuzhon
 */
public class Tweet {

    public int id;
    public int user_id;
    public String text;
    public Date time;

    public static Tweet create(int user_id, String tweet_text) {
         // This will create a new tweet object,
        // and auto fill id
        Tweet res = new Tweet();
        res.user_id = user_id;
        res.text = tweet_text;
        ZonedDateTime zdt = ZonedDateTime.now();
        res.time = java.util.Date.from( zdt.toInstant() );
        return res;
    }
}