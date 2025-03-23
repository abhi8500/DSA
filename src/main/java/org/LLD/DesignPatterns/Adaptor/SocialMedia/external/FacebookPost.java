package org.LLD.DesignPatterns.Adaptor.SocialMedia.external;

public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;

    public FacebookPost(String id, String status, Long userId, Long timestamp) {
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
