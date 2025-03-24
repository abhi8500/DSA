package org.LLD.DesignPatterns.Structural.Adaptor.SocialMedia;

import java.util.List;

public interface SocialMediaAdapter {


    List<SocialMediaPost> getSocialMediaPosts(Long userId, Long timestamp);

    void post(Long userId,String post);
}
