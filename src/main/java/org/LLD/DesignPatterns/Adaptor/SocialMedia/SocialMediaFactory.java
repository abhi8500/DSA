package org.LLD.DesignPatterns.Adaptor.SocialMedia;

import org.LLD.DesignPatterns.Adaptor.SocialMedia.external.FacebookAdapter;
import org.LLD.DesignPatterns.Adaptor.SocialMedia.external.TwitterAdapter;

public class SocialMediaFactory {

    public static SocialMediaAdapter createSocialMedia(String platform){

        if (platform.equals("facebook")){
            return new FacebookAdapter();
        } else if (platform.equals("twitter")) {
            return new TwitterAdapter();
        }else {
            throw new RuntimeException("Invalid platform");
        }

    }
}
