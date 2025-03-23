package org.LLD.DesignPatterns.Adaptor.SocialMedia;


public class SocialMediaPost {

    private String id;
    private String post;
    private Long userId;
    private Long timestamp;

    private SocialMediaPost(){

    }

    private SocialMediaPost(Builder builder) {
        this.id = builder.id;
        this.post = builder.post;
        this.userId = builder.userId;
        this.timestamp = builder.timestamp;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String post;
        private Long userId;
        private Long timestamp;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder post(String post) {
            this.post = post;
            return  this;
        }

        public Builder userId(Long userId){
            this.userId = userId;
            return this;
        }

        public Builder timestamp(Long timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public SocialMediaPost build(){
            return new SocialMediaPost(this);
        }

    }
}
