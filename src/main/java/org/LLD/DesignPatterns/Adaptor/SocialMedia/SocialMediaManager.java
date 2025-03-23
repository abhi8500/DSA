package org.LLD.DesignPatterns.Adaptor.SocialMedia;

public class SocialMediaManager {

    private SocialMediaAdapter socialMediaAdapter;

    public void getMessages(Long userId, Long timestamp, String platform) {
        socialMediaAdapter = SocialMediaFactory.createSocialMedia(platform);
        socialMediaAdapter.getSocialMediaPosts(userId, timestamp);
    }

    public void post(Long userId, String post, String platform) {
        socialMediaAdapter = SocialMediaFactory.createSocialMedia(platform);
        socialMediaAdapter.post(userId, post);
    }
}
