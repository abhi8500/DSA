package org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.external;

import org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.SocialMediaAdapter;
import org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.SocialMediaPost;

import java.util.ArrayList;
import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter {

    FacebookApi facebookApi = new FacebookApi();

    @Override
    public List<SocialMediaPost> getSocialMediaPosts(Long userId, Long timestamp) {

        List<FacebookPost> facebookPosts = facebookApi.fetchFacebookPosts(userId,timestamp);

        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();

        facebookPosts.forEach( post -> {
            socialMediaPosts.add(SocialMediaPost.getBuilder()
                    .id(post.getId()).post(post.getStatus())
                    .userId(post.getUserId()).timestamp(post.getTimestamp()).build());
        });

        return socialMediaPosts;
    }

    @Override
    public void post(Long userId, String post) {
        facebookApi.postFacebookStatus(userId,post);
    }
}
