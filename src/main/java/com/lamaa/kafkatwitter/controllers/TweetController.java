package com.lamaa.kafkatwitter.controllers;

import com.lamaa.kafkatwitter.models.Tweet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TweetController {
    

    @GetMapping("/get")
    public Tweet getTweet() {
        Tweet tweet = new Tweet();
        tweet.setId(1);
        tweet.setMessage("This my first tweet");
        return tweet;
    }
}
