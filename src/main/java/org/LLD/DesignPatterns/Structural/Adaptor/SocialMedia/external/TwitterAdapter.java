package org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.external;

import org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.SocialMediaAdapter;
import org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.SocialMediaPost;

import java.util.ArrayList;
import java.util.List;

public class TwitterAdapter implements SocialMediaAdapter {

    TwitterApi twitterApi = new TwitterApi();

    @Override
    public List<SocialMediaPost> getSocialMediaPosts(Long userId, Long timestamp) {

        List<TwitterTweet> tweets = twitterApi.getTweets(userId);

        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();

        tweets.forEach(post -> {
            socialMediaPosts.add(SocialMediaPost.getBuilder()
                    .id(post.getId()).post(post.getTweet())
                    .userId(post.getUserId()).build());
        });

        return socialMediaPosts;
    }

    @Override
    public void post(Long userId, String post) {
        twitterApi.tweet(userId, post);
    }
}
