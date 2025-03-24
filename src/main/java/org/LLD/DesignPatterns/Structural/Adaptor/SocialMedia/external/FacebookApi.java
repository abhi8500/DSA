package org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.external;

import java.util.List;

import static org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.external.ApiUtils.logFacebookGetPosts;
import static org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia.external.ApiUtils.logFacebookPostStatus;

public class FacebookApi {

    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        logFacebookGetPosts();
        return List.of(new FacebookPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        logFacebookPostStatus();
    }
}
